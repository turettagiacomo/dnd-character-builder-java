package classi.sottoclassi;

import java.util.ArrayList;

public class LifeDomain extends Sottoclasse{
    public LifeDomain() {
        super("Dominio della vita");
    }

    @Override
    public void addSpell(ArrayList<String> incantesimiConosciuti) {
        String[] items = {"Benedizione", "Curare ferite"};
        addBonus(items, incantesimiConosciuti);
    }

    @Override
    public void addArmorProficiency(ArrayList<String> armorProficiency) {
        String[] items = {"Armature pesanti"};
        addBonus(items, armorProficiency);
    }

    @Override
    public void applicaPrivilegiSottoclasse(ArrayList<String> privilegiSottoclasse) {
        privilegiSottoclasse.add("Discepolo della Vita: I tuoi incantesimi di cura rigenerano 2 + livello incantesimo PF extra.");
    }
}
