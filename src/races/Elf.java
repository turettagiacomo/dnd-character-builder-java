package races;

import attributes.Ability;
import attributes.Skill;
import races.subraces.ElvenSubrace;
import races.subraces.Subrace;

import java.util.List;
import java.util.Map;

public class Elf extends Race {

    private final Subrace subrace;
    public Elf(ElvenSubrace subraceInput){
        super("Elf", 9, true);
        this.subrace = (Subrace) subraceInput;
        subrace.overrideSpeed(this);
    }

    @Override
    public void applyRacialBonuses(Map<Ability, Integer> stats) {
        stats.put(Ability.DEXTERITY, stats.get(Ability.DEXTERITY)+2);
        this.subrace.applyAbilityBonuses(stats);
    }

    @Override
    public void applyProficiencies(List<Skill> skillProficiencies) {
        skillProficiencies.add(Skill.PERCEPTION);
    }

    @Override
    public void applyKnownLanguages(List<String> languages) {
        String[] items = {"Common", "Elvish"};
        addBonus(items, languages);
    }

    @Override
    public void applyAdvantageSavingThrows(List<String> advSt) {
        advSt.add("You have advantage on saving throws against being charmed");
    }

    @Override
    public void applyWeaponProficiencies(List<String> weaponProficiency) {
        this.subrace.applyWeaponProficiencies(weaponProficiency);
    }

    @Override
    public void applyExtraBonuses(List<String> extras) {
        extras.add("Elves don't need to sleep. Instead, they meditate deeply, remaining semiconscious, for 4 hours a day. While meditating, you can dream after a fashion; such dreams are actually mental exercises that have become reflexive through years of practice. After resting in this way, you gain the same benefit that a human does from 8 hours of sleep.");
        extras.add("Magic can't put you to sleep.");
        this.subrace.applyExtraBonuses(extras);
    }

    @Override
    public void applyKnownSpells(List<String> spells) {
        this.subrace.applyKnownSpells(spells);
    }
}