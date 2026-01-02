package razze;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HalfOrc extends Razza {
    //costruttore della Classe nano @super serve perchè è sottoclasse di Razza
    public HalfOrc(){
        super("Mezzorco", 9, true);
    }
    @Override
    public void applicaBonusRazziali(HashMap<String, Integer> stat) {
        stat.put("Forza",stat.get("Forza")+2);
        stat.put("Costituzione",stat.get("Costituzione")+1);
    }
    @Override
    public void applicaCompetenza(Map<String, Skill> mappaSkill) {
        mappaSkill.get("Intimidire").setCompetenza(true);
    }
    @Override
    public void knownLanguages(ArrayList<String> languages) {
        String[] items = {"Comune", "Orco"};
        addBonus(items, languages);
    }
    @Override
    public void applicaBonusExtra(ArrayList<String> extras) {
        extras.add("Se vai a 0Hp senza morire da danno critico, puoi invece andare a 1Hp");
        extras.add("\nSe infliggi un danno critico, puoi rilanciare un dado e aggiungere il nuovo risultato al danno");
    }
}
