package classi.sottoclassi;

import java.util.ArrayList;

public class TheArchfey extends Sottoclasse{
    public TheArchfey() {
        super("TheArchfey");
    }

    @Override
    public void addSpell(ArrayList<String> incantesimiConosciuti) {
        String[] items = {"Fuoco fatato", "Dormire"};
        addBonus(items, incantesimiConosciuti);
    }

    @Override
    public void applicaPrivilegiSottoclasse(ArrayList<String> privilegiSottoclasse) {
        privilegiSottoclasse.add("Presenza Fatata: Come azione, ogni creatura in un cubo di 3m deve superare un TS Saggezza o essere affascinata/spaventata fino alla fine del tuo prossimo turno.");
    }
}
