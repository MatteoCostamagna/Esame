# uvicorn Database.main:app --reload --> x avviare le api
# http://127.0.0.1:8000/docs. Swagger


from fastapi import FastAPI
from pydantic import BaseModel
import sqlite3
 
app = FastAPI()

#Ho creato una classe utile per le api
class Data(BaseModel):
    id:int 
    anno:int 
    regione: str
    PercVarUnitLavoroPesca:float 
    PercValAggPesca:float 
    ProdInMiglEur:float 
    Posizione: str



from fastapi import FastAPI, HTTPException
from pydantic import BaseModel
import sqlite3
from typing import List, Optional

app = FastAPI()

# Funzione per creare la tabella se non esiste
def create_table():
    conn = sqlite3.connect('database.db')
    cursor = conn.cursor()
    cursor.execute('''
        CREATE TABLE IF NOT EXISTS data (
            id INTEGER PRIMARY KEY,
            anno INTEGER,
            regione TEXT,
            PercVarUnitLavoroPesca REAL,
            PercValAggPesca REAL,
            ProdInMiglEur REAL,
            Posizione TEXT
        )
    ''')
    conn.commit()
    conn.close()

create_table()

@app.post("/data", response_model=Data)
def create_data(data: Data):
    conn = sqlite3.connect('database.db')
    cursor = conn.cursor()
    cursor.execute(
        "INSERT INTO data (id, anno, regione, PercVarUnitLavoroPesca, PercValAggPesca, ProdInMiglEur, Posizione) VALUES (?, ?, ?, ?, ?, ?, ?)",
        (data.id, data.anno, data.regione, data.PercVarUnitLavoroPesca, data.PercValAggPesca, data.ProdInMiglEur, data.Posizione)
    )
    conn.commit()
    conn.close()
    return data

@app.get("/data", response_model=List[Data])
def read_all_datas():
    conn = sqlite3.connect('database.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM data")
    result = cursor.fetchall()
    conn.close()
    return [Data(id=row[0], anno=row[1], regione=row[2], PercVarUnitLavoroPesca=row[3], PercValAggPesca=row[4], ProdInMiglEur=row[5], Posizione=row[6]) for row in result]

@app.get("/data/filter", response_model=List[Data])
def filter_data(da_anno: int, a_anno: int):
    if a_anno < da_anno:
        raise HTTPException(status_code=400, detail="A ANNO deve essere maggiore o uguale a DA ANNO")
    
    conn = sqlite3.connect('database.db')
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM data WHERE anno >= ? AND anno <= ?", (da_anno, a_anno))
    result = cursor.fetchall()
    conn.close()
    return [Data(id=row[0], anno=row[1], regione=row[2], PercVarUnitLavoroPesca=row[3], PercValAggPesca=row[4], ProdInMiglEur=row[5], Posizione=row[6]) for row in result]

@app.put("/data", response_model=Data)
def update_data(data: Data):
    conn = sqlite3.connect('database.db')
    cursor = conn.cursor()
    cursor.execute(
        "UPDATE data SET anno=?, regione=?, PercVarUnitLavoroPesca=?, PercValAggPesca=?, ProdInMiglEur=?, Posizione=? WHERE id=?",
        (data.anno, data.regione, data.PercVarUnitLavoroPesca, data.PercValAggPesca, data.ProdInMiglEur, data.Posizione, data.id)
    )
    conn.commit()
    conn.close()
    return data

@app.delete("/data/{id}")
def delete_data(id: int):
    conn = sqlite3.connect('database.db')
    cursor = conn.cursor()
    
    # Cerca il record da eliminare per ID
    cursor.execute("SELECT * FROM data WHERE id = ?", (id,))
    data = cursor.fetchone()
    
    # Se il record non esiste, solleva un'eccezione HTTP 404
    if not data:
        raise HTTPException(status_code=404, detail=f"Record con ID {id} non trovato")
    
    # Elimina il record
    cursor.execute("DELETE FROM data WHERE id = ?", (id,))
    conn.commit()
    conn.close()
    
    return {"message": f"Record con ID {id} eliminato correttamente"}
