package races.subraces;

import attributes.Ability;

import java.util.List;
import java.util.Map;

public class ForestGnome extends Subrace implements GnomishSubrace {

    public ForestGnome(){
        super("Forest Gnome");
    }

    @Override
    public void applyAbilityBonuses(Map<Ability, Integer> stats){
        stats.put(Ability.DEXTERITY, stats.get(Ability.DEXTERITY)+1);
    }
    @Override
    public void applyKnownSpells(List<String> knownSpells) {
        String[] items = {"Minor illusion"};
        addBonus(items, knownSpells);
    }
    @Override
    public void applyExtraBonuses(List<String> extra) {
        extra.add("Through sounds and gestures, you can communicate simple ideas with Small or smaller beasts. Forest gnomes love animals and often keep squirrels, badgers, rabbits, moles, woodpeckers, and other creatures as beloved pets.");
    }
}