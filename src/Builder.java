import background.Acolyte;
import background.Background;
import classi.*;
import classi.sottoclassi.Sottoclasse;
import classi.sottoclassi.*;
import razze.*;
import background.*;
import razze.sottorazze.*;
import java.util.*;

public class Builder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Personaggio personaggio = new Personaggio();

        System.out.println("\nBenvenuto in Project Nox. Questo software ti aiuterà a creare il tuo personaggio di D&D secondo il manuale.\n");
        System.out.println("Cosa vuoi fare:\n[1]Caricare un personaggio\t[2]Crearne uno nuovo");
        try{
            if(sc.nextInt() == 1){
                sc.nextLine();
                System.out.println("Inserire il nome del file da cui caricare: ");
                String nomeFile = sc.nextLine();
                if(!nomeFile.contains(".dat")){
                    nomeFile = nomeFile + ".dat";
                }
                Personaggio caricato = Personaggio.caricaPersonaggio(nomeFile);
                if(caricato != null){
                    MenuPrinter.stampaPersonaggio(caricato);
                    return;
                }
            }
        }
        catch(Exception InputMismatchException){
            System.out.println("Non hai inserito un numero. Automaticamente stai creando un nuovo personaggio");
        }

        //
        //  Scelta razza
        //

        sc.nextLine();
        System.out.println("Il primo passo per creare un personaggio è scegliere la razza.\nPer farlo scegline una dalla seguente tabella:");
        MenuPrinter.printListaRazze();
        Razza razzaScelta = null;
        Sottorazza sottorazzaScelta = null;
        boolean sceltaValida=false;
        String scelta = "";
        while(!sceltaValida){
            System.out.println("Che razza hai scelto? ");
            scelta = sc.nextLine().trim();

            if (scelta.equalsIgnoreCase("Nano")) {
                sceltaValida = true;

                System.out.println("Devi scegliere un gruppo di strumenti da artigiano in cui avere competenza: ");
                String[] sceltePossibili = {"Strumenti da fabbro ", "Scorte da mescitore", "Strumenti da costruzione"};
                sceltaMultipla(1, personaggio, sceltePossibili, sc, "COMP_STRUMENTO");
                System.out.println("Devi scegliere una sottorazza: ");
                MenuPrinter.printListaSottorazzeNano();
                String subScelta = sc.nextLine();
                Sottorazza subNano = null;

                if (subScelta.equals("Nano delle colline")) {
                    sottorazzaScelta = new NanoDelleColline();
                }
                else{
                    sottorazzaScelta = new NanoDelleMontagne();
                }
                razzaScelta = new Nano(sottorazzaScelta);
            }
            else if (scelta.equalsIgnoreCase("Elfo")) {
                sceltaValida = true;

                System.out.println("Devi scegliere una sottorazza: ");
                MenuPrinter.printListaSottorazzeElfo();
                String subScelta = sc.nextLine();
                Sottorazza subElfo = null;

                if(subScelta.equals("Elfo alto")){
                    sottorazzaScelta = new ElfoAlto();
                    sceltaMultipla(1, personaggio, MenuPrinter.LINGUE, sc, "LINGUE");
                    sceltaMultipla(1,  personaggio, MenuPrinter.TRUCCHETTI_MAGO, sc, "INCANTESIMO");
                }
                else if (subScelta.equals("Elfo dei boschi")) {
                    sottorazzaScelta = new ElfoDeiBoschi();
                }
                else{
                    sottorazzaScelta = new ElfoOscuro();
                }

                razzaScelta = new Elf(sottorazzaScelta);
            }
            else if (scelta.equalsIgnoreCase("Halfling")) {
                sceltaValida = true;

                System.out.println("Devi scegliere una sottorazza: ");
                MenuPrinter.printListaSottorazzeHalfling();
                String subScelta = sc.nextLine();
                Sottorazza subHalfling = null;

                if (subScelta.equals("Halfling piedelesto")) {
                    sottorazzaScelta = new HalflingPiedelesto();
                }
                else{
                    sottorazzaScelta = new HalflingTozzo();
                }
                razzaScelta = new Halfling(sottorazzaScelta);
            }
            else if (scelta.equalsIgnoreCase("Umano")) {
                razzaScelta = new Human();
                sceltaValida = true;

                sceltaMultipla(1, personaggio, MenuPrinter.LINGUE, sc, "LINGUA");
            }
            else if (scelta.equalsIgnoreCase("Dragonide")) {
                sceltaValida = true;

                System.out.println("Devi scegliere la discendenza draconica: ");
                System.out.println();
                MenuPrinter.printListaDiscendenzeDraconiche();

                String discendenza;
                boolean accettabile = false;
                while(!accettabile){
                    discendenza = sc.nextLine();
                    switch (discendenza){
                        case "Nero":
                        case "Blu":
                        case "Ottone":
                        case "Bronzo":
                        case "Rame":
                        case "Oro":
                        case "Verde":
                        case "Rosso":
                        case "Argento":
                        case "Bianco":
                            razzaScelta = new Dragonborn(discendenza);
                            accettabile = true;
                            break;
                        default:
                            System.out.println("'" + discendenza + "' non è una discendenza valida. Riprova.");
                    }
                }
            }
            else if (scelta.equalsIgnoreCase("Gnomo")) {
                sceltaValida = true;

                System.out.println("Devi scegliere una sottorazza: ");
                MenuPrinter.printListaSottorazzeGnomo();
                String subScelta = sc.nextLine();
                Sottorazza subGnome = null;

                if (subScelta.equals("Gnomo delle foreste")) {
                    sottorazzaScelta = new GnomoDelleForeste();
                }
                else{
                    sottorazzaScelta = new GnomoDelleRocce();
                }
                razzaScelta = new Gnome(sottorazzaScelta);
            }
            else if (scelta.equalsIgnoreCase("Mezzelfo")) {
                razzaScelta = new HalfElf();
                sceltaValida = true;

                sceltaMultipla(1, personaggio, MenuPrinter.LINGUE, sc, "LINGUA");

                sceltaMultipla(2, personaggio, MenuPrinter.LISTA_CARATTERISTICHE, sc, "ADD_CAR");

                sceltaMultipla(2, personaggio, MenuPrinter.LISTA_ABILITA, sc, "ABILITA");
            }
            else if (scelta.equalsIgnoreCase("Mezzorco")) {
                razzaScelta = new HalfOrc();
                sceltaValida = true;
            }
            else if (scelta.equalsIgnoreCase("Tiefling")) {
                razzaScelta = new Tiefling();
                sceltaValida = true;
            }
            else{
                System.out.println("Razza non valida");
            }
        }

        //applica tutte le modifiche legate alla razza
        personaggio.setRazza(razzaScelta);
        personaggio.setSottorazza(sottorazzaScelta);

        //
        //  Scelta della classe
        //

        System.out.println("\nOttima scelta!\nOra bisogna scegliere la classe del tuo personaggio.\nPer farlo scegli tra quelle riportate qua sotto:");
        MenuPrinter.printListaClassi();
        Classe classeScelta = null;
        Sottoclasse sottoclasseScelta = null;
        sceltaValida=false;
        scelta = "";
        String scelteExtra = "";
        while (!sceltaValida){
            System.out.println("Che classe hai scelto? ");
            scelta = sc.nextLine().trim();

            if(scelta.equalsIgnoreCase("Barbaro")) {
                sceltaValida=true;
                classeScelta = new Barbarian();

                // scelta abilità

                String[] sceltePossibili = {"Addestrare animali", "Atletica", "Intimidire", "Natura", "Percezione", "Sopravvivenza"};
                sceltaMultipla(2, personaggio, sceltePossibili, sc, "ABILITA");

                // scelta equipaggiamento
                System.out.println("Ora bisogna scegliere l'equipaggiamento.\nScegli una sola tra le seguenti possibilità: ");
                System.out.println("[a]Ascia bipenne/[b]Qualsiasi arma marziale da vicini");
                String sceltaInput = sc.nextLine().trim();
                while(!(sceltaInput.equals("a") || sceltaInput.equals("b"))) {
                    System.out.println("Valore non valido. Riprova");
                    sceltaInput = sc.nextLine().trim();
                }
                switch (sceltaInput) {
                    case "a":
                        personaggio.addArmi("Ascia bipenne", sc);
                        break;
                    case "b":
                        System.out.println("Scegli una delle seguenti armi: ");
                        MenuPrinter.printListaArmiMarzialiMischia();
                        String equipaggiamentoScelto = sc.nextLine();
                        personaggio.addArmi(equipaggiamentoScelto, sc);
                        break;
                    default:
                        break;
                }
                System.out.println("[1]2 asce/[2]Arma semplice");
                sceltaInput = sc.nextLine().trim();
                while(!(sceltaInput.equals("a") || sceltaInput.equals("b"))) {
                    System.out.println("Valore non valido. Riprova");
                    sceltaInput = sc.nextLine().trim();
                }
                switch (sceltaInput) {
                    case "a":
                        personaggio.addArmi("2 asce", sc);
                        break;
                    case "b":
                        System.out.println("Scegli una delle seguenti armi: ");
                        MenuPrinter.printListaArmiSempliciMischia();
                        MenuPrinter.printListaArmiSempliciDistanza();
                        String equipaggiamentoScelto = sc.nextLine();
                        personaggio.addArmi(equipaggiamentoScelto, sc);
                        break;
                    default:
                        break;
                }
                sc.nextLine();
            }
            else if(scelta.equalsIgnoreCase("Bardo")){
                sceltaValida=true;
                classeScelta = new Bard();

                sceltaMultipla(3, personaggio, MenuPrinter.LISTA_ABILITA, sc, "ABILITA");

                System.out.println("Ora bisogna scegliere l'equipaggiamento.\nScegli una sola tra le seguenti possibilità: ");
                System.out.println("Stocco/Spada lunga/Arma semplice");
                String equipaggiamentoScelto = sc.nextLine();
                if(equipaggiamentoScelto.equalsIgnoreCase("Arma semplice")){
                    System.out.println("Scegli una delle seguenti armi: ");
                    MenuPrinter.printListaArmiSempliciMischia();
                    MenuPrinter.printListaArmiSempliciDistanza();
                    equipaggiamentoScelto = sc.nextLine();
                }
                personaggio.addArmi(equipaggiamentoScelto, sc);
                System.out.println("Pacchetto da diplomatico/Pacchetto da intrattenitore");
                personaggio.addEquipaggiamento(sc.nextLine(), sc);
                System.out.println("Liuto/Strumento musicale");
                personaggio.addEquipaggiamento(sc.nextLine(), sc);

                // --- MAGIA BARDO ---
                // 1. Trucchetti (Cantrips)
                sceltaMultipla(2, personaggio, MenuPrinter.TRUCCHETTI_BARDO, sc, "INCANTESIMO");
                sceltaMultipla(4, personaggio, MenuPrinter.INCANTESIMI_BARDO_LVL1, sc, "INCANTESIMO");
            }
            else if(scelta.equalsIgnoreCase("Chierico")){
                sceltaValida=true;

                String[] sceltePossibili = {"Storia", "Intuizione", "Medicina", "Persuasione", "Religione"};
                sceltaMultipla(2, personaggio, sceltePossibili,  sc, "ABILITA");

                System.out.println("Ora bisogna scegliere l'equipaggiamento.\nScegli una sola tra le seguenti possibilità: ");
                System.out.println("Mazza/Martello da guerra (se competente)");
                personaggio.addArmi(sc.nextLine(), sc);

                System.out.println("Corazza di scaglie/Armatura di cuoio/Cotta di maglia (se competente)");
                personaggio.addArmature(sc.nextLine(), sc);

                System.out.println("Balestra leggera e 20 dardi/Qualsiasi arma semplice");
                String equipaggiamentoScelto = sc.nextLine();
                if(equipaggiamentoScelto.equalsIgnoreCase("Qualsiasi arma semplice")){
                    System.out.println("Scegli una delle seguenti armi: ");
                    MenuPrinter.printListaArmiSempliciMischia();
                    MenuPrinter.printListaArmiSempliciDistanza();
                    equipaggiamentoScelto = sc.nextLine();
                }
                personaggio.addArmi(equipaggiamentoScelto, sc);

                System.out.println("Pacchetto da sacerdote/Pacchetto da esploratore");
                personaggio.addEquipaggiamento(sc.nextLine(), sc);

                // --- MAGIA CHIERICO ---
                // 1. Trucchetti
                sceltaMultipla(3, personaggio, MenuPrinter.TRUCCHETTI_BARDO,  sc, "INCANTESIMO");
                sceltaMultipla(4, personaggio, MenuPrinter.INCANTESIMI_BARDO_LVL1,  sc, "INCANTESIMO");

                System.out.println("Scegli il tuo dominio tra: ");
                MenuPrinter.printListaSottoclassiChierico();
                String subScelta = sc.nextLine();
                switch (subScelta) {
                    case "Knowledge domain":
                        sottoclasseScelta = new KnowledgeDomain();

                        System.out.println("Puoi scegliere una lingua tra: ");
                        MenuPrinter.stampaListaLingue();
                        personaggio.addLanguage(sc.nextLine(), sc);
                        System.out.println("Puoi scegliere una lingua tra: ");
                        MenuPrinter.stampaListaLingue();
                        personaggio.addLanguage(sc.nextLine(), sc);
                        System.out.println("Scegli: Arcano, Storia, Natura, Religione");
                        System.out.println("Scegli un'altra abilità in cui avere doppia competenza: ");
                        personaggio.setBonusCompetenzaQuattro(sc.nextLine(), sc);
                        System.out.println("Scegli un'altra abilità in cui avere doppia competenza: ");
                        personaggio.setBonusCompetenzaQuattro(sc.nextLine(), sc);

                        break;
                    case "Life domain":
                        sottoclasseScelta = new LifeDomain();
                        break;
                    case "Light domain":
                        sottoclasseScelta = new LightDomain();
                        break;
                    case "Nature domain":
                        sottoclasseScelta = new NatureDomain();

                        sceltaMultipla(1, personaggio, MenuPrinter.LISTA_ABILITA, sc, "ABILITA");

                        sceltaMultipla(1, personaggio, MenuPrinter.TRUCCHETTI_DRUIDO, sc, "INCANTESIMO");

                        break;
                    case "Tempest domain":
                        sottoclasseScelta = new TempestDomain();
                        break;
                    case "War domain":
                        sottoclasseScelta = new WarDomain();
                        break;
                    case "Trickery domain":
                        sottoclasseScelta = new TrickeryDomain();
                        break;
                    default:
                        System.out.println("Scelta non valida, riprova");
                        break;
                }
                classeScelta = new Cleric(sottoclasseScelta);
            }
            else if(scelta.equalsIgnoreCase("Druido")){
                sceltaValida=true;
                classeScelta = new Druid();

                String[] sceltePossibili = {"Arcano", "Addestrare animali", "Intuizione", "Medicina", "Natura", "Percezione", "Religione", "Sopravvivenza"};
                sceltaMultipla(2, personaggio, sceltePossibili, sc, "ABILITA");

                System.out.println("Ora bisogna scegliere l'equipaggiamento.\nScegli una sola tra le seguenti possibilità: ");

                System.out.println("Scudo/Qualsiasi arma semplice");
                String equipaggiamentoScelto = sc.nextLine();
                if(equipaggiamentoScelto.equals("Scudo")){
                    personaggio.addArmature(equipaggiamentoScelto, sc);
                }
                else{
                    System.out.println("Scegli una delle seguenti armi: ");
                    MenuPrinter.printListaArmiSempliciMischia();
                    MenuPrinter.printListaArmiSempliciDistanza();
                    equipaggiamentoScelto = sc.nextLine();
                    personaggio.addArmi(equipaggiamentoScelto, sc);
                }
                System.out.println("Scimitarra/Qualsiasi arma semplice da mischia");
                equipaggiamentoScelto = sc.nextLine();
                if(equipaggiamentoScelto.equals("Qualsiasi arma semplice da mischia")){
                    System.out.println("Scegli una delle seguenti armi: ");
                    MenuPrinter.printListaArmiSempliciMischia();
                    equipaggiamentoScelto = sc.nextLine();
                    personaggio.addArmi(equipaggiamentoScelto, sc);
                }
                personaggio.addArmi(equipaggiamentoScelto, sc);

                // --- MAGIA DRUIDO ---
                // 1. Trucchetti
                sceltaMultipla(2, personaggio, MenuPrinter.TRUCCHETTI_DRUIDO, sc, "INCANTESIMO");
                sceltaMultipla(4, personaggio, MenuPrinter.INCANTESIMI_DRUIDO_LVL1, sc, "INCANTESIMO");
            }
            else if(scelta.equalsIgnoreCase("Guerriero")){
                sceltaValida=true;
                classeScelta = new Fighter();

                String[] sceltePossibili = {"Acrobazia", "Addestrare animali", "Atletica", "Storia", "Intuizione", "Intimidire", "Percezione", "Sopravvivenza"};
                sceltaMultipla(2, personaggio, sceltePossibili, sc, "ABILITA");

                System.out.println("Ora bisogna scegliere l'equipaggiamento.\nScegli una sola tra le seguenti possibilità: ");

                System.out.println("Cotta di maglia/Armatura di cuoio, arco lungo e 20 frecce");
                if(sc.nextLine().equals("Cotta di maglia")){
                    personaggio.addArmature("Cotta di maglia", sc);
                }
                else{
                    personaggio.addArmature("Armatura di cuoio", sc);
                    personaggio.addArmi("arco lungo e 20 frecce", sc);
                }

                System.out.println("Arma marziale e scudo/Due armi marziali");
                String equipaggiamentoScelto = sc.nextLine();
                if(equipaggiamentoScelto.equals("Arma marziale e scudo")){
                    System.out.println("Scegli una delle seguenti armi: ");
                    MenuPrinter.printListaArmiMarzialiMischia();
                    MenuPrinter.printListaArmiMarzialiDistanza();
                    equipaggiamentoScelto = sc.nextLine();
                    personaggio.addArmi(equipaggiamentoScelto, sc);
                    personaggio.addArmature("Scudo", sc);
                }
                else{
                    System.out.println("Scegli una delle seguenti armi: ");
                    MenuPrinter.printListaArmiMarzialiMischia();
                    MenuPrinter.printListaArmiMarzialiDistanza();
                    equipaggiamentoScelto = sc.nextLine();
                    personaggio.addArmi(equipaggiamentoScelto, sc);
                    System.out.println("Scegli un'altra delle seguenti armi: ");
                    MenuPrinter.printListaArmiMarzialiMischia();
                    MenuPrinter.printListaArmiMarzialiDistanza();
                    equipaggiamentoScelto = sc.nextLine();
                    personaggio.addArmi(equipaggiamentoScelto, sc);
                }

                System.out.println("Balestra leggera e 20 dardi/Due asce");
                personaggio.addArmi(sc.nextLine(), sc);

                System.out.println("Pacchetto da esploratore/Pacchetto da avventuriero");
                personaggio.addEquipaggiamento(sc.nextLine(), sc);
            }
            else if(scelta.equalsIgnoreCase("Monaco")){
                sceltaValida=true;
                classeScelta = new Monk();
                String[] sceltePossibili = {"Acrobazia", "Atletica", "Storia", "Intuizione", "Religione", "Furtività"};
                sceltaMultipla(2, personaggio, sceltePossibili, sc, "ABILITA");

                System.out.println("Ora bisogna scegliere l'equipaggiamento.\nScegli una sola tra le seguenti possibilità: ");

                System.out.println("Spada corta/Qualsiasi arma semplice");
                String equipaggiamentoScelto = sc.nextLine();
                if(equipaggiamentoScelto.equalsIgnoreCase("Qualsiasi arma semplice")){
                    System.out.println("Scegli una delle seguenti armi: ");
                    MenuPrinter.printListaArmiSempliciMischia();
                    MenuPrinter.printListaArmiSempliciDistanza();
                    equipaggiamentoScelto = sc.nextLine();
                }
                personaggio.addArmi(equipaggiamentoScelto, sc);

                System.out.println("Scegli competenza in uno strumento musicale o in strumenti da fabbro");
                personaggio.addCompetenzaStrumenti(sc.nextLine(), sc);

                System.out.println("Pacchetto da esploratore/Pacchetto da avventuriero");
                personaggio.addEquipaggiamento(sc.nextLine(), sc);
            }
            else if(scelta.equalsIgnoreCase("Paladino")){
                sceltaValida=true;
                classeScelta = new Paladin();

                int nAbility = 2;
                String[] sceltePossibili = {"Atletica", "Intuizione", "Intimidire", "Medicina", "Persuasione", "Religione"};
                sceltaMultipla(2, personaggio, sceltePossibili, sc, "ABILITA");

                System.out.println("Ora bisogna scegliere l'equipaggiamento.\nScegli una sola tra le seguenti possibilità: ");

                System.out.println("Arma marziale e scudo/Due armi marziali");
                String equipaggiamentoScelto =  sc.nextLine();
                if(equipaggiamentoScelto.equals("Arma marziale e scudo")){
                    System.out.println("Scegli una delle seguenti armi: ");
                    MenuPrinter.printListaArmiMarzialiMischia();
                    MenuPrinter.printListaArmiMarzialiDistanza();
                    equipaggiamentoScelto = sc.nextLine();
                    personaggio.addArmi(equipaggiamentoScelto, sc);
                    personaggio.addArmature("Scudo", sc);
                }
                else{
                    System.out.println("Scegli una delle seguenti armi: ");
                    MenuPrinter.printListaArmiMarzialiMischia();
                    MenuPrinter.printListaArmiMarzialiDistanza();
                    equipaggiamentoScelto = sc.nextLine();
                    personaggio.addArmi(equipaggiamentoScelto, sc);
                    System.out.println("Scegli un'altra delle seguenti armi: ");
                    MenuPrinter.printListaArmiMarzialiMischia();
                    MenuPrinter.printListaArmiMarzialiDistanza();
                    equipaggiamentoScelto = sc.nextLine();
                    personaggio.addArmi(equipaggiamentoScelto, sc);
                }

                System.out.println("5 giavellotti/Qualsiasi arma semplice da mischia");
                equipaggiamentoScelto =  sc.nextLine();
                if(equipaggiamentoScelto.equals("Qualsiasi arma semplice")){
                    System.out.println("Scegli una delle seguenti armi: ");
                    MenuPrinter.printListaArmiSempliciMischia();
                    equipaggiamentoScelto = sc.nextLine();
                }
                personaggio.addArmi(equipaggiamentoScelto, sc);

                System.out.println("Pacchetto da sacerdote/Pacchetto da esploratore");
                personaggio.addEquipaggiamento(sc.nextLine(), sc);
            }
            else if(scelta.equalsIgnoreCase("Ranger")){
                sceltaValida=true;
                classeScelta = new Ranger();

                String[] sceltePossibili = {"Addestrare animali", "Atletica", "Intuizione", "Indagare", "Natura", "Percezione", "Furtività", "Sopravvivenza"};
                sceltaMultipla(3, personaggio, sceltePossibili, sc, "ABILITA");

                System.out.println("Ora bisogna scegliere l'equipaggiamento.\nScegli una sola tra le seguenti possibilità: ");

                System.out.println("Corazza di scaglie/Armatura di cuoio");
                personaggio.addArmature(sc.nextLine(), sc);

                System.out.println("Due spade corte/Due armi semplici da mischia");
                String equipaggiamentoScelto =  sc.nextLine();
                if(equipaggiamentoScelto.equals("Qualsiasi arma semplice")){
                    System.out.println("Scegli una delle seguenti armi: ");
                    MenuPrinter.printListaArmiSempliciMischia();
                    equipaggiamentoScelto = sc.nextLine();
                    personaggio.addArmi(equipaggiamentoScelto, sc);
                    System.out.println("Scegli una delle seguenti armi: ");
                    MenuPrinter.printListaArmiSempliciMischia();
                    equipaggiamentoScelto = sc.nextLine();
                }
                personaggio.addArmi(equipaggiamentoScelto, sc);

                System.out.println("Pacchetto da avventuriero/Pacchetto da esploratore");
                personaggio.addEquipaggiamento(sc.nextLine(), sc);
            }
            else if(scelta.equalsIgnoreCase("Ladro")){
                sceltaValida=true;
                classeScelta = new Rogue();

                int nAbility = 4;
                System.out.println("Scegli " + nAbility + " abilità in cui avere competenza tra: ");
                String[] sceltePossibili = {"Acrobazia", "Atletica", "Furtività", "Inganno", "Intuizione", "Intimidire", "Indagare", "Percezione", "Intrattenere", "Persuasione", "Rapidità di mano"};
                sceltaMultipla(4, personaggio, sceltePossibili, sc, "ABILITA");

                nAbility = 2;
                System.out.println("Scegli " + nAbility + " abilità in cui avere doppia competenza tra: ");
                sceltaMultipla(2, personaggio, sceltePossibili, sc, "ABILITA_QUATTRO");

                System.out.println("Ora bisogna scegliere l'equipaggiamento.\nScegli una sola tra le seguenti possibilità: ");

                System.out.println("Stocco/Spada corta");
                personaggio.addArmi(sc.nextLine(), sc);

                System.out.println("Arco corto e 20 frecce/Spada corta");
                personaggio.addArmi(sc.nextLine(), sc);

                System.out.println("Pacchetto da scassinatore/Pacchetto da avventuriero/Pacchetto da esploratore");
                personaggio.addEquipaggiamento(sc.nextLine(), sc);
            }
            else if(scelta.equalsIgnoreCase("Stregone")){
                sceltaValida=true;

                String[] sceltePossibili = {"Arcano", "Inganno", "Intuizione", "Intimidire", "Persuasione", "Religione"};
                sceltaMultipla(2, personaggio, sceltePossibili, sc, "ABILITA");

                System.out.println("Ora bisogna scegliere l'equipaggiamento.\nScegli una sola tra le seguenti possibilità: ");

                System.out.println("Balestra leggera e 20 dardi/Qualsiasi arma semplice");
                String equipaggiamentoScelto = sc.nextLine();
                if(equipaggiamentoScelto.equals("Qualsiasi arma semplice")){
                    System.out.println("Scegli una delle seguenti armi: ");
                    MenuPrinter.printListaArmiSempliciMischia();
                    MenuPrinter.printListaArmiSempliciDistanza();
                    equipaggiamentoScelto = sc.nextLine();
                }
                personaggio.addArmi(equipaggiamentoScelto, sc);

                System.out.println("Borsa per componenti/Focus arcano");
                personaggio.addEquipaggiamento(sc.nextLine(), sc);

                System.out.println("Pacchetto da avventuriero/Pacchetto da esploratore");
                personaggio.addEquipaggiamento(sc.nextLine(), sc);

                // --- MAGIA STREGONE ---
                // 1. Trucchetti
                sceltaMultipla(4, personaggio, MenuPrinter.TRUCCHETTI_STREGONE, sc, "INCANTESIMO");
                sceltaMultipla(2, personaggio, MenuPrinter.INCANTESIMI_STREGONE_LVL1, sc, "INCANTESIMO");

                //origine stregonesca
                System.out.println("Scegli la tua discendenza tra: ");
                MenuPrinter.printListaSottoclassiStregone();
                String subScelta = sc.nextLine().toLowerCase().trim();
                switch (subScelta) {
                    case "discendenza draconica":
                        String discendenza = "";
                        boolean accettabile = false;
                        System.out.println("Scegli una discendenza: ");
                        MenuPrinter.printListaDiscendenzeDraconiche();
                        while(!accettabile){
                            discendenza = sc.nextLine().toLowerCase();
                            switch (discendenza){
                                case "nero":
                                case "blu":
                                case "ottone":
                                case "bronzo":
                                case "rame":
                                case "oro":
                                case "verde":
                                case "rosso":
                                case "argento":
                                case "bianco":
                                    accettabile = true;
                                    break;
                                default:
                                    System.out.println("'" + discendenza + "' non è una discendenza valida. Riprova.");
                            }
                        }
                        sottoclasseScelta = new DraconicBloodline(discendenza);
                        break;
                    case "wild magic":
                        sottoclasseScelta = new WildMagic();
                        break;
                    default:
                        System.out.println("Scelta non valida. Riprova.");
                        subScelta = sc.nextLine().toLowerCase();
                        break;
                }
                classeScelta = new Sorcerer(sottoclasseScelta);
            }
            else if(scelta.equalsIgnoreCase("Warlock")){
                sceltaValida=true;

                String[] sceltePossibili = {"Arcano", "Inganno", "Storia", "Intimidire", "Indagare", "Natura", "Religione"};
                sceltaMultipla(2, personaggio, sceltePossibili, sc, "ABILITA");

                System.out.println("Ora bisogna scegliere l'equipaggiamento.\nScegli una sola tra le seguenti possibilità: ");

                System.out.println("Balestra leggera e 20 dardi/Qualsiasi arma semplice");
                String equipaggiamentoScelto = sc.nextLine();
                if(equipaggiamentoScelto.equals("Qualsiasi arma semplice")){
                    System.out.println("Scegli una delle seguenti armi: ");
                    MenuPrinter.printListaArmiSempliciMischia();
                    MenuPrinter.printListaArmiSempliciDistanza();
                    equipaggiamentoScelto = sc.nextLine();
                }
                personaggio.addArmi(equipaggiamentoScelto, sc);

                System.out.println("Borsa per componenti/Focus arcano");
                personaggio.addEquipaggiamento(sc.nextLine(), sc);

                System.out.println("Pacchetto da avventuriero/Pacchetto da esploratore");
                personaggio.addEquipaggiamento(sc.nextLine(), sc);

                // --- MAGIA WARLOCK ---
                // 1. Trucchetti
                sceltaMultipla(2, personaggio, MenuPrinter.TRUCCHETTI_WARLOCK, sc, "INCANTESIMO");
                sceltaMultipla(2, personaggio, MenuPrinter.INCANTESIMI_WARLOCK_LVL1, sc, "INCANTESIMO");

                System.out.println("Scegli il tuo otherworldly patron tra: ");
                MenuPrinter.printListaSottoclassiWarlock();
                String subScelta = sc.nextLine();

                switch (subScelta) {
                    case "The archfey":
                        sottoclasseScelta = new TheArchfey();
                        break;
                    case "The fiend":
                        sottoclasseScelta = new TheFiend();
                        break;
                    case "The great old one":
                        sottoclasseScelta = new TheGreatOldOne();
                        break;
                    default:
                        System.out.println("Non valido, riprova");
                }

                classeScelta = new Warlock(sottoclasseScelta);
            }
            else if(scelta.equalsIgnoreCase("Mago")){
                sceltaValida=true;
                classeScelta = new Wizard();

                int nAbility = 2;
                String[] sceltePossibili = {"Arcano", "Storia", "Intuizione", "Indagare", "Medicina", "Religione"};
                sceltaMultipla(2, personaggio, sceltePossibili, sc, "ABILITA");

                System.out.println("Ora bisogna scegliere l'equipaggiamento.\nScegli una sola tra le seguenti possibilità: ");

                System.out.println("Bastone/Pugnale");
                personaggio.addArmi(sc.nextLine(), sc);

                System.out.println("Borsa per componenti/Focus arcano");
                personaggio.addEquipaggiamento(sc.nextLine(), sc);

                System.out.println("Pacchetto da studioso/Pacchetto da esploratore");
                personaggio.addEquipaggiamento(sc.nextLine(), sc);

                // --- MAGIA MAGO ---
                // 1. Trucchetti
                sceltaMultipla(3, personaggio, MenuPrinter.TRUCCHETTI_MAGO, sc, "INCANTESIMO");
                sceltaMultipla(6, personaggio, MenuPrinter.INCANTESIMI_MAGO_LVL1, sc, "INCANTESIMO");
            }
            else{
                System.out.println("ATTENZIONE: questa razza non è valida. Riprova.");
            }
        }

        //applica tutte le modifiche legate alla classe
        personaggio.setSottoclasse(sottoclasseScelta);
        personaggio.setClasse(classeScelta);

        //Inserire dati estetici e caratteriali del personaggio
        System.out.println("Scegli il nome del tuo personaggio");
        personaggio.setNome(sc.nextLine());
        System.out.println("Scegli il sesso del tuo personaggio");
        personaggio.setSesso(sc.nextLine());
        boolean accettabile = false;
        while (!accettabile) {
            try {
                System.out.println("Scegli l'età del tuo personaggio");
                personaggio.setEta(sc.nextInt(), sc);
                accettabile = true;
            } catch (Exception InputMismatchException) {
                System.out.println("L'età inserita non è un numero");
                accettabile = false;
                sc.nextLine();
            }
        }
        accettabile = false;
        while (!accettabile) {
            try {
                System.out.println("Scegli l'altezza del tuo personaggio (in cm)");
                personaggio.setAltezza(sc.nextInt() ,sc);
                accettabile = true;
            } catch (Exception InputMismatchException) {
                System.out.println("L'altezzza inserita non è un numero");
                accettabile = false;
                sc.nextLine();
            }
        }
        accettabile = false;
        while (!accettabile) {
            try {
                System.out.println("Scegli il peso del tuo personaggio (in kg)");
                personaggio.setPeso(sc.nextDouble() ,sc);
                accettabile = true;
            } catch (Exception InputMismatchException) {
                System.out.println("Il peso inserita non è un numero");
                accettabile = false;
                sc.nextLine();
            }
        }
        sc.nextLine();
        System.out.println("Scegli gli occhi del tuo personaggio");
        personaggio.setOcchi(sc.nextLine());
        System.out.println("Scegli la carnagione del tuo personaggio");
        personaggio.setCarnagione(sc.nextLine());
        System.out.println("Scegli i capelli del tuo personaggio");
        personaggio.setCapelli(sc.nextLine());
        System.out.println("Scegli l'allineamento del tuo personaggio");
        personaggio.setAllineamento(sc.nextLine());

        //
        //  SCELTA BACKGROUND
        //

        Background backgroundScelto = null;
        sceltaValida = false;
        scelta = "";
        scelteExtra = "";

        while(!sceltaValida){
            System.out.println("\nInserire il background desiderato: ");
            MenuPrinter.stampaListaBackground();

            scelta = sc.nextLine().trim();

            if(scelta.equalsIgnoreCase("Accolito")){
                sceltaValida = true;
                backgroundScelto = new Acolyte();

                sceltaMultipla(2, personaggio, MenuPrinter.LINGUE, sc, "LINGUA");
            }
            else if(scelta.equalsIgnoreCase("Ciarlatano")){
                sceltaValida = true;
                backgroundScelto = new Charlatan();

                System.out.println("Scegli uno strumento per truffare: ");
                personaggio.addEquipaggiamento(sc.nextLine(), sc);
            }
            else if(scelta.equalsIgnoreCase("Criminale")){
                sceltaValida = true;
                backgroundScelto = new Criminal();

                System.out.println("Scegli un set di gioco (es. Dadi, Carte):");
                personaggio.addCompetenzaStrumenti(sc.nextLine(), sc);
            }
            else if(scelta.equalsIgnoreCase("Intrattenitore")){
                sceltaValida = true;
                backgroundScelto = new Entertainer();

                System.out.println("Scegli uno strumento musicale:");
                personaggio.addCompetenzaStrumenti(sc.nextLine(), sc);

                System.out.println("Scegli uno strumento musicale da possedere: ");
                personaggio.addEquipaggiamento(sc.nextLine(), sc);
            }
            else if(scelta.equalsIgnoreCase("Eroe Popolare")){
                sceltaValida = true;
                backgroundScelto = new FolkHero();

                System.out.println("Scegli un set di strumenti da artigiano (es. Falegname, Fabbro):");
                personaggio.addCompetenzaStrumenti(sc.nextLine(), sc);
            }
            else if(scelta.equalsIgnoreCase("Artigiano di Gilda")){
                sceltaValida = true;
                backgroundScelto = new GuildArtisan();

                System.out.println("Scegli un set di strumenti da artigiano:");
                personaggio.addCompetenzaStrumenti(sc.nextLine(), sc);

                System.out.println("Scegli un set di strumenti da artigiano da possedere: ");
                personaggio.addEquipaggiamento(sc.nextLine(), sc);

                sceltaMultipla(1, personaggio, MenuPrinter.LINGUE, sc, "LINGUA");
            }
            else if(scelta.equalsIgnoreCase("Eremita")){
                sceltaValida = true;
                backgroundScelto = new Hermit();

                sceltaMultipla(1, personaggio, MenuPrinter.LINGUE, sc, "LINGUA");
            }
            else if(scelta.equalsIgnoreCase("Nobile")){
                sceltaValida = true;
                backgroundScelto = new Noble();

                System.out.println("Scegli un set di gioco (es. Scacchi, Dadi):");
                personaggio.addCompetenzaStrumenti(sc.nextLine(), sc);
                sceltaMultipla(1, personaggio, MenuPrinter.LINGUE, sc, "LINGUA");
            }
            else if(scelta.equalsIgnoreCase("Forestiero")){
                sceltaValida = true;
                backgroundScelto = new Outlander();

                System.out.println("Scegli uno strumento musicale:");
                personaggio.addCompetenzaStrumenti(sc.nextLine(), sc);

                sceltaMultipla(1, personaggio, MenuPrinter.LINGUE, sc, "LINGUA");
            }
            else if(scelta.equalsIgnoreCase("Saggio")){
                sceltaValida = true;
                backgroundScelto = new Sage();

                sceltaMultipla(2, personaggio, MenuPrinter.LINGUE, sc, "LINGUA");
            }
            else if(scelta.equalsIgnoreCase("Marinaio")){
                sceltaValida = true;
                backgroundScelto = new Sailor();
                // Nessuna scelta extra (spesso hanno strumenti da navigatore fissi)
            }
            else if(scelta.equalsIgnoreCase("Soldato")){
                sceltaValida = true;
                backgroundScelto = new Soldier();

                System.out.println("Scegli un set di gioco (es. Carte, Dadi):");
                personaggio.addCompetenzaStrumenti(sc.nextLine(), sc);
            }
            else if(scelta.equalsIgnoreCase("Monello")){ // O "Urchin" se cambi il nome della classe
                sceltaValida = true;
                backgroundScelto = new Urchin(); // Uso il nome del tuo file attuale
                // Nessuna scelta extra
            }
            else {
                System.out.println("Background non valido. Riprova.");
            }
        }

        // Applica il background scelto al personaggio
        personaggio.setBackground(backgroundScelto);

        //
        //  SCELTA CARATTERISTICHE
        //
        personaggio.setStatistiche(sc);
        personaggio.setValoriSkill();
        personaggio.calcolaClasseArmatura(sc);
        personaggio.calcolaPercezionePassiva();
        personaggio.calcolaIniziativa();
        personaggio.calcolaPuntiFerita();

        //
        //STAMPA TUTTI I DATI DEL PERSONAGGIO
        //

        MenuPrinter.stampaPersonaggio(personaggio);

        System.out.println("Vuoi salvare il personaggio? (si/no)");
        if(sc.nextLine().equalsIgnoreCase("si")) {
            personaggio.salvaPersonaggio(personaggio.getNome() + ".dat");
        }

        sc.close();
    }

    //
    //  METODI HELPER
    //

    private static void sceltaMultipla(int quantita, Personaggio pg, String[] elencoScelte, Scanner sc, String tipo) {
        int contatore = 0;
        System.out.println("Scegli " + tipo.toLowerCase() + " tra:");
        MenuPrinter.stampaInColonne(elencoScelte);
        while (contatore < quantita) {
            System.out.print("Scelta " + (contatore + 1) + "/" + quantita + ": ");
            String input = sc.nextLine().trim();

            switch (tipo.toUpperCase()) {
                case "ABILITA":
                    pg.addCompetenza(input, sc);
                    break;
                case "ABILITA_QUATTRO":
                    pg.setBonusCompetenzaQuattro(input, sc);
                    break;
                case "LINGUA":
                    pg.addLanguage(input, sc);
                    break;
                case "ARMA":
                    pg.addArmi(input, sc);
                    break;
                case "COMP_STRUMENTO":
                    pg.addCompetenzaStrumenti(input, sc);
                    break;
                case "EQUIP":
                    pg.addEquipaggiamento(input, sc);
                    break;
                case "ARMATURA":
                    pg.addArmature(input, sc);
                    break;
                case "INCANTESIMO":
                    pg.addIncantesimi(input, sc, elencoScelte);
                    break;
                case "ADD_CAR":
                    pg.addCaratteristica(input,sc);
                    break;
                default:
                    System.out.println("Errore interno: Tipo '" + tipo + "' non gestito.");
                    break;
            }
            contatore++;
        }
    }
}