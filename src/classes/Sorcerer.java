package classes;

import attributes.Ability;
import classes.subclasses.SourcererSubclass;
import classes.subclasses.Subclass;

import java.util.List;

public class Sorcerer extends CharacterClass {
    private final Subclass subclass;
    public Sorcerer(SourcererSubclass subclassInput){
        super("Sorcerer", 2, "1d6", 6);
        this.subclass = (Subclass) subclassInput;
    }

    @Override
    public void applyWeaponProficiencies(List<String> weaponProficiencies) {
        String[] items = {"Daggers", "Darts", "Slings", "Quarterstaffs", "Light crossbows"};
        addBonus(items, weaponProficiencies);
    }

    @Override
    public void applyProficiencySavingThrows(List<Ability> proficiencySavingThrows){
        proficiencySavingThrows.add(Ability.CHARISMA);
        proficiencySavingThrows.add(Ability.CONSTITUTION);
    }

    @Override
    public void applyWeapons(List<String> weapons) {
        String[] items = {"2 daggers"};
        addBonus(items, weapons);
    }

    @Override
    public void applyClassBonuses(List<String> classBonuses) {
        this.subclass.applySubclassBonuses(classBonuses);
    }

    @Override
    public Ability getSpellcastingAbility() {
        return Ability.CHARISMA;
    }

    @Override
    public void applyResistances(List<String> resistances){
        this.subclass.applyResistances(resistances);
    }
}