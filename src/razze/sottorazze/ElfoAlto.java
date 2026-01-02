package razze.sottorazze;

import java.util.ArrayList;
import java.util.HashMap;

public class ElfoAlto extends Sottorazza{

    public ElfoAlto(){
        super("ElfoAlto");
    }

    @Override
    public void applicaBonusCaratteristiche(HashMap<String, Integer> stat){
        stat.put("Intelligenza", stat.get("Intelligenza")+1);
    }

    @Override
    public void applicaBonusArmi(ArrayList<String> weaponProficiency){
        String[] items = {"Spade corte", "Spade lunghe", "Arco corto", "Arco lungo"};
        addBonus(items, weaponProficiency);
    }
}
