package razze.sottorazze;

import java.util.ArrayList;
import java.util.HashMap;

public class ElfoOscuro extends Sottorazza{

    public ElfoOscuro(){
        super("ElfoOscuro");
    }

    @Override
    public void applicaBonusCaratteristiche(HashMap<String, Integer> stat){
        stat.put("Carisma", stat.get("Carisma")+1);
    }
    @Override
    public void applicaBonusArmi(ArrayList<String> weaponProficiency){
        String[] items = {"Spade corte", "Stocchi", "Balestre a mano"};
        addBonus(items, weaponProficiency);
    }
    @Override
    public void applicaIncantesimiConosciutiSottorazze(ArrayList<String> knownSpells){
        String[] items = {"Luci danzanti"};
        addBonus(items, knownSpells);
    }
    @Override
    public void applicaBonusExtraSottorazza(ArrayList<String> extra){
        extra.add("Hai svantaggio ai tiri per colpire e alle prove di Percezione basate sulla vista quando \ntu, il bersaglio dell'attacco o quello che stai cercando di percepire è esposto alla luce diretta del sole.");
    }
}
