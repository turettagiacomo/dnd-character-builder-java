package background;

import razze.Skill;

import java.util.ArrayList;
import java.util.Map;

public class Sailor extends Background{
    public Sailor() {
        super("Marinaio");
    }

    @Override
    public void applicaCompetenzeAbilita(Map<String, Skill> mappaSkill) {
        mappaSkill.get("Atletica").setCompetenza(true);
        mappaSkill.get("Percezione").setCompetenza(true);
    }

    @Override
    public void applicaCompetenzaStrumenti(ArrayList<String> strumentiProficiency) {
        String[] items = {"Strumenti da navigatore", "Veicoli acquatici"};
        addBonus(items, strumentiProficiency);
    }

    @Override
    public void applicaEquipaggiamento(ArrayList<String> equipaggiamento) {
        String[] items = {"Mazza", "15m di corda di seta", "Portafortuna", "Abiti comuni", "Borsa con 10 mo"};
        addBonus(items, equipaggiamento);
    }

    @Override
    public void applicaPrivilegiBackground(ArrayList<String> feature) {
        feature.add("Passaggio Marittimo (Puoi ottenere passaggio gratuito sulle navi per te e il gruppo)");
    }
}
