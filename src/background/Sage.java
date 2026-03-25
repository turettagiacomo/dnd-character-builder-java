package background;

import attributes.Skill;

import java.util.List;

public class Sage extends Background{
    public Sage() {
        super("Sage");
    }

    @Override
    public void applyProficiencies(List<Skill> skillProficiencies) {
        skillProficiencies.add(Skill.ARCANA);
        skillProficiencies.add(Skill.HISTORY);
    }

    @Override
    public void applyEquipment(List<String> equipment) {
        String[] items = {"Bottle of black ink", "Quill", "Small knife", "Letter from a dead colleague posing a question you have not yet been able to answer", "Common clothes", "Pouch with 10gp"};
        addBonus(items, equipment);
    }

    @Override
    public void applyBonuses(List<String> bonuses) {
        bonuses.add("Researcher");
    }
}
