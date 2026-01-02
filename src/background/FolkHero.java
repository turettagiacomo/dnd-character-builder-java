package background;

import razze.Skill;

import java.util.ArrayList;
import java.util.Map;

public class FolkHero extends Background{
    public FolkHero() {
        super("Eroe popolare");
    }

    @Override
    public void applicaCompetenzeAbilita(Map<String, Skill> mappaSkill) {
        mappaSkill.get("Addestrare animali").setCompetenza(true);
        mappaSkill.get("Sopravvivenza").setCompetenza(true);
    }

    @Override
    public void applicaCompetenzaStrumenti(ArrayList<String> strumentiProficiency) {
        String[] items = {"Veicoli terrestri"};
        addBonus(items, strumentiProficiency);
    }

    @Override
    public void applicaEquipaggiamento(ArrayList<String> equipaggiamento) {
        String[] items = {"Set strumenti da artigiano","Pala", "Pentola di ferro", "Abiti comuni", "Borsa con 10 mo"};
        addBonus(items, equipaggiamento);
    }

    @Override
    public void applicaPrivilegiBackground(ArrayList<String> feature) {
        feature.add("Ospitalità Rurale (La gente comune ti aiuta e nasconde)");
    }
}
