package background;

import attributes.Skill;

import java.util.List;

public class FolkHero extends Background{
    public FolkHero() {
        super("Folk Hero");
    }

    @Override
    public void applyProficiencies(List<Skill> skillProficiencies) {
        skillProficiencies.add(Skill.ANIMAL_HANDLING);
        skillProficiencies.add(Skill.SURVIVAL);
    }

    public void applyToolsProficiencies(List<String> toolsProficiencies) {
        String[] items = {"Vehicles (land)"};
        addBonus(items, toolsProficiencies);
    }

    @Override
    public void applyEquipment(List<String> equipment) {
        String[] items = {"A set of artisan's tools", "Shovel", "Iron pot", "Common clothes", "Pouch with 10gp"};
        addBonus(items, equipment);
    }

    @Override
    public void applyBonuses(List<String> bonuses) {
        bonuses.add("Rustic hospitality");
    }
}
