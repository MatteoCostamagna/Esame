/*
 --------------------------------------------------------------
 --------------------------------------------------------------
 --                     ROI PROJECT
 --              ESERCIZI DI SELECT FACILI
 --                       (DQL)
 --------------------------------------------------------------
 --------------------------------------------------------------
*/

/*
 --------------------------------------------------------------
 1. Mostra tutte le aziende registrate nella tabella ft_azienda.
 --------------------------------------------------------------
*/
SELECT 
	*
FROM 
	ft_azienda;

/*
 --------------------------------------------------------------
 2. Mostra il nome e l anno di fondazione 
  di tutte le aziende che hanno un sito web.
 --------------------------------------------------------------
*/
SELECT 
	ragione_sociale, 
	anno_fondazione
FROM 
	ft_azienda
WHERE 
	sito_web IS NOT NULL;

/*
 --------------------------------------------------------------
 3. Mostra tutte le categorie registrate 
  nella tabella dm_categoria.
 --------------------------------------------------------------
*/
SELECT 
	*
FROM 
	dm_categoria;

/*
 --------------------------------------------------------------
 4. Mostra il nome e la descrizione di tutti i prodotti 
  che hanno una valutazione media superiore a 4
 --------------------------------------------------------------
*/
SELECT 
	nome, 
	descrizione
FROM 
	ft_prodotto
WHERE 
	valutazione_media > 4;

/*
 --------------------------------------------------------------
 5. Mostra il nome, il cognome e l indirizzo di tutti i clienti registrati 
  nella tabella ft_cliente che hanno una professione di Impiegato.
 --------------------------------------------------------------
*/
SELECT 
	nome, 
	cognome, 
	indirizzo
FROM 
	ft_cliente
WHERE 
	professione = 'Impiegato';

/*
 --------------------------------------------------------------
 6. Mostra limporto di tutte le transazioni registrate nella tabella 
  ft_transazione che sono state effettuate con il metodo di pagamento Carta di credito.
 --------------------------------------------------------------
*/
SELECT 
	importo
FROM 
	ft_transazione
WHERE 
	metodo_pagamento = 'Carta di credito';

/*
 --------------------------------------------------------------
 7. Mostra il nome, la descrizione e il budget di tutti gli investimenti 
  effettuati dall azienda che ha come ragione_fiscale: 'FintechLab'
 --------------------------------------------------------------
*/
SELECT 
	nome, 
	descrizione, 
	budget
FROM 
	ft_investimento
WHERE 
	id_azienda = (
		SELECT 
			id 
		FROM 
			ft_azienda 
		WHERE 
			ragione_sociale = 'FintechLab');

/*
 --------------------------------------------------------------
 8. Mostra il valore medio dei ROI registrati nella tabella ft_roi
 --------------------------------------------------------------
*/
SELECT 
	AVG(valore) as valore_medio_roi
FROM 
	ft_roi;

/*
 --------------------------------------------------------------
 9. Mostra il numero totale di recensioni registrate 
  nella tabella ft_recensione per ogni id_prodotto.
 --------------------------------------------------------------
*/
SELECT 
	id_prodotto, 
	COUNT(*) as numero_recensioni
FROM 
	ft_recensione
GROUP BY 
	id_prodotto;

/*
 --------------------------------------------------------------
 10. Mostra il numero di transazioni registrate nella tabella 
  ft_transazione per ogni stato di transazione unico.
 --------------------------------------------------------------
*/
SELECT 
	stato_transazione, 
	COUNT(*) as numero_transazioni
FROM 
	ft_transazione
GROUP BY 
	stato_transazione;
