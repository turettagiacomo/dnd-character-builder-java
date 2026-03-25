package background;

import attributes.Skill;

import java.util.List;

public class Soldier extends Background{
    public Soldier() {
        super("Soldier");
    }

    @Override
    public void applyProficiencies(List<Skill> skillProficiencies) {
        skillProficiencies.add(Skill.ATHLETICS);
        skillProficiencies.add(Skill.INTIMIDATION);
    }

    public void applyToolsProficiencies(List<String> toolsProficiencies) {
        String[] items = {"Vehicles (land)"};
        addBonus(items, toolsProficiencies);
    }

    @Override
    public void applyEquipment(List<String> equipment) {
        String[]  items = {"Insignia of rank", "A trophy taken from a fallen enemy", "A set of bone dice or deck of cards", "Common clothes", "Pouch with 10gp"};
        addBonus(items, equipment);
    }

    @Override
    public void applyBonuses(List<String> bonuses) {
        bonuses.add("Military rank");
    }
}
