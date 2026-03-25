package races.subraces;

import attributes.Ability;

import java.util.List;
import java.util.Map;

public class StoutHalfling extends Subrace implements HalflingSubrace{

    public StoutHalfling(){
        super("Stout Halfling");
    }

    @Override
    public void applyAbilityBonuses(Map<Ability, Integer> stats){
        stats.put(Ability.CONSTITUTION, stats.get(Ability.CONSTITUTION)+1);
    }
    @Override
    public void applyAdvantageSavingThrows(List<String> advSt){
        advSt.add("You have advantage on saving throws against poison.");
    }
    @Override
    public void applyResistances(List<String> resistance){
        resistance.add("You have resistance against poison damage.");
    }
}
