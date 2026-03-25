package classes.subclasses;

import java.util.List;

public class NatureDomain extends Subclass implements ClericSubclass{
    public NatureDomain() {
        super("Nature Domain");
    }

    @Override
    public void applyKnownSpells(List<String> spells) {
        String[] items = {"Animal friendship", "Speak with animals"};
        addBonus(items, spells);
    }

    @Override
    public void applySubclassBonuses(List<String> subclassBonuses) {
        subclassBonuses.add("Acolyte of nature");
    }
}
