package classi.sottoclassi;

import java.util.ArrayList;

public class LightDomain extends Sottoclasse{
    public LightDomain() {
        super("Dominio della luce");
    }

    @Override
    public void addSpell(ArrayList<String> incantesimiConosciuti) {
        String[] items = {"Mani brucianti", "Fuoco fatato", "Luce"};
        addBonus(items, incantesimiConosciuti);
    }

    @Override
    public void applicaPrivilegiSottoclasse(ArrayList<String> privilegiSottoclasse) {
        privilegiSottoclasse.add("Bagliore di Interdizione: Come reazione, imponi svantaggio a un attacco nemico entro 9m (Mod. Saggezza volte al giorno).");
    }
}
