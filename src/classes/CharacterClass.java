package classes;

import attributes.Ability;
import attributes.Skill;

import java.io.Serializable;
import java.util.List;

/**
 * Represents a generic D&D 5e character class.
 * Manages base class attributes like Hit Dice, core proficiencies, and saving throws,
 * and establishes the template for applying class-specific features and equipment.
 */
public abstract class CharacterClass implements Serializable {
    private final String name;
    private int proficiencyBonus;
    private String hitDices;
    private int hitPoints;

    public CharacterClass(String name, int proficiencyBonus, String hitDices, int hitPoints) {
        this.name = name;
        this.proficiencyBonus = proficiencyBonus;
        this.hitDices = hitDices;
        this.hitPoints = hitPoints;
    }

    public String getName() {
        return name;
    }
    public int getProficiencyBonus() {
        return proficiencyBonus;
    }
    public String getHitDices() {
        return hitDices;
    }
    public int getHitPoints() {
        return hitPoints;
    }

    public void addBonus(String[] elements, List<String> targetList) {
        for(String s : elements){
            if(!targetList.contains(s)){
                targetList.add(s);
            }
        }
    }

    public void applyEquipment(List<String> equipment) {}

    public void applyArmor(List<String> armor){}

    public void applyWeapons(List<String> weapons) {}

    public abstract void applyClassBonuses(List<String> classBonuses);

    public Ability getSpellcastingAbility(){
        return null;
    }

    public void applyResistances(List<String> resistances){}

    /**
     * Applies the primary saving throw proficiencies granted by this specific class.
     * @param proficiencySavingThrows The list of ability saving throws to update.
     */
    public void applyProficiencySavingThrows(List<Ability> proficiencySavingThrows){}

    public void applyProficiencies(List<Skill> skillProficiencies){}

    public void applyWeaponProficiencies(List<String> weaponProficiencies){}

    public void applyArmorProficiencies(List<String> armorProficiencies){}

    public void applyToolsProficiencies(List<String> toolsProficiencies){}

    public void applyKnownSpells(List<String> spells){}

    public void applyKnownLanguages(List<String> languages){}
}