package races.subraces;

import attributes.Ability;

import java.util.List;
import java.util.Map;

public class MountainDwarf extends Subrace implements DwarvenSubrace{

    public MountainDwarf(){
        super("Mountain Dwarf");
    }

    @Override
    public void applyAbilityBonuses(Map<Ability, Integer> stats){
        stats.put(Ability.STRENGTH, stats.get(Ability.STRENGTH)+2);
    }
    @Override
    public void applyArmorProficiencies(List<String> armorProficiencies){
        String[] items = {"Light armor", "Medium armor"};
        addBonus(items, armorProficiencies);
    }
}