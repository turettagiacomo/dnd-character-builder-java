package races;

import attributes.Ability;

import java.util.List;
import java.util.Map;

public class Dragonborn extends Race {
    private final String damageType;
    private final String breathType;

    public Dragonborn(String ancestry){
        super("Dragonborn", 9, false);

        switch (ancestry) {
            case "Black":
                damageType = "Acid";
                breathType = "1.5m x 9m line";
                break;
            case "Blue":
                damageType = "Lighting";
                breathType = "1.5m x 9m line";
                break;
            case "Brass":
                damageType = "Fire";
                breathType = "1.5m x 9m line";
                break;
            case "Bronze":
                damageType = "Lightning";
                breathType = "1.5m x 9m line";
                break;
            case "Copper":
                damageType = "Fire";
                breathType = "1.5m x 9m line";
                break;
            case "Gold":
                damageType = "Acid";
                breathType = "4.5m cone";
                break;
            case "Green":
                damageType = "Poison";
                breathType = "4.5m cone";
                break;
            case "Red":
                damageType = "Fire";
                breathType = "4.5m cone";
                break;
            case "Silver":
                damageType = "Ice";
                breathType = "4.5m cone";
                break;
            case "White":
                damageType = "Ice";
                breathType = "4.5m cone";
                break;
            default:
                throw new IllegalArgumentException("Invalid dragonborn ancestry");
        }
    }
    @Override
    public void applyRacialBonuses(Map<Ability, Integer> stats) {
        stats.put(Ability.STRENGTH, stats.get(Ability.STRENGTH)+2);
        stats.put(Ability.CHARISMA, stats.get(Ability.CHARISMA)+1);
    }
    @Override
    public void applyKnownLanguages(List<String> languages) {
        String[] items = {"Common", "Draconic"};
        addBonus(items, languages);
    }
    @Override
    public void applyResistances(List<String> resistance) {
        resistance.add("Resistance to: " + damageType.toLowerCase() + " damage(from draconic ancestry)");
    }
    @Override
    public void applyExtraBonuses(List<String> extras) {
        extras.add("Breath weapon (Action): " + breathType + " of " + damageType + ". Saving throw (DC 8 + CON modifier + Proficiency bonus). " + "Damage: 2d6 (halved on successful saving throw)");
    }
}