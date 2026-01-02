package classi.sottoclassi;

import java.util.ArrayList;

public class TheGreatOldOne extends Sottoclasse{
    public TheGreatOldOne() {
        super("TheGreatOldOne");
    }

    @Override
    public void addSpell(ArrayList<String> incantesimiConosciuti) {
        String[] items = {"Sussurro dissonante", "Risata di tasha"};
        addBonus(items, incantesimiConosciuti);
    }

    @Override
    public void applicaPrivilegiSottoclasse(ArrayList<String> privilegiSottoclasse) {
        privilegiSottoclasse.add("Mente Risvegliata: Puoi comunicare telepaticamente con qualsiasi creatura entro 9m che comprenda almeno un linguaggio.");
    }
}
