package background;

import attributes.Skill;

import java.util.List;

public class Outlander extends Background{
    public Outlander() {
        super("Outlander");
    }

    @Override
    public void applyProficiencies(List<Skill> skillProficiencies) {
        skillProficiencies.add(Skill.ATHLETICS);
        skillProficiencies.add(Skill.SURVIVAL);
    }

    public void applyEquipment(List<String> equipment) {
        String[] items = {"Staff", "Hunting trap", "Trophy from an animal you killed", "Traveller's clothes", "Pouch with 10gp"};
        addBonus(items, equipment);
    }

    @Override
    public void applyBonuses(List<String> bonuses) {
        bonuses.add("Wanderer");
    }
}
