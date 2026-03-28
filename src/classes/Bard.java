package classes;

import attributes.Ability;

import java.util.List;

public class Bard extends CharacterClass {
    public Bard(){
        super("Bard", 2, "1d8", 8);
    }

    @Override
    public void applyArmorProficiencies(List<String> armorProficiencies) {
        String[] items = {"Light armor"};
        addBonus(items, armorProficiencies);
    }

    @Override
    public void applyWeaponProficiencies(List<String> weaponProficiencies) {
        String[] items = {"Simple weapons", "Hand crossbows", "Long swords", "Short swords", "Rapiers"};
        addBonus(items, weaponProficiencies);
    }

    @Override
    public void applyProficiencySavingThrows(List<Ability> proficiencySavingThrows){
        proficiencySavingThrows.add(Ability.DEXTERITY);
        proficiencySavingThrows.add(Ability.CHARISMA);
    }

    @Override
    public void applyArmor(List<String> armor){
        String[] items = {"Leather armor"};
        addBonus(items, armor);
    }

    @Override
    public void applyWeapons(List<String> weapons) {
        String[] items = {"Dagger"};
        addBonus(items, weapons);
    }

    @Override
    public void applyClassBonuses(List<String> classBonuses) {
        classBonuses.add("Bardic inspiration");
    }

    @Override
    public Ability getSpellcastingAbility() {
        return Ability.CHARISMA;
    }
}
