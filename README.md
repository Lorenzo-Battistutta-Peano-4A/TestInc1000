# TestInc1000

Questo programma codificato in java crea semplicemente una variabile intera di tipo statico nella classe Inc1000 e la incrementa di mille per ogni oggetto della sua classe.

## Parte 1:
La prima versione del programma non eseguiva correttamente il suo compito, perchè, essendo la classe Inc1000 un Thread, veniva eseguito in parallelo agli altri, e il main stampava il risultato ancora prima che i due Thread avessero finito completamente le loro operazioni.
Si può accedere alla variabile *cont* usando il nome della classe invece che il nome dell'oggetto perchè essa è di tipo statico.

**NB: nel programma è stato utilizzato il metodo getCont() perché la variabile *cont* è stata messa privata. Quest'operazione è stata fatta per evitare possibili modifiche all'attributo.**

## Parte 2:
Nella seconda versione sono stati aggiunte le chiamate del metodo join() tra l'esecuzione del primo Thread e del secondo.
In questo modo il main aspetta il termine del Thread prima di eseguire le altre istruzioni. Come risultato viene di conseguenza *2000*: un numero accettabile in quanto un incremento di 1000 eseguito in 2 oggetti (quindi 2 volte) dà come output 2000.

**Dato che il main si ferma alla chiamata del metodo *join()*, è eseguito un solo Thread per volta, e quindi il concetto di Multithreading viene a meno.**

## Parte 3:
Nella terza e ultima versione viene aggiunto il metodo Inc1() di tipo *synchronized*, che impedisce ai thread di accedere contemporaneamente alla variabile statica *cont*, in modo da non creare conflitto. Il metodo viene chiamato nel ciclo del *run()*, al posto del normale comando *cont++*.

**NB: il metodo Inc1() contiene un solo comando (*cont++*).**
