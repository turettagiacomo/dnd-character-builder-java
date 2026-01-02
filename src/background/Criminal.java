package background;

import razze.Skill;

import java.util.ArrayList;
import java.util.Map;

public class Criminal extends Background{
    public Criminal() {
        super("Criminale");
    }

    @Override
    public void applicaCompetenzeAbilita(Map<String, Skill> mappaSkill) {
        mappaSkill.get("Furtività").setCompetenza(true);
        mappaSkill.get("Inganno").setCompetenza(true);
    }

    @Override
    public void applicaCompetenzaStrumenti(ArrayList<String> strumentiProficiency) {
        String[] items = {"Strumenti da ladro"};
        addBonus(items, strumentiProficiency);
    }

    @Override
    public void applicaEquipaggiamento(ArrayList<String> equipaggiamento) {
        String[] items = {"Piede di porco", "Abiti comuni scuri con cappuccio", "Borsa con 15 mo"};
        addBonus(items, equipaggiamento);
    }

    @Override
    public void applicaPrivilegiBackground(ArrayList<String> feature) {
        feature.add("Contatto Criminale (Hai un collegamento nella rete criminale)");
    }
}
