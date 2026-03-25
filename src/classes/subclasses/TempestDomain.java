package classes.subclasses;

import java.util.List;

public class TempestDomain extends Subclass implements ClericSubclass{
    public TempestDomain() {
        super("Tempest Domain");
    }

    @Override
    public void applyKnownSpells(List<String> spells) {
        String[] items = {"Fog cloud", "Thunderwave"};
        addBonus(items, spells);
    }

    @Override
    public void applyArmorProficiencies(List<String> armorProficiency) {
        String[] items = {"Heavy armor"};
        addBonus(items, armorProficiency);
    }

    @Override
    public void applyWeaponProficiencies(List<String> weaponProficiencies){
        String[] items = {"Martial weapons"};
        addBonus(items, weaponProficiencies);
    }

    @Override
    public void applySubclassBonuses(List<String> subclassBonuses) {
        subclassBonuses.add("Wrath of the storm");
    }
}
