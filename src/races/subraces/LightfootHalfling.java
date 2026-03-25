package races.subraces;

import attributes.Ability;

import java.util.List;
import java.util.Map;

public class LightfootHalfling extends Subrace implements HalflingSubrace{

    public LightfootHalfling(){
        super("Lightfoot Halfling");
    }

    @Override
    public void applyAbilityBonuses(Map<Ability, Integer> stats){
        stats.put(Ability.CHARISMA, stats.get(Ability.CHARISMA)+1);
    }
    @Override
    public void applyExtraBonuses(List<String> extra){
        extra.add("You can attempt to hide even when you are obscured only by a creature that is at least one size larger than you.");
    }
}
