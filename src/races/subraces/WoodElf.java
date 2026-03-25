package races.subraces;

import attributes.Ability;
import races.Race;

import java.util.List;
import java.util.Map;

public class WoodElf extends Subrace implements ElvenSubrace{

    public WoodElf(){
        super("Wood Elf");
    }

    @Override
    public void overrideSpeed(Race race) {
        race.setBaseSpeed(10.5F);
    }
    @Override
    public void applyAbilityBonuses(Map<Ability, Integer> stats){
        stats.put(Ability.WISDOM, stats.get(Ability.WISDOM)+1);
    }
    @Override
    public void applyWeaponProficiencies(List<String> weaponProficiency){
        String[] items = {"Shortsword", "Longsword", "Shortbow", "Longbow"};
        addBonus(items, weaponProficiency);
    }
    @Override
    public void applyExtraBonuses(List<String> extra) {
        extra.add("You can attempt to hide even when you are only lightly obscured by foliage, heavy rain, falling snow, mist, and other natural phenomena.");
    }
}
