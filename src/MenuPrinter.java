public class MenuPrinter {

    public static final String[] RAZZE = {
            "Dragonide", "Elfo", "Gnomo", "Mezzelfo", "Halfling",
            "Mezzorco", "Umano", "Nano", "Tiefling"
    };

    public static final String[] SOTTORAZZE_ELFO = {"Elfo alto", "Elfo dei boschi", "Elfo oscuro"};
    public static final String[] SOTTORAZZE_GNOMO= {"Gnomo delle foreste", "Gnomo delle rocce"};
    public static final String[] SOTTORAZZE_HALFLING = {"Halfling piedelesto", "Halfling tozzo"};
    public static final String[] SOTTORAZZE_NANO = {"Nano delle colline", "Nano delle montagne"};
    public static final String[] CLASSI = {
            "Barbaro", "Bardo", "Chierico", "Druido", "Guerriero", "Monaco",
            "Paladino", "Ranger", "Ladro", "Stregone", "Warlock", "Mago"
    };

    public static final String[] SOTTOCLASSI_CHIERICO = {
            "Knowledge domain", "Life domain", "Light domain", "Nature domain",
            "Tempest domain", "Trickery domain", "War domain"
    };
    public static final String[] SOTTOCLASSI_STREGONE = {"Discendenza draconica", "Wild magic"};
    public static final String[] SOTTOCLASSI_WARLOCK = {"The archfey", "The fiend", "The great old one"};


    public static final String[] TRUCCHETTI_BARDO  = {
            "Amicizia", "Beffa Crudele", "Colpo Accurato",
            "Illusione Minore", "Luce", "Luci Danzanti",
            "Mano Magica", "Messaggio", "Prestidigitazione",
            "Riparare"
    };

    public static final  String[] INCANTESIMI_BARDO_LVL1 = {
            "Amicizia Animale", "Caduta Morbida", "Charme su Persone",
            "Cura Ferite", "Identificare", "Individuazione Magico",
            "Onda Tonante", "Parola Guaritrice", "Risata Incontenibile",
            "Sonno"
    };

    public static final String[] TRUCCHETTI_CHIERICO = {
            "Fiamma Sacra", "Guida", "Luce",
            "Resistenza", "Riparare", "Risparmiare i Morenti",
            "Taumaturgia"
    };
    public static final String[] INCANTESIMI_CHIERICO_LVL1 = {
            "Benedizione", "Comando", "Cura Ferite", "Dardo Guida", "Individuazione Magico",
            "Infliggi Ferite", "Parola Guaritrice", "Protezione Bene/Male", "Santuario", "Scudo della Fede"
    };
    public static final String[] TRUCCHETTI_DRUIDO = {
            "Artificio Druidico", "Frusta di Spine", "Guida",
            "Produrre Fiamma", "Randello Incantato", "Resistenza",
            "Riparare", "Spruzzo Velenoso"
    };
    public static final String[] INCANTESIMI_DRUIDO_LVL1 = {
            "Amicizia Animale", "Bacche Benefiche", "Cura Ferite",
            "Individuazione Magico", "Intralciare", "Onda Tonante",
            "Parola Guaritrice", "Parlare con Animali", "Purificare Cibo"
    };
    public static final String[] TRUCCHETTI_STREGONE = {
            "Colpo Accurato", "Dardo di Fuoco", "Fiotto Acido",
            "Illusione Minore", "Luce", "Luci Danzanti",
            "Mano Magica", "Messaggio", "Prestidigitazione",
            "Raggio di Gelo", "Riparare", "Spruzzo Velenoso",
            "Stretta Folgorante", "Tocco Gelido"
    };
    public static final String[] INCANTESIMI_STREGONE_LVL1 = {
            "Armatura Magica", "Caduta Morbida", "Charme su Persone",
            "Dardo Incantato", "Immagine Silenziosa", "Mani Brucianti",
            "Onda Tonante", "Scudo", "Sonno",
            "Spruzzo Colorato"
    };
    public static final String[] TRUCCHETTI_WARLOCK = {
            "Colpo Accurato", "Deflagrazione Occulta", "Illusione Minore",
            "Mano Magica", "Prestidigitazione", "Spruzzo Velenoso",
            "Tocco Gelido"
    };
    public static final String[] INCANTESIMI_WARLOCK_LVL1 = {
            "Armatura di Agathys", "Braccia di Hadar", "Charme su Persone",
            "Comprensione Linguaggi", "Esilio", "Incutere Paura",
            "Malocchio", "Protezione Bene/Male", "Ritirata Rapida",
            "Servitore Inosservato"
    };
    public static final String[] TRUCCHETTI_MAGO = {
            "Colpo Accurato", "Dardo di Fuoco", "Fiotto Acido",
            "Illusione Minore", "Luce", "Luci Danzanti",
            "Mano Magica", "Messaggio", "Prestidigitazione",
            "Raggio di Gelo", "Riparare", "Spruzzo Velenoso",
            "Stretta Folgorante", "Tocco Gelido"
    };
    public static final String[] INCANTESIMI_MAGO_LVL1 = {
            "Armatura Magica", "Caduta Morbida", "Charme su Persone",
            "Dardo Incantato", "Identificare", "Immagine Silenziosa",
            "Individuazione Magico", "Mani Brucianti", "Onda Tonante",
            "Scudo", "Sonno"
    };
    public static final String[] LINGUE = {
            "Comune", "Nanico", "Elfico", "Gigantico", "Gnomico",
            "Goblin", "Halfling", "Orco", "Abissale", "Celestiale",
            "Draconico", "Deep speech", "Infernale", "Primordiale",
            "Silvano", "Non comune"
    };
    public static final String[] BACKGROUND = {
            "Accolito", "Ciarlatano", "Criminale", "Intrattenitore",
            "Eroe Popolare", "Artigiano di Gilda", "Eremita", "Nobile",
            "Forestiero", "Saggio", "Marinaio", "Soldato", "Monello"
    };

    public static final String[] LISTA_CARATTERISTICHE = {
            "Forza", "Destrezza", "Costituzione",
            "Intelligenza", "Saggezza", "Carisma"
    };

    public static final String[] LISTA_ABILITA = {
            "Acrobazia", "Addestrare animali", "Arcano", "Atletica",
            "Furtività", "Indagare", "Inganno", "Intimidire",
            "Intrattenere", "Intuizione", "Medicina", "Natura",
            "Percezione", "Persuasione", "Rapidità di mano",
            "Religione", "Sopravvivenza", "Storia"
    };

    public static void printListaRazze() {
        stampaInColonne(RAZZE);
    }

    public static void printListaSottorazzeElfo() {
        stampaInColonne(SOTTORAZZE_ELFO);
    }

    public static void printListaSottorazzeGnomo() {
        stampaInColonne(SOTTORAZZE_GNOMO);
    }

    public static void printListaSottorazzeHalfling() {
        stampaInColonne(SOTTORAZZE_HALFLING);
    }

    public static void printListaSottorazzeNano() {
        stampaInColonne(SOTTORAZZE_NANO);
    }

    public static void printListaClassi() {
        stampaInColonne(CLASSI);
    }

    public static void printListaSottoclassiChierico() {
        stampaInColonne(SOTTOCLASSI_CHIERICO);
    }

    public static void printListaSottoclassiStregone() {
        stampaInColonne(SOTTOCLASSI_STREGONE);
    }

    public static void printListaDiscendenzeDraconiche() {
        String format = "%-15s %-15s %s%n";
        System.out.printf(format, "COLORE", "DANNO", "AREA SOFFIO");
        System.out.println("-----------------------------------------------------");

        System.out.printf(format, "Nero", "Acido", "1.5m x 9m linea");
        System.out.printf(format, "Blu", "Fulmine", "1.5m x 9m linea");
        System.out.printf(format, "Ottone", "Fuoco", "1.5m x 9m linea");
        System.out.printf(format, "Bronzo", "Fulmine", "1.5m x 9m linea");
        System.out.printf(format, "Rame", "Fuoco", "1.5m x 9m linea");
        System.out.printf(format, "Oro", "Acido", "4.5m cono");
        System.out.printf(format, "Verde", "Veleno", "4.5m cono");
        System.out.printf(format, "Rosso", "Fuoco", "4.5m cono");
        System.out.printf(format, "Argento", "Gelo", "4.5m cono");
        System.out.printf(format, "Bianco", "Gelo", "4.5m cono");
    }

    public static void printListaSottoclassiWarlock() {
        stampaInColonne(SOTTOCLASSI_WARLOCK);
    }

    private static void stampaIntestazioneArmi() {
        String format = "%-20s %-18s %s%n";
        System.out.printf(format, "NOME", "DANNO", "PROPRIETÀ");
        System.out.println("-----------------------------------------------------------------------");
    }

    public static void printListaArmiSempliciMischia() {
        stampaIntestazioneArmi();
        String format = "%-20s %-18s %s%n";
        System.out.printf(format, "Club", "1d4 bludgeoning", "Light");
        System.out.printf(format, "Dagger", "1d4 piercing", "Finesse, light, thrown (20/60)");
        System.out.printf(format, "Greatclub", "1d8 bludgeoning", "Two-handed");
        System.out.printf(format, "Handaxe", "1d6 slashing", "Light, thrown (20/60)");
        System.out.printf(format, "Javelin", "1d6 piercing", "Thrown (30/120)");
        System.out.printf(format, "Light hammer", "1d4 bludgeoning", "Light, thrown (20/60)");
        System.out.printf(format, "Mace", "1d6 bludgeoning", "-");
        System.out.printf(format, "Quarterstaff", "1d6 bludgeoning", "Versatile (1d8)");
        System.out.printf(format, "Sickle", "1d4 slashing", "Light");
        System.out.printf(format, "Spear", "1d6 piercing", "Thrown (20/60), versatile (1d8)");
        System.out.printf(format, "Unarmed strike", "1 bludgeoning", "-");
    }

    public static void printListaArmiSempliciDistanza() {
        String format = "%-20s %-18s %s%n";
        stampaIntestazioneArmi();
        System.out.printf(format, "Crossbow, light", "1d8 piercing", "Ammo (80/320), loading, two-handed");
        System.out.printf(format, "Dart", "1d4 piercing", "Finesse, thrown (20/60)");
        System.out.printf(format, "Shortbow", "1d6 piercing", "Ammo (80/320), two-handed");
        System.out.printf(format, "Sling", "1d4 bludgeoning", "Ammo (30/120)");
    }

    public static void printListaArmiMarzialiMischia() {
        String format = "%-20s %-18s %s%n";
        stampaIntestazioneArmi();
        System.out.printf(format, "Battleaxe", "1d8 slashing", "Versatile (1d10)");
        System.out.printf(format, "Flail", "1d8 bludgeoning", "-");
        System.out.printf(format, "Glaive", "1d10 slashing", "Heavy, reach, two-handed");
        System.out.printf(format, "Greataxe", "1d12 slashing", "Heavy, two-handed");
        System.out.printf(format, "Greatsword", "2d6 slashing", "Heavy, two-handed");
        System.out.printf(format, "Halberd", "1d10 slashing", "Heavy, reach, two-handed");
        System.out.printf(format, "Lance", "1d12 piercing", "Reach, special");
        System.out.printf(format, "Longsword", "1d8 slashing", "Versatile (1d10)");
        System.out.printf(format, "Maul", "2d6 bludgeoning", "Heavy, two-handed");
        System.out.printf(format, "Morningstar", "1d8 piercing", "-");
        System.out.printf(format, "Pike", "1d10 piercing", "Heavy, reach, two-handed");
        System.out.printf(format, "Rapier", "1d8 piercing", "Finesse");
        System.out.printf(format, "Scimitar", "1d6 slashing", "Finesse, light");
        System.out.printf(format, "Shortsword", "1d6 piercing", "Finesse, light");
        System.out.printf(format, "Trident", "1d6 piercing", "Thrown (20/60), versatile (1d8)");
        System.out.printf(format, "War pick", "1d8 piercing", "-");
        System.out.printf(format, "Warhammer", "1d8 bludgeoning", "Versatile (1d10)");
        System.out.printf(format, "Whip", "1d4 slashing", "Finesse, reach");
    }

    public static void printListaArmiMarzialiDistanza() {
        String format = "%-20s %-18s %s%n";
        stampaIntestazioneArmi();
        System.out.printf(format, "Blowgun", "1 piercing", "Ammo (25/100), loading");
        System.out.printf(format, "Crossbow, hand", "1d6 piercing", "Ammo (30/120), light, loading");
        System.out.printf(format, "Crossbow, heavy", "1d10 piercing", "Ammo (100/400), heavy, loading, 2H");
        System.out.printf(format, "Longbow", "1d8 piercing", "Ammo (150/600), heavy, two-handed");
        System.out.printf(format, "Net", "-", "Special, thrown (5/15)");
    }

    private static void stampaIntestazioneArmature() {
        System.out.printf("%-25s %-20s %s%n", "NOME", "CLASSE ARMATURA (CA)", "FURTIVITÀ");
        System.out.println("-----------------------------------------------------------------------");
    }

    public static void stampaArmatureLeggere() {
        System.out.println("\n--- Armature Leggere ---");
        stampaIntestazioneArmature();
        // Format: Nome, CA, Furtività
        String format = "%-25s %-20s %s%n";

        System.out.printf(format, "Imbottita", "11 + Des", "Svantaggio");
        System.out.printf(format, "Armatura di cuoio", "11 + Des", "-");
        System.out.printf(format, "Cuoio borchiato", "12 + Des", "-");
    }

    public static void stampaArmatureMedie() {
        System.out.println("\n--- Armature Medie ---");
        stampaIntestazioneArmature();
        String format = "%-25s %-20s %s%n";

        System.out.printf(format, "Pelle", "12 + Des (max 2)", "-");
        System.out.printf(format, "Giaco di maglia", "13 + Des (max 2)", "-");
        System.out.printf(format, "Corazza di scaglie", "14 + Des (max 2)", "Svantaggio");
        System.out.printf(format, "Corazza di piastre", "14 + Des (max 2)", "-");
        System.out.printf(format, "Mezza armatura a piastre", "15 + Des (max 2)", "Svantaggio");
    }

    public static void stampaArmaturePesanti() {
        System.out.println("\n--- Armature Pesanti ---");
        stampaIntestazioneArmature();
        String format = "%-25s %-20s %s%n";

        System.out.printf(format, "Corazza ad anelli", "14", "Svantaggio");
        System.out.printf(format, "Cotta di maglia", "16", "Svantaggio");
        System.out.printf(format, "Corazza a strisce", "17", "Svantaggio");
        System.out.printf(format, "Armatura completa", "18", "Svantaggio");
    }

    public static void stampaTrucchettiBardo() {
        stampaInColonne(TRUCCHETTI_BARDO);
    }
    public static void stampaIncantesimiLiv1Bardo() {
        stampaInColonne(INCANTESIMI_BARDO_LVL1);
    }
    public static void stampaTrucchettiChierico() {
        stampaInColonne(TRUCCHETTI_CHIERICO);
    }
    public static void stampaIncantesimiLiv1Chierico() {
        stampaInColonne(INCANTESIMI_CHIERICO_LVL1);
    }
    public static void stampaTrucchettiDruido() {
        stampaInColonne(TRUCCHETTI_DRUIDO);
    }
    public static void stampaIncantesimiLiv1Druido() {
        stampaInColonne(INCANTESIMI_DRUIDO_LVL1);
    }
    public static void stampaTrucchettiStregone() {
        stampaInColonne(TRUCCHETTI_STREGONE);
    }
    public static void stampaIncantesimiLiv1Stregone() {
        stampaInColonne(INCANTESIMI_STREGONE_LVL1);
    }
    public static void stampaTrucchettiWarlock() {
        stampaInColonne(TRUCCHETTI_WARLOCK);
    }
    public static void stampaIncantesimiLiv1Warlock() {
        stampaInColonne(INCANTESIMI_WARLOCK_LVL1);
    }
    public static void stampaTrucchettiMago() {
        stampaInColonne(TRUCCHETTI_MAGO);
    }
    public static void stampaIncantesimiLiv1Mago() {
        stampaInColonne(INCANTESIMI_MAGO_LVL1);
    }
    public static void stampaListaLingue() {
        stampaInColonne(LINGUE);
    }
    public static void stampaListaBackground() {
        stampaInColonne(BACKGROUND);
    }

    public static void stampaInColonne(String[] lista) {
        String format = "%-25s %-25s %-25s%n";
        for (int i = 0; i < lista.length; i += 3) {
            String s1 = lista[i];
            String s2 = (i + 1 < lista.length) ? lista[i + 1] : "";
            String s3 = (i + 2 < lista.length) ? lista[i + 2] : "";
            System.out.printf(format, s1, s2, s3);
        }
    }

    public static boolean contains(String[] lista, String elemento){
        for(String s : lista){
            if(s.equalsIgnoreCase(elemento)){
                return true;
            }
        }
        return false;
    }

    public static void stampaPersonaggio(Personaggio pg) {
        System.out.println("\n\n\n---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        System.out.println("Ecco la scheda del tuo personaggio");

        System.out.println("---------------------------------------------------");
        System.out.println("Nome personaggio: " + pg.getNome());
        System.out.println("Classe: " + pg.getClasse().getNomeClasse());
        System.out.println("Background: " + pg.getBackground().getNomeBackground());
        System.out.println("Razza: " + pg.getRazza().getNomeRazza());
        System.out.println("Allineamento: " + pg.getAllineamento());

        System.out.println("\n---------------------------------------------------");
        System.out.println("Caratteristiche: ");
        for(String key : pg.getCaratteristiche().keySet()){
            System.out.println(key + ": " + pg.getCaratteristiche().get(key));
        }

        System.out.println("---------------------------------------------------");
        System.out.println("Bonus di competenza: " + pg.getClasse().getBonusCompetenza());

        System.out.println("\n---------------------------------------------------");
        System.out.println("Competenza tiri salvezza: ");
        System.out.println(pg.getCompetenzaTiriSalvezza());

        System.out.println("\n---------------------------------------------------");
        System.out.println("Abilità: ");
        for(String key : pg.getMappaSkill().keySet()){
            System.out.println(key + ": " + pg.getMappaSkill().get(key).getValoreBonus());
        }

        System.out.println("\n---------------------------------------------------");
        System.out.println("Percezione passiva: " + pg.getPercezionePassiva());

        System.out.println("\n---------------------------------------------------");
        System.out.println("Altre competenze & linguaggi:");
        System.out.println(pg.getLanguages());
        System.out.println("Competenza in armi:");
        System.out.println(pg.getCompetenzaArmi());
        System.out.println("Competenza in armature:");
        System.out.println(pg.getCompetenzaArmature());
        System.out.println("Competenza negli strumenti:");
        System.out.println(pg.getCompetenzaStrumenti());

        System.out.println("\n---------------------------------------------------");
        System.out.println("CA: " + pg.getClasseArmature());
        System.out.println("Iniziativa: " + pg.getIniziativa());
        System.out.println("Velocità: " + pg.getRazza().getBaseSpeed());
        System.out.println("Punti ferita: " + pg.getPuntiFerita());
        System.out.println("Dadi vita: " + pg.getClasse().getHitDice());

        System.out.println("\n---------------------------------------------------");
        System.out.println("Equipaggiamento:");
        System.out.println(pg.getEquipaggiamento());
        System.out.println("Armature:");
        System.out.println(pg.getArmature());
        System.out.println("Armi:");
        System.out.println(pg.getArmi());

        System.out.println("\n---------------------------------------------------");
        System.out.println("Privilegi & tratti:");
        System.out.println("Da classe:");
        System.out.println(pg.getPrivilegiClasse());
        if(pg.getRazza().getScurovisione()){
            System.out.println("Scurovisione: 9m");
        }
        System.out.println("Da background:");
        System.out.println(pg.getPrivilegiBackground());
        System.out.println("Resistenze: ");
        System.out.println(pg.getResistance());
        System.out.println("Vantaggio nei tiri salvezza:");
        System.out.println(pg.getVantaggiTiriSalvezza());
        System.out.println("Altro: ");
        System.out.println(pg.getBonusExtra());

        System.out.println("\n---------------------------------------------------");
        System.out.println("Età: " + pg.getEta());
        System.out.println("Altezza: " + pg.getAltezza());
        System.out.println("Peso: " + pg.getPeso());
        System.out.println("Occhi: " + pg.getOcchi());
        System.out.println("Carnagione: " + pg.getCarnagione());
        System.out.println("Capelli: " + pg.getCapelli());

        System.out.println("\n---------------------------------------------------");
        if(pg.getClasse().getCaratteristicaIncantatore() != null){
            System.out.println("Caratteristica da incantatore: " + pg.getClasse().getCaratteristicaIncantatore());
            System.out.println("CD Tiro Salvezza Incantesimi: " + (8 + pg.getModificatoreCaratteristiche(pg.getClasse().getCaratteristicaIncantatore()   ) + pg.getClasse().getBonusCompetenza()));
            System.out.printf("Bonus di Attacco Incantesimi: %+d%n", pg.getModificatoreCaratteristiche(pg.getClasse().getCaratteristicaIncantatore()) + pg.getClasse().getBonusCompetenza());
            System.out.println("Lista incantesimi:");
            System.out.println(pg.getIncantesimiConosciuti());
        }
        else {
            System.out.println("Non sei un incantatore");
        }

    }
}
