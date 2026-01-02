package classi.sottoclassi;

import java.util.ArrayList;

public class WarDomain extends Sottoclasse{
    public WarDomain() {
        super("Dominio della guerra");
    }

    @Override
    public void addSpell(ArrayList<String> incantesimiConosciuti) {
        String[] items = {"Favore divino", "Scudo della fede"};
        addBonus(items, incantesimiConosciuti);
    }

    @Override
    public void addArmorProficiency(ArrayList<String> armorProficiency) {
        String[] items = {"Amrature pesanti"};
        addBonus(items, armorProficiency);
    }

    @Override
    public void addWeaponProficiency(ArrayList<String> weaponProficiency){
        String[] items = {"Armi marziali"};
        addBonus(items, weaponProficiency);
    }

    @Override
    public void applicaPrivilegiSottoclasse(ArrayList<String> privilegiSottoclasse) {
        privilegiSottoclasse.add("Sacerdote di Guerra: Quando usi l'azione Attacco, puoi effettuare un attacco con arma come azione bonus (Mod. Saggezza volte al giorno).");
    }
}
