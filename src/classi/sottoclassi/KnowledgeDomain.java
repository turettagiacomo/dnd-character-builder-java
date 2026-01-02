package classi.sottoclassi;

import java.util.ArrayList;

public class KnowledgeDomain extends Sottoclasse{
    public KnowledgeDomain() {
        super("Dominio della conoscenza");
    }
    //2 languages
    //2 prof.skill (2x)
    @Override
    public void addSpell(ArrayList<String> incantesimiConosciuti) {
        String[] items = {"Identificare", "Comando"};
        addBonus(items, incantesimiConosciuti);
    }
}
