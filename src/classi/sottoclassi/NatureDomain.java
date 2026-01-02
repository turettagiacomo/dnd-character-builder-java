package classi.sottoclassi;

import java.util.ArrayList;

public class NatureDomain extends Sottoclasse{
    public NatureDomain() {
        super("Dominio della natura");
    }

    @Override
    public void addSpell(ArrayList<String> incantesimiConosciuti) {
        String[] items = {"Amicizia con animali", "Parlare con animali"};
        addBonus(items, incantesimiConosciuti);
    }

    @Override
    public void applicaPrivilegiSottoclasse(ArrayList<String> privilegiSottoclasse) {
        privilegiSottoclasse.add("Accolito della Natura: Ottieni un trucchetto da druido e competenza in una abilità tra Addestrare Animali, Natura o Sopravvivenza.");
    }
}
