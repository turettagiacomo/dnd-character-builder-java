package razze;

import java.util.ArrayList;
import java.util.HashMap;

public class Tiefling extends Razza {
    //costruttore della Classe nano @super serve perchè è sottoclasse di Razza
    public Tiefling(){
        super("Tiefling", 9, true);
    }
    @Override
    public void applicaBonusRazziali(HashMap<String, Integer> stat) {
        stat.put("Intelligenza",stat.get("Intelligenza")+1);
        stat.put("Carisma",stat.get("Carisma")+2);
    }
    @Override
    public void knownLanguages(ArrayList<String> languages) {
        String[] items =  {"Comune", "Infernale"};
        addBonus(items, languages);
    }
    @Override
    public void applicaResistenze(ArrayList<String> resistance) {
        resistance.add("Resistenza a danni di fuoco (da razza)");
    }
    @Override
    public void applicaIncantesimiConosciuti(ArrayList<String> knownSpells){
        String[] items = {"Taumaturgia"};
        addBonus(items, knownSpells);
    }
}
