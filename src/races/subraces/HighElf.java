package races.subraces;

import attributes.Ability;

import java.util.List;
import java.util.Map;

public class HighElf extends Subrace implements ElvenSubrace{

    public HighElf(){
        super("High Elf");
    }

    @Override
    public void applyAbilityBonuses(Map<Ability, Integer> stats){
        stats.put(Ability.INTELLIGENCE, stats.get(Ability.INTELLIGENCE)+1);
    }
    @Override
    public void applyWeaponProficiencies(List<String> weaponProficiencies){
        String[] items = {"Shortsword", "Longsword", "Shortbow", "Longbow"};
        addBonus(items, weaponProficiencies);
    }
}
