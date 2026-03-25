package classes.subclasses;

import java.util.List;

public class WildMagic extends Subclass implements SourcererSubclass{
    public WildMagic() {
        super("Wild magic");
    }

    @Override
    public void applySubclassBonuses(List<String> subclassBonuses) {
        subclassBonuses.add("Wild magic surge");
        subclassBonuses.add("Tides of chaos");
    }
}