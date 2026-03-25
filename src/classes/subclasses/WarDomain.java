package classes.subclasses;

import java.util.List;

public class WarDomain extends Subclass implements ClericSubclass{
    public WarDomain() {
        super("War Domain");
    }

    @Override
    public void applyKnownSpells(List<String> spells) {
        String[] items = {"Divine favor", "Shield of faith"};
        addBonus(items, spells);
    }

    @Override
    public void applyArmorProficiencies(List<String> armorProficiency) {
        String[] items = {"Heavy armors"};
        addBonus(items, armorProficiency);
    }

    @Override
    public void applyWeaponProficiencies(List<String> weaponProficiencies){
        String[] items = {"Martial weapons"};
        addBonus(items, weaponProficiencies);
    }

    @Override
    public void applySubclassBonuses(List<String> subclassBonuses) {
        subclassBonuses.add("War Priest");
    }
}
