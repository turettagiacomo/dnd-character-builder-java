package razze.sottorazze;

import java.util.ArrayList;
import java.util.HashMap;

public class GnomoDelleForeste extends Sottorazza{

    public GnomoDelleForeste(){
        super("GnomoDelleForeste");
    }

    @Override
    public void applicaBonusCaratteristiche(HashMap<String, Integer> stat){
        stat.put("Destrezza", stat.get("Destrezza")+1);
    }
    @Override
    public void applicaIncantesimiConosciutiSottorazze(ArrayList<String> knownSpells) {
        String[] items = {"Illusione minore"};
        addBonus(items, knownSpells);
    }
    @Override
    public void applicaBonusExtraSottorazza(ArrayList<String> extra) {
        extra.add("Puoi comunicare con piccoli animali");
    }
}