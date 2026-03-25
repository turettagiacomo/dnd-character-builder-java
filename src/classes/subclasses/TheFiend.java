package classes.subclasses;

import java.util.List;

public class TheFiend extends Subclass implements WarlockSubclass{
    public TheFiend() {
        super("The Fiend");
    }

    @Override
    public void applyKnownSpells(List<String> spells) {
        String[] items = {"Burning hands", "Command"};
        addBonus(items, spells);
    }

    @Override
    public void applySubclassBonuses(List<String> subclassBonuses) {
        subclassBonuses.add("Dark one's blessing");
    }
}
