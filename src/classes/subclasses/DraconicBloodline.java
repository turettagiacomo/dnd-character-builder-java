package classes.subclasses;

import java.util.List;

public class DraconicBloodline extends Subclass implements SourcererSubclass {
    private final String tipoDanno;

    public DraconicBloodline(String ancestry) {
        super("Draconic ancestry");
        switch (ancestry.toLowerCase()) {
            case "black":
                tipoDanno = "Acid";
                break;
            case "blue":
                tipoDanno = "Lighting";
                break;
            case "brass":
                tipoDanno = "Fire";
                break;
            case "bronze":
                tipoDanno = "Lightning";
                break;
            case "copper":
                tipoDanno = "Fire";
                break;
            case "gold":
                tipoDanno = "Acid";
                break;
            case "green":
                tipoDanno = "Poison";
                break;
            case "red":
                tipoDanno = "Fire";
                break;
            case "silver":
                tipoDanno = "Ice";
                break;
            case "white":
                tipoDanno = "Ice";
                break;
            default:
                throw new IllegalArgumentException("No such ancestry");
        }
    }

    @Override
    public void applyResistances(List<String> resistances) {
        String[] items = {"Resistance to " + tipoDanno.toLowerCase() + " damage."};
        addBonus(items, resistances);
    }

    @Override
    public void applySubclassBonuses(List<String> subclassBonuses) {
        subclassBonuses.add("Draconic resilience");
    }
}
