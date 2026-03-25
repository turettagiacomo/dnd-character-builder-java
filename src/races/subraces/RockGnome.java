package races.subraces;

import attributes.Ability;

import java.util.List;
import java.util.Map;

public class RockGnome extends Subrace implements GnomishSubrace {

    public RockGnome(){
        super("Rock Gnome");
    }

    @Override
    public void applyAbilityBonuses(Map<Ability, Integer> stats){
        stats.put(Ability.CONSTITUTION, stats.get(Ability.CONSTITUTION)+1);
    }
    @Override
    public void applyExtraBonuses(List<String> extra) {
        extra.add("Whenever you make an Intelligence (History) check related to magic items, alchemical objects, ar technological devices, you can add twice your proficiency bonus, instead of any proficiency bonus you normally apply.");
    }
    @Override
    public void applyToolsProficiencies(List<String> toolProficiencies){
        String[] items = {"Tinker's tools"};
        addBonus(items, toolProficiencies);
    }
}
