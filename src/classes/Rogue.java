package classes;

import attributes.Ability;

import java.util.List;

public class Rogue extends CharacterClass {
    public Rogue(){
        super("Rogue", 2, "1d8", 8);
    }
    @Override
    public void applyArmorProficiencies(List<String> armorProficiencies) {
        String[] items = {"Light armor"};
        addBonus(items, armorProficiencies);
    }

    @Override
    public void applyWeaponProficiencies(List<String> weaponProficiencies) {
        String[] items = {"Simple weapons", "Hand crossbow", "Long swords", "Rapiers", "Short swords"};
        addBonus(items, weaponProficiencies);
    }

    @Override
    public void applyToolsProficiencies(List<String> toolsProficiencies) {
        String[] items = {"Thieves' tools"};
        addBonus(items, toolsProficiencies);
    }

    @Override
    public void applyProficiencySavingThrows(List<Ability> proficiencySavingThrows){
        proficiencySavingThrows.add(Ability.DEXTERITY);
        proficiencySavingThrows.add(Ability.INTELLIGENCE);
    }

    @Override
    public void applyEquipment(List<String> equipment) {
        String[] items = {"Thieves' tools"};
        addBonus(items, equipment);
    }

    @Override
    public void applyArmor(List<String> armor) {
        String[] items = {"Leather armor"};
        addBonus(items, armor);
    }

    @Override
    public void applyWeapons(List<String> weapons) {
        String[] items = {"2 daggers"};
        addBonus(items, weapons);
    }

    @Override
    public void applyClassBonuses(List<String> classBonuses) {
        classBonuses.add("Expertise");
        classBonuses.add("Sneak attack");
        classBonuses.add("Thieves' cant");
    }
}
