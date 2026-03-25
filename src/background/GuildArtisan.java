package background;

import attributes.Skill;

import java.util.List;

public class GuildArtisan extends Background{
    public GuildArtisan() {
        super("Guild Artisan");
    }

    @Override
    public void applyProficiencies(List<Skill> skillProficiencies) {
        skillProficiencies.add(Skill.INSIGHT);
        skillProficiencies.add(Skill.PERSUASION);
    }
    @Override
    public void applyEquipment(List<String> equipment) {
        String[] items = {"Letter of introduction from your guild", "Traveller's clothes", "Pouch with 15gp"};
        addBonus(items, equipment);
    }

    @Override
    public void applyBonuses(List<String> feature) {
        feature.add("Guild membership");
    }
}
