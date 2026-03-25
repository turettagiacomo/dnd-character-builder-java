package background;

import attributes.Skill;

import java.util.List;

public class Charlatan extends Background{
    public Charlatan() {
        super("Charlatan");
    }

    @Override
    public void applyProficiencies(List<Skill> skillProficiencies) {
        skillProficiencies.add(Skill.DECEPTION);
        skillProficiencies.add(Skill.SLEIGHT_OF_HAND);
    }
    @Override
    public void applyToolsProficiencies(List<String> toolsProficiencies) {
        String[] items = {"Disguise kit", "Forgery kit"};
        addBonus(items, toolsProficiencies);
    }

    @Override
    public void applyEquipment(List<String> equipment) {
        String[] items = {"Fine clothes", "Disguise kit", "Pouch with 15gp"};
        addBonus(items, equipment);
    }

    @Override
    public void applyBonuses(List<String> bonuses) {
        bonuses.add("False identity");
    }
}
