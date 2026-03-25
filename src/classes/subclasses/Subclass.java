package classes.subclasses;

import java.io.Serializable;
import java.util.List;

public abstract class Subclass implements Serializable{
    private String name;

    public Subclass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addBonus(String[] elements, List<String> targetList) {
        for(String s : elements){
            if(!targetList.contains(s)){
                targetList.add(s);
            }
        }
    }
    public void applyKnownSpells(List<String> spells){}
    public void applyArmorProficiencies(List<String> armorProficiencies){}
    public void applyWeaponProficiencies(List<String> weaponProficiencies){}
    public void applyResistances(List<String> resistances){}
    public void applySubclassBonuses(List<String> subclassBonuses){}
}
