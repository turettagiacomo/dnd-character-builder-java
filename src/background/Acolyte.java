package background;

import attributes.Skill;

import java.util.List;

public class Acolyte extends Background{
    public Acolyte() {
        super("Acolyte");
    }

    @Override
    public void applyProficiencies(List<Skill> skillProficiencies) {
        skillProficiencies.add(Skill.INSIGHT);
        skillProficiencies.add(Skill.RELIGION);
    }

    @Override
    public void applyEquipment(List<String> equipment) {
        String[] items = {"5 sticks of incense", "Vestments", "Common clothes", "Belt pouch with 15gp"};
        addBonus(items, equipment);
    }

    @Override
    public void applyBonuses(List<String> bonuses) {
        bonuses.add("Shelter of the faithful");
    }
}
