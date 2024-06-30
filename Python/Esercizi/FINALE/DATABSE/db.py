import pandas as pd
import sqlite3


# Creazione di una connessione al database (o lo crea se non esiste)
conn = sqlite3.connect('database.db')

# Creazione di un cursore per eseguire comandi SQL
cursor = conn.cursor()


# Creazione della tabella "data" --> che contiene i dati del vino
cursor.execute('''
    CREATE TABLE IF NOT EXISTS data (
        id INTEGER
        anno INTEGER,
        regione CHAR,
        Variazione_percentuale_unità_di_lavoro_della_pesca FLOAT,
        Posizione CHAR,
        Percentuale_valore_aggiunto_pesca_piscicoltura_servizi FLOAT,
        Produttività_in_migliaia_di_euro FLOAT
    )
''')


# Salvataggio delle modifiche e chiusura del cursore e della connessione
conn.commit()
cursor.close()
conn.close()


# Percorso relativo al file CSV
file_path = 'TRAINING/regioni_con_posizione.csv'

# Leggi il file CSV
df_vino = pd.read_csv(file_path, sep=',', encoding='latin1')

#Ho letto il file dei vini che viene salvato nella cartella training
#df_vino = pd.read_csv('https://raw.githubusercontent.com/MatteoCostamagna/machine-lerning/main/ai_ml_python_2022_2024_esame_Costamagna_Matteo/Training/.csv', sep=',', encoding='latin1')
print(df_vino)

conn = sqlite3.connect('database.db')
#Ho caricato i dati nella tabella precedentemente creata
df_vino.to_sql('data', conn, if_exists='replace', index=False)

