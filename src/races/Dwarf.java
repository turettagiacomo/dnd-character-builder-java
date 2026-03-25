package races;

import attributes.Ability;
import races.subraces.DwarvenSubrace;
import races.subraces.Subrace;

import java.util.List;
import java.util.Map;

public class Dwarf extends Race {

    private final Subrace subrace;
    public Dwarf(DwarvenSubrace subraceInput){
        super("Dwarf", 7.5F, true);
        this.subrace = (Subrace) subraceInput;
    }

    @Override
    public void applyRacialBonuses(Map<Ability, Integer> stats) {
        stats.put(Ability.CONSTITUTION, stats.get(Ability.CONSTITUTION)+2);
        this.subrace.applyAbilityBonuses(stats);
    }
    @Override
    public void applyKnownLanguages(List<String> languages) {
        String[] items =  {"Common", "Dwarvish"};
        addBonus(items, languages);
    }
    @Override
    public void applyResistances(List<String> resistance) {
        resistance.add("You have resistance against poison damage");
    }
    @Override
    public void applyAdvantageSavingThrows( List<String> advSt) {
        advSt.add("You have advantage on saving throws against poison");
    }
    @Override
    public void applyExtraBonuses(List<String> extras) {
        extras.add("Dwarven toughness");
        extras.add("Whenever you make an Intelligence (History) check related to the origin of stonework, you are considered proficient in the History skill and add double your proficiency bonus to the check, instead of your normal proficiency bonus");
    }
    @Override
    public void applyWeaponProficiencies(List<String> weaponProficiency) {
        String[] items = {"Battleaxe", "Handaxe", "Throwing hammer", "Warhammer"};
        addBonus(items, weaponProficiency);
    }
    @Override
    public void applyArmorProficiencies(List<String> armorProficiency){
        this.subrace.applyArmorProficiencies(armorProficiency);
    }
}