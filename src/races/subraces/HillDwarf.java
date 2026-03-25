package races.subraces;

import attributes.Ability;

import java.util.Map;

public class HillDwarf extends Subrace implements DwarvenSubrace{

    public HillDwarf(){
        super("Hill Dwarf");
    }

    @Override
    public void applyAbilityBonuses(Map<Ability, Integer> stats){
        stats.put(Ability.WISDOM, stats.get(Ability.WISDOM)+1);
    }
}
