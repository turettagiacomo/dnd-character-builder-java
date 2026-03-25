package classes.subclasses;

import java.util.List;

public class TrickeryDomain extends Subclass implements ClericSubclass{
    public TrickeryDomain() {
        super("Trickery Domain");
    }

    @Override
    public void applyKnownSpells(List<String> spells) {
        String[] items = {"Charm person", "Disguise self"};
        addBonus(items, spells);
    }

    @Override
    public void applySubclassBonuses(List<String> subclassBonuses) {
        subclassBonuses.add("Blessing of the trickster");
    }
}
