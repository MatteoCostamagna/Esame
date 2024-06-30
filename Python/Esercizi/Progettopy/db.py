import pandas as pd
import sqlite3

# Creazione di una connessione al database (o lo crea se non esiste)
conn = sqlite3.connect('database.db')

# Creazione di un cursore per eseguire comandi SQL
cursor = conn.cursor()


# Creazione della tabella "agriturismi"
cursor.execute('''
    CREATE TABLE IF NOT EXISTS data (
        id INTEGER PRIMARY KEY,
        regione TEXT,
        anno INTEGER,
        presenze INTEGER,
        arrivi INTEGER
    )
''')

# Creazione della tabella "capeggi_villaggi"
cursor.execute('''
    CREATE TABLE IF NOT EXISTS campeggi_villaggi (
        id INTEGER PRIMARY KEY,
        regione TEXT,
        anno INTEGER,
        presenze INTEGER,
        arrivi INTEGER
    )
''')

# Creazione della tabella "esercizi_alberghieri"
cursor.execute('''
    CREATE TABLE IF NOT EXISTS esercizi_alberghieri (
        id INTEGER PRIMARY KEY,
        regione TEXT,
        anno INTEGER,
        presenze INTEGER,
        arrivi INTEGER
    )
''')


# Salvataggio delle modifiche e chiusura del cursore e della connessione
conn.commit()
cursor.close()
conn.close()

#creo nuovo dataframe con arrivi e partenze per gli agriturismi
df_arrivi_agriturismo = pd.read_csv('https://raw.githubusercontent.com/FabioGagliardiIts/datasets/main/dati_turismo/Arrivi-negli-agriturismi-in-Italia-per-regione.csv', sep=';', encoding='latin1')
df_presenze_agriturismo = pd.read_csv('https://raw.githubusercontent.com/FabioGagliardiIts/datasets/main/dati_turismo/Presenze-negli-agriturismi-in-Italia-per-regione.csv', sep=';', encoding='latin1')
arrivi = df_arrivi_agriturismo['Arrivi'] 
df_presenze_agriturismo['Arrivi'] = arrivi
df_presenze_agriturismo.insert( 0, "id", range(0, 0+len(df_presenze_agriturismo)))
print(df_presenze_agriturismo)
conn = sqlite3.connect('database.db')
df_presenze_agriturismo.to_sql('data', conn, if_exists='replace', index=False)


#creo nuovo dataframe con arrivi e partenze per gli campeggi
df_arrivi_campeggio = pd.read_csv('https://raw.githubusercontent.com/FabioGagliardiIts/datasets/main/dati_turismo/Arrivi-nei-campeggi-e-villaggi-turistici-in-italia-per-regione.csv', sep=';', encoding='latin1')
df_presenze_campeggio = pd.read_csv('https://raw.githubusercontent.com/FabioGagliardiIts/datasets/main/dati_turismo/Presenze-nei-campeggi-e-villaggi-turistici-in-italia-per-regione.csv', sep=';', encoding='latin1')
arrivi = df_arrivi_campeggio['Arrivi'] 
df_presenze_campeggio['Arrivi'] = arrivi
df_presenze_campeggio.insert( 0, "id", range(0, 0+len(df_presenze_campeggio)))
conn = sqlite3.connect('database.db')
df_presenze_campeggio.to_sql('campeggi_villaggi', conn, if_exists='replace', index=False)

#creo nuovo dataframe con arrivi e partenze per alberghi
df_arrivi_albergo = pd.read_csv('https://raw.githubusercontent.com/FabioGagliardiIts/datasets/main/dati_turismo/Arrivi-negli-esercizi-alberghieri-in-Italia-per-regione.csv', sep=';', encoding='latin1')
df_presenze_albergo = pd.read_csv('https://raw.githubusercontent.com/FabioGagliardiIts/datasets/main/dati_turismo/Presenze-negli-agriturismi-in-Italia-per-regione.csv', sep=';', encoding='latin1')
arrivi = df_arrivi_albergo['Arrivi'] 
df_presenze_albergo['Arrivi'] = arrivi
df_presenze_albergo.insert( 0, "id", range(0, 0+len(df_presenze_albergo)))
print(df_presenze_campeggio)
conn = sqlite3.connect('database.db')
df_presenze_albergo.to_sql('esercizi_alberghieri', conn, if_exists='replace', index=False)


