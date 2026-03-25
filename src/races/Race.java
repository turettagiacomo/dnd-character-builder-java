package races;

import attributes.Ability;
import attributes.Skill;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Represents a generic D&D 5e character race.
 * Provides the base attributes (speed, darkvision) and defines the contract
 * for applying racial traits, ability score increases, and proficiencies.
 */
public abstract class Race implements Serializable {
    private final String name;
    private float baseSpeed;
    private final boolean hasDarkvision;

    public Race(String name, float baseSpeed, boolean hasDarkvision) {
        this.name = name;
        this.baseSpeed = baseSpeed;
        this.hasDarkvision = hasDarkvision;
    }

    public float getBaseSpeed() {
        return baseSpeed;
    }
    public String getName() {
        return name;
    }
    public boolean hasDarkvision() {
        return hasDarkvision;
    }
    public void setBaseSpeed(float baseSpeed) {
        this.baseSpeed = baseSpeed;
    }

    protected void addBonus(String[] elements, List<String> targetList) {
        for(String s : elements){
            if(!targetList.contains(s)){
                targetList.add(s);
            }
        }
    }

    public void applyResistances(List<String> resistance){}

    public void applyAdvantageSavingThrows(List<String> advSt){}

    public void applyProficiencies(List<Skill> skillProficiency){}

    public void applyWeaponProficiencies(List<String> weaponProficiency){}

    public void applyArmorProficiencies(List<String> armorProficiency){}

    public void applyToolsProficiencies(List<String> toolsProficiency){}

    public void applyKnownSpells(List<String> spells){}

    public abstract void applyKnownLanguages(List<String> languages);

    /**
     * Applies the racial ability score increases to the character's stats.
     * @param stats The map of abilities and their current scores to be updated.
     */
    public abstract void applyRacialBonuses(Map<Ability, Integer> stats);

    /**
     * Injects specific racial traits or special abilities (e.g., Fey Ancestry, Relentless Endurance)
     * into the character's extra bonuses list.
     * @param extras The list of special features to be updated.
     */
    public void applyExtraBonuses(List<String> extras){}

}
