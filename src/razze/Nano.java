package razze;

import razze.sottorazze.Sottorazza;

import java.util.ArrayList;
import java.util.HashMap;

public class Nano extends Razza {

    private Sottorazza sottorazzaScelta;
    //costruttore della Classe nano @super serve perchè è sottoclasse di Razza
    public Nano(Sottorazza sottorazzaInput){
        super("Nano", 7.5F, true);
        this.sottorazzaScelta = sottorazzaInput;
    }

    @Override
    public void applicaBonusRazziali(HashMap<String, Integer> stat) {
        stat.put("Costituzione",stat.get("Costituzione")+2);
        this.sottorazzaScelta.applicaBonusCaratteristiche(stat);
    }
    @Override
    public void knownLanguages(ArrayList<String> languages) {
        String[] items =  {"Comune", "Nanico"};
        addBonus(items, languages);
    }
    @Override
    public void applicaResistenze(ArrayList<String> resistance) {
        resistance.add("Resistenza a danni da veleno (da razza)");
    }
    @Override
    public void applicaAdvSt(ArrayList<String> advSt) {
        advSt.add("Vantaggio nei tiri salvezza contro veleno");
    }
    @Override
    public void applicaBonusExtra(ArrayList<String> extras) {
        extras.add("Se hai una prova abilità su storia sulla lavorazione di una pietra ottieni il doppio bonus di competenza");
    }
    @Override
    public void applicaCompetenzaArmi(ArrayList<String> weaponProficiency) {
        String[] items = {"Asce", "Asce da battaglia", "Martelli da guerra", "Martelli leggeri"};
        addBonus(items, weaponProficiency);
    }
    @Override
    public void applicaCompetenzaArmature(ArrayList<String> armorProficiency){
        this.sottorazzaScelta.applicaBonusArmature(armorProficiency);
    }
}