package races;

import attributes.Ability;
import attributes.Skill;

import java.util.List;
import java.util.Map;

public class HalfOrc extends Race {
    public HalfOrc(){
        super("Half-Orc", 9, true);
    }

    @Override
    public void applyRacialBonuses(Map<Ability, Integer> stats) {
        stats.put(Ability.STRENGTH, stats.get(Ability.STRENGTH)+2);
        stats.put(Ability.CONSTITUTION, stats.get(Ability.CONSTITUTION)+1);
    }
    @Override
    public void applyProficiencies(List<Skill> skillProficiencies) {
        skillProficiencies.add(Skill.INTIMIDATION);
    }
    @Override
    public void applyKnownLanguages(List<String> languages) {
        String[] items = {"Common", "Orc"};
        addBonus(items, languages);
    }
    @Override
    public void applyExtraBonuses(List<String> extras) {
        extras.add("When you are reduced to 0 hit points but not killed outright, you can drop to 1 hit point instead. You can't use this feature again until you finish a long rest");
        extras.add("When you score a critical hit with a melee weapon attack, you can roll one of the weapon's damage dice one additional time and add it to the extra damage of the critical hit.");
    }
}
