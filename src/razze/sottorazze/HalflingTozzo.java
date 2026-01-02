package razze.sottorazze;

import java.util.ArrayList;
import java.util.HashMap;

public class HalflingTozzo extends Sottorazza{

    public HalflingTozzo(){
        super("HalflingTozzo");
    }

    @Override
    public void applicaBonusCaratteristiche(HashMap<String, Integer> stat){
        stat.put("Costituzione", stat.get("Costituzione")+1);
    }
    @Override
    public void applicaAdvStSottorazza(ArrayList<String> advSt){
        advSt.add("Vantaggio nei tiri salvezza contro veleno");
    }
    @Override
    public void applicaResistenzeSottorazze(ArrayList<String> resistance){
        resistance.add("Resistenza a danni da veleno");
    }
}
