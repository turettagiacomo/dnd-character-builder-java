package razze;

import razze.sottorazze.Sottorazza;

import java.util.ArrayList;
import java.util.HashMap;

public class Gnome extends Razza {

    private Sottorazza sottorazzaScelta;
    //costruttore della Classe nano @super serve perchè è sottoclasse di Razza
    public Gnome(Sottorazza sottorazzaInput){
        super("Gnomo", 7.5F, true);
        this.sottorazzaScelta = sottorazzaInput;
    }
    @Override
    public void applicaBonusRazziali(HashMap<String, Integer> stat) {
        stat.put("Intelligenza",stat.get("Intelligenza")+2);
        this.sottorazzaScelta.applicaBonusCaratteristiche(stat);
    }
    @Override
    public void knownLanguages(ArrayList<String> languages) {
        String[] items = {"Comune", "Gnomico"};
        addBonus(items, languages);
    }
    @Override
    public void applicaAdvSt(ArrayList<String> advSt) {
        advSt.add("Vantaggio nei tiri salvezza su intelligenza, saggezza e carisma contro magia");
    }
    @Override
    public void applicaIncantesimiConosciuti(ArrayList<String> knownSpells) {
        this.sottorazzaScelta.applicaIncantesimiConosciutiSottorazze(knownSpells);
    }
    @Override
    public void applicaBonusExtra(ArrayList<String> extras) {
        this.sottorazzaScelta.applicaBonusExtraSottorazza(extras);
    }
    @Override
    public void applicaCompetenzaStrumenti(ArrayList<String> toolsProficiency) {
        this.sottorazzaScelta.applicaCompetenzaStrumentiSottorazza(toolsProficiency);
    }
}