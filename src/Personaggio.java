import background.Background;
import classi.*;
import classi.sottoclassi.Sottoclasse;
import razze.*;
import razze.sottorazze.Sottorazza;

import java.io.Serializable;
import java.util.*;

public class Personaggio implements Serializable {

    //  ABILITà
    private HashMap<String, Integer> caratteristiche;
    private Map<String, Skill> mappaSkill;

    //  EQUIPAGGIAMENTO
    private ArrayList<String> equipaggiamento;
    private ArrayList<String> armature;
    private ArrayList<String> armi;

    //  PRIVILEGI E TRATTI
    private ArrayList<String> competenzaArmi;
    private ArrayList<String> competenzaArmature;
    private ArrayList<String> competenzaStrumenti;
    private ArrayList<String> resistance;
    private ArrayList<String> vantaggiTiriSalvezza;
    private ArrayList<String> bonusExtra;
    private ArrayList<String> incantesimiConosciuti;
    private ArrayList<String> svantaggi;
    private ArrayList<String> privilegiClasse;
    private ArrayList<String> privilegiBackground;

    //  ALTRE COMPETENZE E LINGUE
    private ArrayList<String> languages;
    private ArrayList<String> competenzaTiriSalvezza;

    //  SCELTE (RAZZA, CLASSE, BACKGROUND)
    private Razza razzaScelta;
    private Sottorazza sottorazzaScelta;
    private Classe classeScelta;
    private Sottoclasse sottoclasseScelta;
    private Background backgroundScelto;

    //  DATI DEL PERSONAGGIO
    private int puntiFerita;
    private int classeArmatura;
    private int iniziativa;
    private int percezionePassiva;

    //  CARATTERISTICHE FISICHE E CARATTERIALI
    private String nomePersonaggio;
    private String sesso;
    private int eta;
    private double peso;
    private int altezza;
    private String occhi;
    private String carnagione;
    private String capelli;
    private String allineamento;

    //
    //  COSTRUTTORE PERSONAGGIO
    //

    public Personaggio() {

        //crea la HashMap delle caratteristiche
        caratteristiche = new LinkedHashMap<>();
        //Carico l'HashMap
        //ATTENZIONE va sempre caricata in un metodo/costruttore
        caratteristiche.put("Forza", 10);
        caratteristiche.put("Destrezza", 10);
        caratteristiche.put("Costituzione", 10);
        caratteristiche.put("Intelligenza", 10);
        caratteristiche.put("Saggezza", 10);
        caratteristiche.put("Carisma", 10);

        //creo abilità
        mappaSkill = new LinkedHashMap<>();
        //Riempimento Mappa
        this.mappaSkill.put("Acrobazia", new Skill("Acrobazia", "Destrezza"));
        this.mappaSkill.put("Addestrare animali", new Skill("Addestrare animali", "Saggezza"));
        this.mappaSkill.put("Arcano", new Skill("Arcani", "Intelligenza"));
        this.mappaSkill.put("Atletica", new Skill("Atletica", "Forza"));
        this.mappaSkill.put("Furtività", new Skill("Furtività", "Destrezza"));
        this.mappaSkill.put("Indagare", new Skill("Indagare", "Intelligenza"));
        this.mappaSkill.put("Inganno", new Skill("Inganno", "Carisma"));
        this.mappaSkill.put("Intimidire", new Skill("Intimidire", "Carisma"));
        this.mappaSkill.put("Intrattenere", new Skill("Intrattenere", "Carisma"));
        this.mappaSkill.put("Intuizione", new Skill("Intuizione", "Saggezza"));
        this.mappaSkill.put("Medicina", new Skill("Medicina", "Saggezza"));
        this.mappaSkill.put("Natura", new Skill("Natura", "Intelligenza"));
        this.mappaSkill.put("Percezione", new Skill("Percezione", "Saggezza"));
        this.mappaSkill.put("Persuasione", new Skill("Persuasione", "Carisma"));
        this.mappaSkill.put("Rapidità di mano", new Skill("Rapidità di mano", "Destrezza"));
        this.mappaSkill.put("Religione", new Skill("Religione", "Intelligenza"));
        this.mappaSkill.put("Sopravvivenza", new Skill("Sopravvivenza", "Saggezza"));
        this.mappaSkill.put("Storia", new Skill("Storia", "Intelligenza"));

        //creo lista delle lingue conosciute
        languages = new ArrayList<>();

        //creo la lista delle resistenze
        resistance = new ArrayList<>();

        //creo la lista dei vantaggi in tiri salvezza
        vantaggiTiriSalvezza = new ArrayList<>();

        //creo la lista dei bonus extra
        bonusExtra = new ArrayList<>();

        competenzaArmi = new ArrayList<>();

        competenzaArmature = new ArrayList<>();

        competenzaStrumenti = new ArrayList<>();

        incantesimiConosciuti = new ArrayList<>();

        equipaggiamento = new ArrayList<>();

        competenzaTiriSalvezza = new ArrayList<>();

        privilegiClasse = new ArrayList<>();

        puntiFerita = 0;

        nomePersonaggio = "";
        sesso = "";
        eta = 0;
        peso = 0;
        altezza = 0;
        occhi = "";
        carnagione = "";
        capelli = "";
        allineamento = "";

        privilegiBackground = new ArrayList<>();

        iniziativa = 0;
        percezionePassiva = 10;
        classeArmatura = 0;

        armature = new ArrayList<>();

        svantaggi = new ArrayList<>();

        armi = new ArrayList<>();
    }

    //
    //  METODI CHE IMPOSTANO I DATI IN BASE A RAZZA, CLASSE, BACKGROUND
    //

    public void setRazza(Razza razzaInput) {
        razzaScelta = razzaInput;
        //razzaScelta.applicaBonusRazziali(caratteristiche);
        razzaScelta.applicaCompetenza(mappaSkill);
        razzaScelta.knownLanguages(languages);
        razzaScelta.applicaResistenze(resistance);
        razzaScelta.applicaAdvSt(vantaggiTiriSalvezza);
        razzaScelta.applicaBonusExtra(bonusExtra);
        razzaScelta.applicaCompetenzaArmi(competenzaArmi);
        razzaScelta.applicaCompetenzaArmature(competenzaArmature);
        razzaScelta.applicaIncantesimiConosciuti(incantesimiConosciuti);
        razzaScelta.applicaCompetenzaStrumenti(competenzaStrumenti);
    }

    public void setSottorazza(Sottorazza sottorazzaInput) {
        this.sottorazzaScelta = sottorazzaInput;
    }

    public void setClasse(Classe classeInput) {
        classeScelta = classeInput;
        classeScelta.applicaCompetenzaArmature(competenzaArmature);
        classeScelta.applicaCompetenzaArmi(competenzaArmi);
        classeScelta.applicaCompetenzaStrumenti(competenzaStrumenti);
        classeScelta.applicaEquipaggiamento(equipaggiamento);
        classeScelta.applicaArmature(armature);
        classeScelta.applicaArmi(armi);
        classeScelta.applicaCompetenzaTiriSalvezza(competenzaTiriSalvezza);
        classeScelta.applicaPrivilegiClasse(privilegiClasse);
        classeScelta.addSpells(incantesimiConosciuti);
        classeScelta.addResistance(resistance);
    }

    public void setSottoclasse(Sottoclasse sottoclasseInput) {
        this.sottoclasseScelta = sottoclasseInput;
    }

    public void setBackground(Background backgroundInput) {
        backgroundScelto = backgroundInput;
        backgroundScelto.applicaCompetenzeAbilita(mappaSkill);
        backgroundScelto.applicaCompetenzaStrumenti(competenzaStrumenti);
        backgroundScelto.applicaEquipaggiamento(equipaggiamento);
        backgroundScelto.applicaPrivilegiBackground(privilegiBackground);
    }

    //
    //  METODI GETTER
    //

    public Razza getRazza() {
        return this.razzaScelta;
    }

    public Sottorazza getSottorazza() {
        return this.sottorazzaScelta;
    }

    public Classe getClasse() {
        return this.classeScelta;
    }

    public Sottoclasse getSottoclasse() {
        return this.sottoclasseScelta;
    }

    public Background getBackground() {
        return this.backgroundScelto;
    }

    public int getModificatoreCaratteristiche(String nomeCaratteristica) {
        int punteggio = caratteristiche.get(nomeCaratteristica);
        return Math.floorDiv(punteggio - 10, 2);
    }

    public String getNome() {
        return this.nomePersonaggio;
    }

    public String getSesso() {
        return this.sesso;
    }

    public int getEta() {
        return this.eta;
    }

    public int getAltezza() {
        return this.altezza;
    }

    public double getPeso() {
        return this.peso;
    }

    public String getOcchi() {
        return this.occhi;
    }

    public String getCarnagione() {
        return this.carnagione;
    }

    public String getCapelli() {
        return this.capelli;
    }

    public String getAllineamento() {
        return this.allineamento;
    }

    public int getPercezionePassiva() {
        return this.percezionePassiva;
    }

    public int getClasseArmature() {
        return this.classeArmatura;
    }

    public int getIniziativa() {
        return this.iniziativa;
    }

    public int getPuntiFerita() {
        return this.puntiFerita;
    }

    public Map<String, Integer> getCaratteristiche() {
        return caratteristiche;
    }

    public Map<String, Skill> getMappaSkill() {
        return mappaSkill;
    }

    public ArrayList<String> getLanguages() {
        return languages;
    }

    public ArrayList<String> getResistance() {
        return resistance;
    }

    public ArrayList<String> getVantaggiTiriSalvezza() {
        return vantaggiTiriSalvezza;
    }

    public ArrayList<String> getBonusExtra() {
        return bonusExtra;
    }

    public ArrayList<String> getCompetenzaArmi() {
        return competenzaArmi;
    }

    public ArrayList<String> getCompetenzaArmature() {
        return competenzaArmature;
    }

    public ArrayList<String> getCompetenzaStrumenti() {
        return competenzaStrumenti;
    }

    public ArrayList<String> getIncantesimiConosciuti() {
        return incantesimiConosciuti;
    }

    public ArrayList<String> getEquipaggiamento() {
        return equipaggiamento;
    }

    public ArrayList<String> getArmature() {
        return armature;
    }

    public ArrayList<String> getArmi() {
        return armi;
    }

    public ArrayList<String> getCompetenzaTiriSalvezza() {
        return competenzaTiriSalvezza;
    }

    public ArrayList<String> getPrivilegiClasse() {
        return privilegiClasse;
    }

    public ArrayList<String> getPrivilegiBackground() {
        return privilegiBackground;
    }

    //
    //  METODI SETTER
    //

    public void setValoriSkill() {
        int modCaretteristica = 0;
        for (String i : mappaSkill.keySet()) {
            Skill skill = mappaSkill.get(i);
            int temp = skill.getValoreBonus();
            modCaretteristica = getModificatoreCaratteristiche(skill.getCaratteristicaAssociata());
            if (temp != 4 && skill.hasCompetenza()) {
                skill.setValoreBonus(modCaretteristica + 2);
            } else if (temp == 4) {
                skill.setValoreBonus(modCaretteristica + 4);
            } else {
                skill.setValoreBonus(modCaretteristica);
            }
        }
    }

    public void setBonusCompetenzaQuattro(String competenzaQuattro, Scanner sc) {
        competenzaQuattro = competenzaQuattro.trim();

        while (true) {
            if (!mappaSkill.containsKey(competenzaQuattro)) {
                System.out.println("Errore: L'abilità '" + competenzaQuattro + "' non esiste. Riprova (es. Furtività, Arcano):");
                competenzaQuattro = sc.nextLine().trim();
                continue; // Ricomincia il ciclo
            }

            Skill skill = mappaSkill.get(competenzaQuattro);

            if (classeScelta != null && classeScelta.getNomeClasse().equalsIgnoreCase("Ladro")) {
                if (!skill.hasCompetenza()) {
                    System.out.println("Errore: Come Ladro, puoi applicare la Maestria solo su abilità che già conosci.");
                    System.out.println("Hai scelto '" + competenzaQuattro + "' ma non sei competente. Scegline un'altra:");
                    competenzaQuattro = sc.nextLine().trim();
                    continue;
                }
            }

            if (sottoclasseScelta != null && sottoclasseScelta.getNomeSottoclasse().equalsIgnoreCase("Dominio della conoscenza")) {
                // Il dominio permette solo queste 4
                String[] ammesse = {"Arcano", "Storia", "Natura", "Religione"};
                boolean isValida = false;
                for (String s : ammesse) {
                    if (s.equalsIgnoreCase(competenzaQuattro)) isValida = true;
                }

                if (!isValida) {
                    System.out.println("Errore: Per il Dominio della Conoscenza devi scegliere tra: Arcano, Storia, Natura, Religione.");
                    competenzaQuattro = sc.nextLine().trim();
                    continue;
                }
            }
            break;
        }
        mappaSkill.get(competenzaQuattro).setValoreBonus(4);
        mappaSkill.get(competenzaQuattro).setCompetenza(true);
    }

    public void setNome(String nome) {
        this.nomePersonaggio = nome;
    }

    public void setSesso(String sessoIn) {
        this.sesso = sessoIn;
    }

    public void setEta(int etaIn, Scanner sc) {
        while (etaIn <= 0) {
            sc.nextLine();
            System.out.println("Non puoi avere età negativa. Riprova");
            etaIn = sc.nextInt();
        }
        this.eta = etaIn;
    }

    public void setAltezza(int altezzaIn, Scanner sc) {
        while (altezzaIn < 0) {
            sc.nextLine();
            System.out.println("Non puoi avere altezzaIn negativa. Riprova");
            altezzaIn = sc.nextInt();
        }
        this.altezza = altezzaIn;
    }

    public void setPeso(double pesoIn, Scanner sc) {
        while (pesoIn < 0) {
            sc.nextLine();
            System.out.println("Non puoi avere pesoIn negativo. Riprova");
            pesoIn = sc.nextInt();
        }
        this.peso = pesoIn;
    }

    public void setOcchi(String occhi) {
        this.occhi = occhi;
    }

    public void setCarnagione(String carnagione) {
        this.carnagione = carnagione;
    }

    public void setCapelli(String capelli) {
        this.capelli = capelli;
    }

    public void setAllineamento(String allineamento) {
        this.allineamento = allineamento;
    }

    //
    //  METODI PER AGGIUNGERE/MODIFICARE IL PERSONAGGIO
    //

    public void addCaratteristica(String abalityScore, Scanner sc) {
        while (!caratteristiche.containsKey(abalityScore)) {
            System.out.println("La caratteristica inserita non esite. Riprova");
            abalityScore = sc.nextLine();
        }
        caratteristiche.put(abalityScore, caratteristiche.get(abalityScore) + 1);
    }

    public void addCompetenza(String competenza, Scanner sc) {
        while (true) {
            if (!mappaSkill.containsKey(competenza)) {
                System.out.println("Errore: L'abilità '" + competenza + "' non esiste nel manuale. Assicurati di scriverla correttamente.");
                System.out.print("Inserisci il nome corretto: ");
                competenza = sc.nextLine();
                continue;
            }

            if (mappaSkill.get(competenza).hasCompetenza()) {
                System.out.println("Hai già la competenza in '" + competenza + "'.");
                System.out.print("Scegli un'altra abilità tra quelle disponibili: ");

                competenza = sc.nextLine();
                continue;
            }

            mappaSkill.get(competenza).setCompetenza(true);
            break;
        }
    }

    public void addLanguage(String nomeLanguage, Scanner sc) {
        while (true) {
            if (!MenuPrinter.contains(MenuPrinter.LINGUE, nomeLanguage)) {
                System.out.println("La lingua inserita non esite. Riprova");
                nomeLanguage = sc.nextLine().trim();
                continue;
            }
            if (languages.contains(nomeLanguage)) {
                System.out.println("Conosci già la lingua " + nomeLanguage + ".\nScegli un'altra lingua: ");
                nomeLanguage = sc.nextLine().trim();
            }

            languages.add(nomeLanguage);
            break;
        }
    }

    public void addCompetenzaStrumenti(String competenzaStrumentiExtra, Scanner sc) {
        while (competenzaStrumenti.contains(competenzaStrumentiExtra)) {
            System.out.println("Hai già competenza con " + competenzaStrumentiExtra + ".\n Scegli un altro strumento: ");
            competenzaStrumentiExtra = sc.next().trim();
        }
        competenzaStrumenti.add(competenzaStrumentiExtra);
    }

    public void addIncantesimi(String incantesimoExtra, Scanner sc, String[] dominio) {
        while (true) {
            if (!MenuPrinter.contains(dominio, incantesimoExtra)) {
                System.out.println("L'incantesimi inserito non esite. Riprova");
                incantesimoExtra = sc.nextLine().trim();
                continue;
            }
            if (incantesimiConosciuti.contains(incantesimoExtra)) {
                System.out.println("Conosci già l'incantesimo '" + incantesimoExtra + "'.\n Scegli un altro incantesimo: ");
                incantesimoExtra = sc.next().trim();
                continue;
            }
            incantesimiConosciuti.add(incantesimoExtra);
            break;
        }
    }

    public void addEquipaggiamento(String equipaggiamentoExtra, Scanner sc) {
        while (equipaggiamento.contains(equipaggiamentoExtra)) {
            System.out.println("Hai già " + equipaggiamentoExtra + " come equipaggiamento.\n Scegli un altro equipaggiamento: ");
            equipaggiamentoExtra = sc.next().trim();
        }
        equipaggiamento.add(equipaggiamentoExtra);
    }

    public void addArmature(String armatureExtra, Scanner sc) {
        while (armature.contains(armatureExtra)) {
            System.out.println("Hai già " + armatureExtra + ".\n Scegli un'altra armatura/scudo: ");
            armatureExtra = sc.next().trim();
        }
        armature.add(armatureExtra);
    }

    public void addArmi(String armiExtra, Scanner sc) {
        while (armi.contains(armiExtra)) {
            System.out.println("Hai già " + armiExtra + ".\n Scegli un'altra arma: ");
            armiExtra = sc.next().trim();
        }
        armi.add(armiExtra);
    }

    //
    //  METODI PER CALCOLARE I DATI DEL PERSONAGGIO
    //

    public void calcolaPuntiFerita() {
        puntiFerita = classeScelta.getHitPoints() + getModificatoreCaratteristiche("Costituzione");
        if (sottoclasseScelta != null && sottoclasseScelta.getNomeSottoclasse().equals("Discendenza draconica")) {
            puntiFerita += 1;
        }
        if (sottorazzaScelta != null && sottorazzaScelta.getNomeSottorazza().equals("NanoDelleColline")) {
            puntiFerita += 1;
        }
    }

    public void calcolaIniziativa() {
        this.iniziativa += getModificatoreCaratteristiche("Destrezza");
    }

    public void calcolaPercezionePassiva() {
        this.percezionePassiva += getModificatoreCaratteristiche("Saggezza");
        if (mappaSkill.get("Percezione").hasCompetenza()) {
            this.percezionePassiva += 2;
        }
    }

    public void calcolaClasseArmatura(Scanner sc) {
        this.classeArmatura = 10 + getModificatoreCaratteristiche("Destrezza");
        boolean haArmatura = !armature.isEmpty();
        if (haArmatura) {
            haArmatura = !(armature.getFirst().equals("Scudo") && armature.getLast().equals("Scudo"));
        }
        //controllo se ci sono armature oltre allo scudo

        System.out.println("Vuoi indossare l'armatura?");
        //se ci sono armature e il giocatore vuole indossarla
        if (haArmatura && sc.nextLine().equalsIgnoreCase("Si")) {
            if (armature.contains("Imbottita")) {
                classeArmatura = 11 + getModificatoreCaratteristiche("Destrezza");
                svantaggi.add("Svantaggio in furtività");
            } else if (armature.contains("Armatura di cuoio")) {
                classeArmatura = 11 + getModificatoreCaratteristiche("Destrezza");
            } else if (armature.contains("Cuoio borchiato")) {
                classeArmatura = 12 + getModificatoreCaratteristiche("Destrezza");
            } else if (armature.contains("Pelle")) {
                if (getModificatoreCaratteristiche("Destrezza") > 2) {
                    classeArmatura = 12 + 2;
                } else {
                    classeArmatura = 12 + getModificatoreCaratteristiche("Destrezza");
                }
            } else if (armature.contains("Giaco di maglia")) {
                if (getModificatoreCaratteristiche("Destrezza") > 2) {
                    classeArmatura = 13 + 2;
                } else {
                    classeArmatura = 13 + getModificatoreCaratteristiche("Destrezza");
                }
            } else if (armature.contains("Corazza di scaglie")) {
                svantaggi.add("Svantaggio in furtività");
                if (getModificatoreCaratteristiche("Destrezza") > 2) {
                    classeArmatura = 14 + 2;
                } else {
                    classeArmatura = 14 + getModificatoreCaratteristiche("Destrezza");
                }
            } else if (armature.contains("Corazza di piastre")) {
                if (getModificatoreCaratteristiche("Destrezza") > 2) {
                    classeArmatura = 14 + 2;
                } else {
                    classeArmatura = 14 + getModificatoreCaratteristiche("Destrezza");
                }
            } else if (armature.contains("Mezza armatura a piastre")) {
                svantaggi.add("Svantaggio in furtività");
                if (getModificatoreCaratteristiche("Destrezza") > 2) {
                    classeArmatura = 15 + 2;
                } else {
                    classeArmatura = 15 + getModificatoreCaratteristiche("Destrezza");
                }
            } else if (armature.contains("Corazza ad anelli")) {
                svantaggi.add("Svantaggio in furtività");
                classeArmatura = 14;
            } else if (armature.contains("Cotta di maglia")) {
                svantaggi.add("Svantaggio in furtività");
                classeArmatura = 16;
                if (caratteristiche.get("Forza") < 13) {
                    razzaScelta.setBaseSpeed(razzaScelta.getBaseSpeed() - 3);
                }
            } else if (armature.contains("Corazza a strisce")) {
                svantaggi.add("Svantaggio in furtività");
                classeArmatura = 17;
                if (caratteristiche.get("Forza") < 15) {
                    razzaScelta.setBaseSpeed(razzaScelta.getBaseSpeed() - 3);
                }
            } else if (armature.contains("Armatura completa")) {
                svantaggi.add("Svantaggio in furtività");
                classeArmatura = 18;
                if (caratteristiche.get("Forza") < 15) {
                    razzaScelta.setBaseSpeed(razzaScelta.getBaseSpeed() - 3);
                }
            }

            if ((armature.contains("Corazza ad anelli") || armature.contains("Cotta di maglia") || armature.contains("Corazza a strisce") || armature.contains("Armatura completa")) && !competenzaArmature.contains("Armature pesanti")) {
                svantaggi.add("svantaggio a qualsiasi prova di caratteristica, tiro salvezza tiro per colpire che coinvolga Forza o Destrezza e non puoi lanciare incantesimi.");
            } else if ((armature.contains("Pelle") || armature.contains("Giaco di maglia") || armature.contains("Corazza di scaglie") || armature.contains("Corazza di piastre") || armature.contains("Mezza armatura a piastre")) && !competenzaArmature.contains("Armature leggere")) {
                svantaggi.add("svantaggio a qualsiasi prova di caratteristica, tiro salvezza tiro per colpire che coinvolga Forza o Destrezza e non puoi lanciare incantesimi.");
            } else if ((armature.contains("Imbottita") || armature.contains("Armatura di cuoio") || armature.contains("Cuoio borchiato")) && !competenzaArmature.contains("Armature medie")) {
                svantaggi.add("svantaggio a qualsiasi prova di caratteristica, tiro salvezza tiro per colpire che coinvolga Forza o Destrezza e non puoi lanciare incantesimi.");
            }
        }
        //se ci sono armature armature ma non vuole indossarla
        else if (haArmatura) {
            System.out.println("Hai armatura ma non vuoi indossarla");
        }
        //se non ci sono armature
        else {
            System.out.println("Non possiedi alcuna armatura");

            classeArmatura = 10 + getModificatoreCaratteristiche("Destrezza");
            if (classeScelta.getNomeClasse().equals("Barbaro")) {
                classeArmatura += getModificatoreCaratteristiche("Costituzione");
            } else if (classeScelta.getNomeClasse().equals("Monaco")) {
                classeArmatura += getModificatoreCaratteristiche("Saggezza");
            } else if (sottoclasseScelta != null && sottoclasseScelta.getNomeSottoclasse().equals("Discendenza draconica")) {
                this.classeArmatura = 13 + getModificatoreCaratteristiche("Destrezza");
            }
            //  guerriero
            //  chierico
        }

        if (armature.contains("Scudo")) {
            classeArmatura += 2;
        }

    }

    //
    //  METODI PER IMPOSTARE LE STATISTICHE
    //

    public void setStatistiche(Scanner sc) {
        boolean accettabile = false;
        while (!accettabile) {
            System.out.println("Scegli che metodo utilizzare: ");
            System.out.println("[1]Scelta da standard\t[2]Scelta con i d6\t[3]Da utente");
            int scegli = 0;
            boolean inputCorretto = false;
            while (!inputCorretto) {
                try {
                    scegli = sc.nextInt();
                    inputCorretto = true;
                } catch (InputMismatchException e) {
                    System.out.println("Non hai inserito un numero, riprovare");
                    inputCorretto = false;
                    sc.nextLine();
                }
            }
            if (scegli == 1) {
                generaStatistiche1(sc);
                accettabile = true;
            }
            else if (scegli == 2) {
                generaStatistiche2(sc);
                accettabile = true;
            }
            else if (scegli == 3) {
                generaStatistiche3(sc);
                accettabile = true;
            }
            else {
                System.out.println("Scegli non valido");
            }
        }
        razzaScelta.applicaBonusRazziali(caratteristiche);
    }

    //valori standard
    public void generaStatistiche1(Scanner sc) {
        int[] valori = {15, 14, 13, 12, 10, 8};
        int valoriSize = valori.length;
        boolean valoreValido = false;
        int valore = 0;
        for (String i : caratteristiche.keySet()) {
            valoreValido = false;
            System.out.println("Puoi inserire ancora questi punteggi: ");
            for (int j = 0; j < valoriSize; j++) {
                System.out.print(valori[j] + "\t");
            }
            System.out.println();
            do {
                System.out.print("Inserisci il valore per " + i + ": ");
                boolean inputCorretto = false;
                while (!inputCorretto) {
                    try {
                        valore = sc.nextInt();
                        inputCorretto = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Non hai inserito un numero, riprovare");
                        inputCorretto = false;
                        sc.nextLine();
                    }
                }

                if (valoriSize == 0) {
                    valoreValido = true;
                    System.out.println("Hai assegnato tutti i valori");
                }
                for (int k = 0; k < valoriSize; k++) {
                    if (valori[k] == valore) {
                        valoreValido = true;
                        caratteristiche.put(i, valore);
                        valori[k] = valori[valoriSize - 1];
                        valoriSize--;
                        break;
                    }
                }
                if (!valoreValido) {
                    System.out.println("Valore inserito non valido: ");
                }
            } while (!valoreValido);
        }
        sc.nextLine();
    }

    //lancio dei dadi
    public void generaStatistiche2(Scanner sc) {
        int[] roll = new int[4];
        int[] valori = new int[6];
        System.out.println("Questi sono i valori ottenuti: ");
        for (int j = 0; j < valori.length; j++) {
            int sum = 0;
            for (int i = 0; i < roll.length; i++) {
                roll[i] = (int) (Math.random() * 6 + 1);
                sum += roll[i];
            }
            int min = 6;    // massimo da roll
            int minIndex = 0;
            for (int i = 0; i < roll.length; i++) {
                if (roll[i] < min) {
                    min = roll[i];
                    minIndex = i;
                }
            }
            sum -= min;
            valori[j] = sum;
            System.out.print(valori[j] + "\t");
        }
        boolean valoreValido = false;
        int valoriSize = valori.length;
        int valore = 0;
        for (String i : caratteristiche.keySet()) {
            valoreValido = false;
            System.out.println("Puoi inserire ancora questi punteggi: ");
            for (int j = 0; j < valoriSize; j++) {
                System.out.print(valori[j] + "\t");
            }
            System.out.println();
            do {
                System.out.println("Inserisci il valore per " + i + ": ");
                boolean inputCorretto = false;
                while (!inputCorretto) {
                    try {
                        valore = sc.nextInt();
                        inputCorretto = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Non hai inserito un numero, riprovare");
                        inputCorretto = false;
                        sc.nextLine();
                    }
                }
                for (int k = 0; k < valoriSize; k++) {
                    if (valori[k] == valore) {
                        valoreValido = true;
                        caratteristiche.put(i, valore);
                        valori[k] = valori[valoriSize - 1];
                        valoriSize--;
                        break;
                    }
                }
                if (!valoreValido) {
                    System.out.println("Valore inserito non valido: ");
                }
            } while (!valoreValido);
        }
        sc.nextLine();
    }

    //input dell'utente
    public void generaStatistiche3(Scanner sc) {
        for (String i : caratteristiche.keySet()) {
            System.out.print("Inserisci il valore per " + i + ": ");
            int valore = 0;
            boolean inputCorretto = false;
            while (!inputCorretto) {
                try {
                    valore = sc.nextInt();
                    inputCorretto = true;
                } catch (InputMismatchException e) {
                    System.out.println("Non hai inserito un numero, riprovare");
                    inputCorretto = false;
                    sc.nextLine();
                }
            }
            caratteristiche.put(i, valore);
        }
        sc.nextLine();
    }

    //
    //METODI DI STAMPA
    //


    //
    //  METODI PER CARICARE/SALVARE IL PERSONAGGIO
    //

    public static Personaggio caricaPersonaggio(String nomeFile) {
        Personaggio p = null;
        try (java.io.ObjectInputStream in = new java.io.ObjectInputStream(new java.io.FileInputStream(nomeFile))) {
            p = (Personaggio) in.readObject();
            System.out.println("Personaggio caricato con successo!");
        } catch (java.io.IOException | ClassNotFoundException e) {
            System.out.println("Errore durante il caricamento: " + e.getMessage());
        }
        return p;
    }

    public void salvaPersonaggio(String nomeFile) {
        try (java.io.ObjectOutputStream out = new java.io.ObjectOutputStream(new java.io.FileOutputStream(nomeFile))) {
            out.writeObject(this);
            System.out.println("Salvataggio completato in: " + nomeFile);
        } catch (java.io.IOException e) {
            System.out.println("Errore durante il salvataggio: " + e.getMessage());
            e.printStackTrace();
        }
    }
}