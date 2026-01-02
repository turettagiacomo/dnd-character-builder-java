package classi.sottoclassi;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Sottoclasse implements Serializable {
    private String nome;

    public Sottoclasse(String nome) {
        this.nome = nome;
    }

    public String getNomeSottoclasse() {
        return nome;
    }

    public void addBonus(String[] elementi, ArrayList<String> bonusType) {
        for(String s : elementi){
            if(!bonusType.contains(s)){
                bonusType.add(s);
            }
        }
    }
    public void addSpell(ArrayList<String> incantesimiConosciuti){}
    public void addArmorProficiency(ArrayList<String> armorProficiency){}
    public void addWeaponProficiency(ArrayList<String> weaponProficiency){}
    public void addResistance(ArrayList<String> resistance){}
    public void applicaPrivilegiSottoclasse(ArrayList<String> privilegiSottoclasse){}
}
