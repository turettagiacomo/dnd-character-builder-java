package background;

import razze.Skill;

import java.util.ArrayList;
import java.util.Map;

public class Outlander extends Background{
    public Outlander() {
        super("Forestiero");
    }

    @Override
    public void applicaCompetenzeAbilita(Map<String, Skill> mappaSkill) {
        mappaSkill.get("Atletica").setCompetenza(true);
        mappaSkill.get("Sopravvivenza").setCompetenza(true);
    }

    @Override
    public void applicaEquipaggiamento(ArrayList<String> equipaggiamento) {
        String[] items = {"Bastone", "Trappola per caccia", "Trofeo di un animale ucciso", "Abiti da viaggiatore", "Borsa con 10 mo"};
        addBonus(items, equipaggiamento);
    }

    @Override
    public void applicaPrivilegiBackground(ArrayList<String> feature) {
        feature.add("Viandante (Puoi trovare cibo e acqua per te e 5 compagni nelle terre selvagge)");
    }
}
