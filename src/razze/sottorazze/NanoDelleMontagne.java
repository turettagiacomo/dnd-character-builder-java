package razze.sottorazze;

import java.util.ArrayList;
import java.util.HashMap;

public class NanoDelleMontagne extends Sottorazza{

    public NanoDelleMontagne(){
        super("NanoDelleMontagne");
    }

    @Override
    public void applicaBonusCaratteristiche(HashMap<String, Integer> stat){
        stat.put("Forza", stat.get("Forza")+2);
    }
    @Override
    public void applicaBonusArmature(ArrayList<String> armorProficiency){
        String[] items = {"Armature leggere", "Armature medie"};
        addBonus(items, armorProficiency);
    }
}
