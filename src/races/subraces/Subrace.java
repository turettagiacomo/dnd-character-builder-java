package races.subraces;

import attributes.Ability;
import races.Race;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract class Subrace implements Serializable {
    private final String name;

    public Subrace(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    protected void addBonus(String[] elements, List<String> targetList) {
        for(String s : elements){
            if(!targetList.contains(s)){
                targetList.add(s);
            }
        }
    }

    public void overrideSpeed(Race race) {}

    public void applyResistances(List<String> resistances){}

    public void applyAdvantageSavingThrows(List<String> advSt){}

    public void applyWeaponProficiencies(List<String> weaponProficiencies){}

    public void applyArmorProficiencies(List<String> armorProficiencies){}

    public void applyToolsProficiencies(List<String> toolsProficiencies){}

    public void applyKnownSpells(List<String> spells){}

    public abstract void applyAbilityBonuses(Map<Ability, Integer> stats);

    public void applyExtraBonuses(List<String> extras){}
}
