1. DESCRIZIONE DELL'APPLICAZIONE:
1.1 Scopo: DiemSlot è un'applicazione che ha lo scopo di gestire l'anagrafica dei docenti, le aule di un dipartimento universitario e le relative prenotazioni. Il sistema permette di pianificare attività didattiche ed extra-didattiche garantendo l'assenza di conflitti di orario.
1.2 Attori coinvolti: Non ci sono ruoli con permessi differenziati ma un unico profilo operativo che interagisce con l'interfaccia grafica: Operatore di Segreteria[Attore primario]:L'utente che utilizza l'interfaccia grafica per gestire aule e docenti, verificare le disponibilità e registrare o annullare prenotazioni File system locale[Attore secondario]:Il sistema esterno con cui l'applicazione interagisce per salvare e caricare l'archivio di aule, docenti e prenotazioni.
2. Requisiti funzionali:
2.1 Gestione delle aule:
RF-01(Inserimento aula):Il sistema deve permettere di inserire una nuova aula specificando codice identificativo, nome, edificio, piano e capienza.
RF-02(Univocità codice aula):Il sistema deve impedire la registrazione di due aule con lo stesso codice identificativo.
RF-03(Modifica aula):Il sistema deve consentire la modifica dei dati di un'aula già presente in archivio.
RF-04(Cancellazione aula):Il sistema deve permettere di eliminare un'aula dall'archivio.
RF-05(Visualizzazione aule):Il sistema deve mostrare la lista completa delle aule registrate.
RF-06(Ricerca aula):Il sistema deve consentire di cercare un'aula per nome, codice identificativo o capienza.
2.2 Gestione dei docenti:
RF-07(Inserimento docenti):Il sistema deve permettere di registrare un nuovo docente inserendo email istituzionale univoca, nome e cognome.
RF-08(Univocità email docente):Il sistema deve impedire la registrazione di un nuovo docente se l'email istituzionale è gia presente in archivio.
RF-09(Modifica docente):Il sistema deve consentire di modificare i dati di un docente già presente nell'archivio.
RF-10(Cancellazione docente):Il sistema deve permettere di rimuovere un docente dall'archivio.
RF-11(Visualizzazione docenti):Il sistema deve mostrare l'elenco dei docenti presenti nell'archivio ordinato alfabeticamente per cognome e nome.
RF-12(Ricerca docente):Il sistema deve permettere di cercare un docente per cognome o per email istituzionale.
