package classes;

import attributes.Ability;

import java.util.List;

public class Wizard extends CharacterClass {
    public Wizard(){
        super("Wizard", 2, "1d6", 6);
    }

    @Override
    public void applyWeaponProficiencies(List<String> weaponProficiencies) {
        String[] items = {"Daggers", "Darts", "Slings", "Quarterstaffs", "Light crossbows"};
        addBonus(items, weaponProficiencies);
    }

    @Override
    public void applyProficiencySavingThrows(List<Ability> proficiencySavingThrows){
        proficiencySavingThrows.add(Ability.INTELLIGENCE);
        proficiencySavingThrows.add(Ability.WISDOM);
    }

    @Override
    public void applyEquipment(List<String> equipment) {
        String[]  items = {"Spellbook"};
        addBonus(items, equipment);
    }

    @Override
    public void applyClassBonuses(List<String> classBonuses) {
        classBonuses.add("Spells (Intelligence)");
        classBonuses.add("Arcane Recovery");
    }

    @Override
    public Ability getSpellcastingAbility() {
        return Ability.INTELLIGENCE;
    }
}
