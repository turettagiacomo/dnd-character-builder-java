package classes.subclasses;

import java.util.List;

public class LightDomain extends Subclass implements ClericSubclass{
    public LightDomain() {
        super("Light Domain");
    }

    @Override
    public void applyKnownSpells(List<String> spells) {
        String[] items = {"Burning hands", "Faerie fire", "Light"};
        addBonus(items, spells);
    }

    @Override
    public void applySubclassBonuses(List<String> subclassBonuses) {
        subclassBonuses.add("Warding flare");
    }
}
