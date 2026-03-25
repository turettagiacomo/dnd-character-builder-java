package classes.subclasses;

import java.util.List;

public class KnowledgeDomain extends Subclass implements ClericSubclass{
    public KnowledgeDomain() {
        super("Knowledge Domain");
    }
    @Override
    public void applyKnownSpells(List<String> spells) {
        String[] items = {"Identify", "Command"};
        addBonus(items, spells);
    }
}
