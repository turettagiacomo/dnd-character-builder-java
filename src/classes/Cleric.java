package classes;

import attributes.Ability;
import classes.subclasses.ClericSubclass;
import classes.subclasses.Subclass;

import java.util.List;

public class Cleric extends CharacterClass {
    private final Subclass subclass;
    public Cleric(ClericSubclass subclassInput){
        super("Cleric", 2, "1d8", 8);
        this.subclass = (Subclass) subclassInput;
    }

    @Override
    public void applyArmorProficiencies(List<String> armorProficiencies) {
        String[] items = {"Light armor", "Medium armor", "Shields"};
        addBonus(items, armorProficiencies);
        this.subclass.applyArmorProficiencies(armorProficiencies);
    }

    @Override
    public void applyWeaponProficiencies(List<String> weaponProficiencies) {
        String[] items = {"Simple weapons"};
        addBonus(items, weaponProficiencies);
        this.subclass.applyWeaponProficiencies(weaponProficiencies);
    }

    @Override
    public void applyProficiencySavingThrows(List<Ability> proficiencySavingThrows){
        proficiencySavingThrows.add(Ability.WISDOM);
        proficiencySavingThrows.add(Ability.CHARISMA);
    }

    @Override
    public void applyArmor(List<String> armor){
        String[] items = {"Shield"};
        addBonus(items, armor);
    }

    @Override
    public void applyClassBonuses(List<String> classBonuses) {
        classBonuses.add("Divine domain");
        this.subclass.applySubclassBonuses(classBonuses);
    }

    @Override
    public Ability getSpellcastingAbility() {
        return Ability.WISDOM;
    }

    @Override
    public void applyKnownSpells(List<String> spells){
        this.subclass.applyKnownSpells(spells);
    }
}
