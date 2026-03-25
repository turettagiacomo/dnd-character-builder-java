package background;

import attributes.Skill;

import java.util.List;

public class Hermit extends Background{
    public Hermit() {
        super("Hermit");
    }

    @Override
    public void applyProficiencies(List<Skill> skillProficiencies) {
        skillProficiencies.add(Skill.MEDICINE);
        skillProficiencies.add(Skill.RELIGION);
    }
    @Override
    public void applyToolsProficiencies(List<String> toolsProficiencies) {
        String[] items = {"Herbalism kit"};
        addBonus(items, toolsProficiencies);
    }
    @Override
    public void applyEquipment(List<String> equipment) {
        String[] items = {"Scrolls case stuffed full of notes of your studies or prayers", "Winter blanket",
                "Common clothes", "Herbalism kit", "Pouch with 5gp"};
        addBonus(items, equipment);
    }

    @Override
    public void applyBonuses(List<String> bonuses) {
        bonuses.add("Discovery");
    }
}
