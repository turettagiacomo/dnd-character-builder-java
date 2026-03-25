package background;

import attributes.Skill;

import java.util.List;

public class Noble extends Background{
    public Noble() {
        super("Noble");
    }

    @Override
    public void applyProficiencies(List<Skill> skillProficiencies) {
        skillProficiencies.add(Skill.HISTORY);
        skillProficiencies.add(Skill.PERSUASION);
    }

    @Override
    public void applyEquipment(List<String> equipment) {
        String[] items = {"Fine clothes", "Signet ring", "Scroll of pedigree", "Pouch with 25gp"};
        addBonus(items, equipment);
    }

    @Override
    public void applyBonuses(List<String> bonuses) {
        bonuses.add("Position of privilege");
    }
}
