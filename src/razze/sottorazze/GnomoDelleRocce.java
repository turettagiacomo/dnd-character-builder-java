package razze.sottorazze;

import java.util.ArrayList;
import java.util.HashMap;

public class GnomoDelleRocce extends Sottorazza{

    public GnomoDelleRocce(){
        super("GnomoDelleRocce");
    }

    @Override
    public void applicaBonusCaratteristiche(HashMap<String, Integer> stat){
        stat.put("Costituzione", stat.get("Costituzione")+1);
    }
    @Override
    public void applicaBonusExtraSottorazza(ArrayList<String> extra) {
        extra.add("Se hai una prova abilità su storia su oggetti magici, alchemici o tecnologici applichi il doppio del bonus di competenza");
    }
    @Override
    public void applicaCompetenzaStrumentiSottorazza(ArrayList<String> competenzaStrumenti){
        String[] items = {"Strumenti da inventore"};
        addBonus(items, competenzaStrumenti);
    }
}
