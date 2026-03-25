package races;

import attributes.Ability;
import races.subraces.HalflingSubrace;
import races.subraces.Subrace;

import java.util.List;
import java.util.Map;

public class Halfling extends Race {

    private final Subrace subraceChosen;
    public Halfling(HalflingSubrace subraceInput){
        super("Halfling", 7.5F, false);
        this.subraceChosen = (Subrace) subraceInput;
    }

    @Override
    public void applyRacialBonuses(Map<Ability, Integer> stats) {
        stats.put(Ability.DEXTERITY, stats.get(Ability.DEXTERITY)+2);
        this.subraceChosen.applyAbilityBonuses(stats);
    }

    @Override
    public void applyKnownLanguages(List<String> languages) {
        String[] items = {"Common", "Halfling"};
        addBonus(items, languages);
    }

    @Override
    public void applyAdvantageSavingThrows(List<String> advSt) {
        advSt.add("You have advantage on saving throws against being frightened.");
        this.subraceChosen.applyAdvantageSavingThrows(advSt);
    }

    @Override
    public void applyExtraBonuses(List<String> extras) {
        extras.add("When you roll a 1 on an attack roll, ability check, or saving throw, you can reroll the die and must use the new roll.");
        extras.add("You can move through the space of any creature that is of a size larger than yours.");
        this.subraceChosen.applyExtraBonuses(extras);
    }

    @Override
    public void applyResistances(List<String> resistance) {
        this.subraceChosen.applyResistances(resistance);
    }
}