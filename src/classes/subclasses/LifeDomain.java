package classes.subclasses;

import java.util.List;

public class LifeDomain extends Subclass implements ClericSubclass{
    public LifeDomain() {
        super("Life domain");
    }

    @Override
    public void applyKnownSpells(List<String> spells) {
        String[] items = {"Bless", "Cure Wounds"};
        addBonus(items, spells);
    }

    @Override
    public void applyArmorProficiencies(List<String> armorProficiencies) {
        String[] items = {"Heavy armor"};
        addBonus(items, armorProficiencies);
    }

    @Override
    public void applySubclassBonuses(List<String> subclassBonuses) {
        subclassBonuses.add("Disciple of life");
    }
}
