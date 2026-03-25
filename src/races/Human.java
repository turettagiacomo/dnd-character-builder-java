package races;

import attributes.Ability;

import java.util.List;
import java.util.Map;

public class Human extends Race {
    public Human(){
        super("Human", 9, false);
    }

    @Override
    public void applyRacialBonuses(Map<Ability, Integer> stats) {
        stats.put(Ability.STRENGTH, stats.get(Ability.STRENGTH)+1);
        stats.put(Ability.CONSTITUTION, stats.get(Ability.CONSTITUTION)+1);
        stats.put(Ability.DEXTERITY, stats.get(Ability.DEXTERITY)+1);
        stats.put(Ability.INTELLIGENCE, stats.get(Ability.INTELLIGENCE)+1);
        stats.put(Ability.WISDOM, stats.get(Ability.WISDOM)+1);
        stats.put(Ability.CHARISMA, stats.get(Ability.CHARISMA)+1);
    }
    @Override
    public void applyKnownLanguages(List<String> languages) {
        String[] items = {"Common"};
        addBonus(items, languages);
    }
}