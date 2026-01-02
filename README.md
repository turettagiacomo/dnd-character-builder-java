# Project Nox - D&D 5e Character Creator

**Project Nox** è un'applicazione Java (CLI) progettata per guidare i giocatori nella creazione di personaggi per Dungeons & Dragons 5a Edizione. Il software automatizza il calcolo delle statistiche, gestisce regole complesse di ereditarietà (Razze/Classi) e permette il salvataggio persistente delle schede.

## Funzionalità

* **Creazione Guidata:** Selezione step-by-step di Razza, Sottorazza, Classe, Background e Abilità.
* **Calcolo Automatico:** Gestione automatica di Modificatori, Classe Armatura (CA), Punti Ferita (PF) e Competenze.
* **Architettura OOP:** Struttura modulare basata su ereditarietà e polimorfismo per facile espansione.
* **Design Pattern:** Implementazione del pattern **Builder** per la gestione della creazione del personaggio.
* **Persistenza Dati:** Sistema di Salvataggio/Caricamento su file (Serializzazione Java).
* **Conformità 5e:** Include regole ufficiali per molteplici classi (Barbaro, Ladro, Druido...) e background.

## Tecnologie Utilizzate

* Java (JDK 8+)
* Java I/O (Scanner, Serializable)
* Git & GitHub

## Come Eseguire

1.  Clona il repository:
    ```bash
    git clone [https://github.com/TUO_USERNAME/Project-Nox.git](https://github.com/TUO_USERNAME/Project-Nox.git)
    ```
2.  Compila i file:
    ```bash
    javac -d bin src/*.java src/classi/*.java src/razze/*.java ... (o usa il tuo IDE)
    ```
3.  Esegui:
    ```bash
    java -cp bin Builder
    ```

## Disclaimer Legale
Questo è un progetto fan-made non ufficiale. I contenuti relativi a Dungeons & Dragons sono proprietà di Wizards of the Coast.
