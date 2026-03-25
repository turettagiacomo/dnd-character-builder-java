package classes;

import attributes.Ability;

import java.util.List;

public class Fighter extends CharacterClass {
    public Fighter(){
        super("Fighter", 2, "1d10", 10);
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
    public void applyProficiencySavingThrows(List<Ability> proficiencySavingThrows){
        proficiencySavingThrows.add(Ability.STRENGTH);
        proficiencySavingThrows.add(Ability.CONSTITUTION);
    }

    @Override
    public void applyClassBonuses(List<String> classBonuses) {
        classBonuses.add("Fighting style");
        classBonuses.add("Second wind");
    }
}
