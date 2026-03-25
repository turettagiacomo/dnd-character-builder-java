package races;

import attributes.Ability;

import java.util.List;
import java.util.Map;

public class HalfElf extends Race {
    public HalfElf(){
        super("Half-Elf", 9, true);
    }

    @Override
    public void applyRacialBonuses(Map<Ability, Integer> stats){
        stats.put(Ability.CHARISMA, stats.get(Ability.CHARISMA)+2);
    }
    @Override
    public void applyKnownLanguages(List<String> languages) {
        String[] items = {"Common", "Elvish"};
        addBonus(items, languages);
    }
    @Override
    public void applyAdvantageSavingThrows(List<String> advSt) {
        advSt.add("You have advantage on saving throws against being charmed.");
    }
    @Override
    public void applyExtraBonuses(List<String> extras) {
        extras.add("Magic can't put you to sleep.");
    }
}
