# DIEMSlot

Applicazione Desktop realizzata in Java per la gestione delle **aule, dei docenti e delle prenotazioni** di un dipartimento universitario.

Progetto sviluppato per il corso di **Ingegneria del Software** (corso di laurea in Ingegneria Informatica, DIEM - Universitá di Salerno, 2026/2027)


## Introduzione
DIEMSlot nasce per sostituire la gestione manuale delle prenotazioni delle aule del dipartimento. Il sistema é utilizzato dall'**addetto di segreteria**, unico attore del sistema, il quale gestisce e consulta le prenotazioni per conto dei docenti.
I docenti sono entitá gestite dal sistema (non utenti che vi accedono) e non é previsto al momento un sistema di autenticazione.


## Funzionalitá Principali:
- **Aule:** inserimento, modifica, cancellazione, visualizzazione e ricerca;
- **Docenti:** inserimento, modifica, cancellazione, visualizzazione (ordinata) e ricerca;
- **Disponibilitá:** ricerca delle aule libere secondo una fascia temporale (oraria, data);
- **Prenotazioni:** inserimento di prenotazioni singole o ricorrenti (eventuale cadenza settimanale con data di termine o fissa), visualizzazione ordinata per data/ora con filtri per aula o docente, cancellazione di una singola prenotazione di tutte le future correlate alla serie;
- **Controllo delle sovrapposizioni:** un'aula non puó essere occupata da 2+ docenti allo stesso momento e conseguentemente uno stesso docente non puó trovarsi in 2 aule contemporaneamente;
- **Persistenza:** l'archivio é salvato su file (!da stabilire come);


## Tecnologie
| Ambito | Strumento |
|---|---|
| Linguaggio | Java 1.8 |
| Interfaccia grafica | JavaFX |
| Build | Maven |
| Test | JUnit |
| Documentazione del codice | Doxygen |
| Versionamento | Git / GitHub |


## Documentazione del progetto
- [Specifica dei requisiti](docs/requisiti)
- [Documento di design](docs/design)


## Team di lavoro
| Nome e cognome | GitHub |
|---|---|
| [Edoardo Remo Fabiano] | [@edoremo] |
| [Antonio Ferrentino] | [@Antoferre917] |
| [Karol De Maio] | [@karoldemaio] |
| [Giovanni Furno] | [@giof05] |


//da aggiungere info di build, compilazione e doxygen
