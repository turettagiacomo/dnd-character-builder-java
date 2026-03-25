package races.subraces;

import attributes.Ability;

import java.util.List;
import java.util.Map;

public class DarkElf extends Subrace implements ElvenSubrace{

    public DarkElf(){
        super("Dark Elf");
    }
    @Override
    public void applyAbilityBonuses(Map<Ability, Integer> stats){
        stats.put(Ability.CHARISMA, stats.get(Ability.CHARISMA)+1);
    }
    @Override
    public void applyWeaponProficiencies(List<String> weaponProficiency){
        String[] items = {"Shortsword", "Rapiers", "Hand crossbow"};
        addBonus(items, weaponProficiency);
    }
    @Override
    public void applyKnownSpells(List<String> knownSpells){
        String[] items = {"Dancing lights"};
        addBonus(items, knownSpells);
    }
    @Override
    public void applyExtraBonuses(List<String> extra){
        extra.add("You have disadvantage on attack rolls and on Wisdom (Perception) checks that rely on sight when you, the target of your attack, or whatever you are trying to perceive is in direct sunlight.");
    }
}
