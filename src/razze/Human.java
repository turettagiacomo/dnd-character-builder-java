package razze;

import java.util.ArrayList;
import java.util.HashMap;

public class Human extends Razza {
    //costruttore della Classe nano @super serve perchè è sottoclasse di Razza
    public Human(){
        super("Human", 9, false);
    }
    @Override
    public void applicaBonusRazziali(HashMap<String, Integer> stat) {
        stat.put("Forza",stat.get("Forza")+1);
        stat.put("Costituzione",stat.get("Costituzione")+1);
        stat.put("Destrezza",stat.get("Destrezza")+1);
        stat.put("Intelligenza",stat.get("Intelligenza")+1);
        stat.put("Saggezza",stat.get("Saggezza")+1);
        stat.put("Carisma",stat.get("Carisma")+1);
    }
    @Override
    public void knownLanguages(ArrayList<String> languages) {
        String[] items = {"Comune"};
        addBonus(items, languages);
    }
}