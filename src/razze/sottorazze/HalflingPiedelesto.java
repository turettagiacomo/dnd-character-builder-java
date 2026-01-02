package razze.sottorazze;

import java.util.ArrayList;
import java.util.HashMap;

public class HalflingPiedelesto extends Sottorazza{

    public HalflingPiedelesto(){
        super("HalflingPiedelesto");
    }

    @Override
    public void applicaBonusCaratteristiche(HashMap<String, Integer> stat){
        stat.put("Carisma", stat.get("Carisma")+1);
    }
    @Override
    public void applicaBonusExtraSottorazza(ArrayList<String> extra){
        extra.add("Puoi nasconderti dietro alle creature più grandi");
    }
}
