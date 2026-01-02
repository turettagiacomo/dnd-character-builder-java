package background;

import razze.Skill;

import java.util.ArrayList;
import java.util.Map;

public class Charlatan extends Background{
    public Charlatan() {
        super("Ciarlatano");
    }

    @Override
    public void applicaCompetenzeAbilita(Map<String, Skill> mappaSkill) {
        mappaSkill.get("Inganno").setCompetenza(true);
        mappaSkill.get("Rapidità di mano").setCompetenza(true);
    }

    @Override
    public void applicaCompetenzaStrumenti(ArrayList<String> strumentiProficiency) {
        String[] items = {"Kit per il trucco", "Kit per falsificare"};
        addBonus(items, strumentiProficiency);
    }

    @Override
    public void applicaEquipaggiamento(ArrayList<String> equipaggiamento) {
        String[] items = {"Abiti pregiati", "Kit per il trucco", "Borsa con 15 mo"};
        addBonus(items, equipaggiamento);
    }

    @Override
    public void applicaPrivilegiBackground(ArrayList<String> feature) {
        feature.add("Falsa Identità (Possiedi documenti e alias per una seconda vita)");
    }
}
