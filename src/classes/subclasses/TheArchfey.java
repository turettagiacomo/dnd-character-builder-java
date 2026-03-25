package classes.subclasses;

import java.util.List;

public class TheArchfey extends Subclass implements WarlockSubclass{
    public TheArchfey() {
        super("The Archfey");
    }

    @Override
    public void applyKnownSpells(List<String> spells) {
        String[] items = {"Faerie Fire", "Sleep"};
        addBonus(items, spells);
    }

    @Override
    public void applySubclassBonuses(List<String> subclassBonuses) {
        subclassBonuses.add("Fey presence");
    }
}
