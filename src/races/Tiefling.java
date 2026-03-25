package races;

import attributes.Ability;

import java.util.List;
import java.util.Map;

public class Tiefling extends Race {
    public Tiefling(){
        super("Tiefling", 9, true);
    }

    @Override
    public void applyRacialBonuses(Map<Ability, Integer> stats) {
        stats.put(Ability.INTELLIGENCE, stats.get(Ability.INTELLIGENCE)+1);
        stats.put(Ability.CHARISMA, stats.get(Ability.CHARISMA)+2);
    }

    @Override
    public void applyKnownLanguages(List<String> languages) {
        String[] items =  {"Common", "Infernal"};
        addBonus(items, languages);
    }

    @Override
    public void applyResistances(List<String> resistance) {
        resistance.add("You have resistance to fire damage.");
    }

    @Override
    public void applyKnownSpells(List<String> spells){
        String[] items = {"Thaumaturgy"};
        addBonus(items, spells);
    }
}
