package classes;

import attributes.Ability;

import java.util.List;

public class Ranger extends CharacterClass {
    public Ranger(){
        super("Ranger", 2, "1d10", 10);
    }

    @Override
    public void applyArmorProficiencies(List<String> armorProficiencies) {
        String[] items = {"Light armor", "Medium armor", "Shields"};
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
        proficiencySavingThrows.add(Ability.DEXTERITY);
    }

    @Override
    public void applyWeapons(List<String> weapons) {
        String[] items = {"Long bow", "Quiver of 20 arrows"};
        addBonus(items, weapons);
    }

    @Override
    public void applyClassBonuses(List<String> classBonuses) {
        classBonuses.add("Favored enemy");
        classBonuses.add("Natural explorer");
    }

    @Override
    public Ability getSpellcastingAbility() {
        return Ability.WISDOM;
    } // (Starting at lvl 2
}
