package background;

import attributes.Skill;

import java.util.List;

public class Entertainer extends Background{
    public Entertainer() {
        super("Entertainer");
    }

    @Override
    public void applyProficiencies(List<Skill> skillProficiencies) {
        skillProficiencies.add(Skill.ACROBATICS);
        skillProficiencies.add(Skill.PERFORMANCE);
    }

    @Override
    public void applyToolsProficiencies(List<String> toolsProficiencies) {
        String[] items ={"Disguise kit"};
        addBonus(items, toolsProficiencies);
    }

    @Override
    public void applyEquipment(List<String> equipment) {
        String[] items = {"Favor of an admirer", "Costume", "Belt pouch with 15gp"};
        addBonus(items, equipment);
    }

    @Override
    public void applyBonuses(List<String> bonuses) {
        bonuses.add("By popular demand");
    }
}
