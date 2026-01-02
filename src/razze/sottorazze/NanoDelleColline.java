package razze.sottorazze;

import java.util.HashMap;

public class NanoDelleColline extends Sottorazza{

    public NanoDelleColline(){
        super("NanoDelleColline");
    }

    @Override
    public void applicaBonusCaratteristiche(HashMap<String, Integer> stat){
        stat.put("Saggezza", stat.get("Saggezza")+1);
    }
}
