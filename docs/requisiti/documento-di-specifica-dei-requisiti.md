
# DIEMSlot — Documento di Specifica dei Requisiti (SRS)

| | Dettagli |
| :--- | :--- |
| *Progetto* | DIEMSlot — Sistema di Gestione e Prenotazione Aule Universitarie |
| *Corso* | Ingegneria del Software — DIEM, Università degli Studi di Salerno |
| *Versione* | 0.2 (Da rifinire nelle prossime fasi) |


---

## Indice

1.⁠ ⁠[Descrizione dell'applicazione](#1-descrizione-dellapplicazione)
   - [1.1 Scopo](#11-scopo)
   - [1.2 Attori coinvolti](#12-attori)

---

## 1. Descrizione dell'applicazione

### 1.1 Scopo
*DIEMSlot* è un'applicazione desktop dotata di interfaccia grafica progettata per gestire le *aule, i **docenti* e le *prenotazioni delle aule* di un dipartimento universitario (nella versione attuale il sistema si rivolge a un solo dipartimento. L'estensione è lasciata a future implementazioni).

Il sistema, gestito da un soggetto apposito (l'Addetto di Segreteria), sostituisce la gestione manuale delle richieste di prenotazione, automatizzando la verifica delle disponibilità impedendo sovrapposizioni temporali (sia per aula che per docente) e garantendo una consultazione rapida e ordinata dell'occupazione degli spazi.

### 1.2 Attori

| Attore | Descrizione |
| :--- | :--- |
| *Addetto di segreteria* | Unico attore (umano) che interagisce direttamente con il sistema. Gestisce l'anagrafica delle aule e dei docenti, consulta le disponibilità e registra/cancella le prenotazioni per conto dei docenti, i quali inoltrano le richieste tramite canali esterni al sistema (di persona, via mail o telefonicamente). |

I *docenti* non accedono direttamente all'applicazione: rappresentano entità del dominio nel sistema e associate alle prenotazioni. Di conseguenza, non sono previsti al momento sistemi di autenticazione o di ruoli.
