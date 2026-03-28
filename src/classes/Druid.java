package classes;

import attributes.Ability;

import java.util.List;

public class Druid extends CharacterClass {
    public Druid(){
        super("Druid", 2, "1d8", 8);
    }

    @Override
    public void applyArmorProficiencies(List<String> armorProficiencies) {
        String[] items = {"Light armor", "Medium armor", "Shields"};
        addBonus(items, armorProficiencies);
    }

    @Override
    public void applyWeaponProficiencies(List<String> weaponProficiencies) {
        String[] items = {"Clubs", "Daggers", "Darts", "Javelins", "Maces", "Quarterstaffs", "Scimitars", "Sickles", "Slings", "Spears"};
        addBonus(items, weaponProficiencies);
    }

    @Override
    public void applyToolsProficiencies(List<String> toolsProficiencies) {
        String[] items = {"Herbalism tools"};
        addBonus(items, toolsProficiencies);
    }

    @Override
    public void applyProficiencySavingThrows(List<Ability> proficiencySavingThrows){
        proficiencySavingThrows.add(Ability.INTELLIGENCE);
        proficiencySavingThrows.add(Ability.WISDOM);
    }


    @Override
    public void applyEquipment(List<String> equipment) {
        String[] items = {"Explorer's pack"};
        addBonus(items, equipment);
    }

    @Override
    public void applyArmor(List<String> armor) {
        String[]  items = {"Leather armor"};
        addBonus(items, armor);
    }

    @Override
    public void applyClassBonuses(List<String> classBonuses) {
        classBonuses.add("Spells");
        classBonuses.add("Druidic");
    }

    @Override
    public Ability getSpellcastingAbility() {
        return Ability.WISDOM;
    }
}
