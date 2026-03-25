package classes;

import attributes.Ability;

import java.util.List;

public class Paladin extends CharacterClass {
    public Paladin(){
        super("Paladin", 2, "1d10", 10);
    }

    @Override
    public void applyArmorProficiencies(List<String> armorProficiencies) {
        String[] items = {"Light armor", "Medium armor", "Heavy armor", "Shields"};
        addBonus(items, armorProficiencies);
    }

    @Override
    public void applyWeaponProficiencies(List<String> weaponProficiencies) {
        String[] items = {"Simple weapons", "Martial weapons"};
        addBonus(items, weaponProficiencies);
    }

    @Override
    public void applyProficiencySavingThrows(List<Ability> proficiencySavingThrows) {
        proficiencySavingThrows.add(Ability.WISDOM);
        proficiencySavingThrows.add(Ability.CHARISMA);
    }

    @Override
    public void applyEquipment(List<String> equipment) {
        String[] items = {"Holy symbol"};
        addBonus(items, equipment);
    }

    @Override
    public void applyArmor(List<String> armor) {
        String[] items = {"Chain mail"};
        addBonus(items, armor);
    }

    @Override
    public void applyClassBonuses(List<String> classBonuses) {
        classBonuses.add("Divine sense");
        classBonuses.add("Lay on hands");
    }

    @Override
    public Ability getSpellcastingAbility() {
        return Ability.CHARISMA;
    }
}
