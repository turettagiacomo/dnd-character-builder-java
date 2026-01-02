package classi.sottoclassi;

import java.util.ArrayList;

public class TheFiend extends Sottoclasse{
    public TheFiend() {
        super("TheFiend");
    }

    @Override
    public void addSpell(ArrayList<String> incantesimiConosciuti) {
        String[] items = {"Mani brucianti", "Comando"};
        addBonus(items, incantesimiConosciuti);
    }

    @Override
    public void applicaPrivilegiSottoclasse(ArrayList<String> privilegiSottoclasse) {
        privilegiSottoclasse.add("Benedizione dell'Oscuro: Quando porti una creatura ostile a 0 PF, ottieni PF temporanei pari a Mod. Carisma + Livello Stregone.");
    }
}
