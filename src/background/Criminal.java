package background;

import attributes.Skill;

import java.util.List;

public class Criminal extends Background{
    public Criminal() {
        super("Criminal");
    }

    @Override
    public void applyProficiencies(List<Skill> skillProficiencies) {
        skillProficiencies.add(Skill.STEALTH);
        skillProficiencies.add(Skill.DECEPTION);
    }

    @Override
    public void applyToolsProficiencies(List<String> toolsProficiencies) {
        String[] items = {"Thieves' tools"};
        addBonus(items, toolsProficiencies);
    }

    @Override
    public void applyEquipment(List<String> equipment) {
        String[] items = {"Crowbar", "Dark common clothes with hood", "Pouch with 10gp"};
        addBonus(items, equipment);
    }

    @Override
    public void applyBonuses(List<String> bonuses) {
        bonuses.add("Criminal contact");
    }
}
