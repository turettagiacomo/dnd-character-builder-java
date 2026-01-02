package razze;

import java.util.ArrayList;
import java.util.HashMap;

public class HalfElf extends Razza {
    //costruttore della Classe nano @super serve perchè è sottoclasse di Razza
    public HalfElf(){
        super("Mezzelfo", 9, true);
    }
    @Override
    public void applicaBonusRazziali(HashMap<String, Integer> stat) {
        stat.put("Carisma",stat.get("Carisma")+2);
    }

    @Override
    public void knownLanguages(ArrayList<String> languages) {
        String[] items = {"Comune", "Elfico"};
        addBonus(items, languages);
    }

    @Override
    public void applicaAdvSt(ArrayList<String> advSt) {
        advSt.add("Vantaggio nei tiri salvezza contro l'essere affascinato");
    }

    @Override
    public void applicaBonusExtra(ArrayList<String> extras) {
        extras.add("Non puoi essere messo a dormire da magia");
    }
}
