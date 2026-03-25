package classes;

import attributes.Ability;

import java.util.List;

public class Monk extends CharacterClass {
    public Monk(){
        super("Monk", 2, "1d8", 8);
    }

    @Override
    public void applyWeaponProficiencies(List<String> weaponProficiencies) {
        String[] items = {"Simple weapons", "Short swords"};
        addBonus(items, weaponProficiencies);
    }

    @Override
    public void applyProficiencySavingThrows(List<Ability> proficiencySavingThrows){
        proficiencySavingThrows.add(Ability.DEXTERITY);
        proficiencySavingThrows.add(Ability.STRENGTH);
    }

    @Override
    public void applyWeapons(List<String> weapons) {
        String[] items = {"10 darts"};
        addBonus(items, weapons);
    }

    @Override
    public void applyClassBonuses(List<String> classBonuses) {
        classBonuses.add("Unarmored defence");
        classBonuses.add("Martial arts");
    }
}
