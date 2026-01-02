package classi.sottoclassi;

import java.util.ArrayList;

public class TempestDomain extends Sottoclasse{
    public TempestDomain() {
        super("Dominio della tempesta");
    }

    @Override
    public void addSpell(ArrayList<String> incantesimiConosciuti) {
        String[] items = {"Nubi di nebbia", "Onde di tuono"};
        addBonus(items, incantesimiConosciuti);
    }

    @Override
    public void addArmorProficiency(ArrayList<String> armorProficiency) {
        String[] items = {"Armature pesanti"};
        addBonus(items, armorProficiency);
    }

    @Override
    public void addWeaponProficiency(ArrayList<String> weaponProficiency){
        String[] items = {"Armi marziali"};
        addBonus(items, weaponProficiency);
    }

    @Override
    public void applicaPrivilegiSottoclasse(ArrayList<String> privilegiSottoclasse) {
        privilegiSottoclasse.add("Ira della Tempesta: Come reazione quando colpito, infliggi 2d8 danni da tuono o fulmine all'attaccante (TS Destrezza dimezza).");
    }
}
