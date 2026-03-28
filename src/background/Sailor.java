package background;

import attributes.Skill;

import java.util.List;

public class Sailor extends Background{
    public Sailor() {
        super("Sailor");
    }

    @Override
    public void applyProficiencies(List<Skill> skillProficiencies) {
        skillProficiencies.add(Skill.ATHLETICS);
        skillProficiencies.add(Skill.PERCEPTION);
    }

    @Override
    public void applyToolsProficiencies(List<String> toolsProficiencies) {
        String[] items = {"Navigator's tools", "Vehicles (water)"};
        addBonus(items, toolsProficiencies);
    }

    @Override
    public void applyEquipment(List<String> equipment) {
        String[] items = {
                "Belaying pin (club)", "50 feet of silk rope", "Lucky charm", "Common clothes", "Pouch with 10gp"
        };
        addBonus(items, equipment);
    }

    @Override
    public void applyBonuses(List<String> bonuses) {
        bonuses.add("Ship's passage");
    }
}
