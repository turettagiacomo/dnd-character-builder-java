package classes;

import attributes.Ability;

import java.util.List;

public class Barbarian extends CharacterClass {

    public Barbarian(){
        super("Barbarian", 2, "1d12", 12);
    }

    @Override
    public void applyArmorProficiencies(List<String> armorProficiencies) {
        String[] items = {"Light armor", "Medium armor", "Shield"};
        addBonus(items, armorProficiencies);
    }

    @Override
    public void applyWeaponProficiencies(List<String> weaponProficiencies) {
        String[]  items = {"Simple weapons", "Martial weapons"};
        addBonus(items, weaponProficiencies);
    }

    @Override
    public void applyProficiencySavingThrows(List<Ability> proficiencySavingThrows){
        proficiencySavingThrows.add(Ability.STRENGTH);
        proficiencySavingThrows.add(Ability.CONSTITUTION);
    }

    @Override
    public void applyEquipment(List<String> equipment) {
        String[] items = {"Explorer's pack"};
        addBonus(items, equipment);
    }

    @Override
    public void applyWeapons(List<String> armi) {
        String[] items = {"4 javelins"};
        addBonus(items, armi);
    }

    @Override
    public void applyClassBonuses(List<String> classBonuses){
        classBonuses.add("Rage");
        classBonuses.add("Unarmored defence");
    }
}
