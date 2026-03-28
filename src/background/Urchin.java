package background;

import attributes.Skill;

import java.util.List;

public class Urchin extends Background{
    public Urchin() {
        super("Urchin");
    }

    @Override
    public void applyProficiencies(List<Skill> skillProficiencies) {
        skillProficiencies.add(Skill.SLEIGHT_OF_HAND);
        skillProficiencies.add(Skill.STEALTH);
    }

    @Override
    public void applyToolsProficiencies(List<String> toolsProficiencies) {
        String[] items = {"Disguise kit", "Thieves' tools"};
        addBonus(items, toolsProficiencies);
    }

    @Override
    public void applyEquipment(List<String> equipment) {
        String[] items = {
                "Small knife", "Map of the city you grew up in", "Pet mouse",
                "Token to remember your parents", "Common clothes", "Pouch with 10gp"
        };
        addBonus(items, equipment);
    }

    @Override
    public void applyBonuses(List<String> bonuses) {
        bonuses.add("City secrets");
    }
}
