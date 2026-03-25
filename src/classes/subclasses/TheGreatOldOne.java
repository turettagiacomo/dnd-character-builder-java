package classes.subclasses;

import java.util.List;

public class TheGreatOldOne extends Subclass implements WarlockSubclass{
    public TheGreatOldOne() {
        super("The Great Old One");
    }

    @Override
    public void applyKnownSpells(List<String> spells) {
        String[] items = {"Dissonant whispers", "Tasha's hideous laughter"};
        addBonus(items, spells);
    }

    @Override
    public void applySubclassBonuses(List<String> subclassBonuses) {
        subclassBonuses.add("Awakened mind");
    }
}
