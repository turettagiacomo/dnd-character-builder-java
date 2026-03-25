package races;

import attributes.Ability;
import races.subraces.GnomishSubrace;
import races.subraces.Subrace;

import java.util.List;
import java.util.Map;

public class Gnome extends Race {

    private final Subrace subrace;
    public Gnome(GnomishSubrace subraceInput){
        super("Gnome", 7.5F, true);
        this.subrace = (Subrace) subraceInput;
    }

    @Override
    public void applyRacialBonuses(Map<Ability, Integer> stats) {
        stats.put(Ability.INTELLIGENCE, stats.get(Ability.INTELLIGENCE)+2);
        this.subrace.applyAbilityBonuses(stats);
    }

    @Override
    public void applyKnownLanguages(List<String> languages) {
        String[] items = {"Common", "Gnomish"};
        addBonus(items, languages);
    }

    @Override
    public void applyAdvantageSavingThrows(List<String> advSt) {
        advSt.add("You have advantage on all Intelligence, Wisdom, and Charisma saving throws against magic.");
    }

    @Override
    public void applyKnownSpells(List<String> spells) {
        this.subrace.applyKnownSpells(spells);
    }

    @Override
    public void applyExtraBonuses(List<String> extras) {
        this.subrace.applyExtraBonuses(extras);
    }

    @Override
    public void applyToolsProficiencies(List<String> toolsProficiency) {
        this.subrace.applyToolsProficiencies(toolsProficiency);
    }
}