package background;

import razze.Skill;

import java.util.ArrayList;
import java.util.Map;

public class Acolyte extends Background{
    public Acolyte() {
        super("Accolito");
    }

    @Override
    public void applicaCompetenzeAbilita(Map<String, Skill> mappaSkill) {
        mappaSkill.get("Intuizione").setCompetenza(true);
        mappaSkill.get("Religione").setCompetenza(true);
    }

    @Override
    public void applicaEquipaggiamento(ArrayList<String> equipaggiamento) {
        String[] items = {"Simbolo sacro", "5 bastoncini di incenso", "Vestamenti", "Vestiti comuni", "Sacca da cintura"};
        addBonus(items, equipaggiamento);
    }

    @Override
    public void applicaPrivilegiBackground(ArrayList<String> feature) {
        feature.add("Rifugio del Fedele (Ospitalità presso templi della tua fede)");
    }
}
