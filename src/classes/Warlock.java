package classes;

import attributes.Ability;
import classes.subclasses.Subclass;
import classes.subclasses.WarlockSubclass;

import java.util.List;

public class Warlock extends CharacterClass {
    private final Subclass subclass;
    public Warlock(WarlockSubclass subclassInput) {
        super("Warlock", 2, "1d8", 8);
        subclass = (Subclass)  subclassInput;
    }

    @Override
    public void applyArmorProficiencies(List<String> armorProficiencies) {
        String[] items = {"Light armor"};
        addBonus(items, armorProficiencies);
    }

    @Override
    public void applyWeaponProficiencies(List<String> weaponProficiencies) {
        String[] items = {"Simple weapons"};
        addBonus(items , weaponProficiencies);
    }

    @Override
    public void applyProficiencySavingThrows(List<Ability> proficiencySavingThrows){
        proficiencySavingThrows.add(Ability.WISDOM);
        proficiencySavingThrows.add(Ability.CHARISMA);
    }

    @Override
    public void applyArmor(List<String> armors) {
        String[] items = {"Leather armor"};
        addBonus(items, armors);
    }

    @Override
    public void applyWeapons(List<String> weapons) {
        String[] items = {"2 daggers"};
        addBonus(items, weapons);
    }

    @Override
    public void applyClassBonuses(List<String> classBonuses) {
        classBonuses.add("Pact Magic");
        this.subclass.applySubclassBonuses(classBonuses);
    }

    @Override
    public Ability getSpellcastingAbility() {
        return Ability.CHARISMA;
    }

    @Override
    public void applyKnownSpells(List<String> spells){
        this.subclass.applyKnownSpells(spells);
    }
}
