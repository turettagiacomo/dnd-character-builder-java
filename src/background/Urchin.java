package background;

import razze.Skill;

import java.util.ArrayList;
import java.util.Map;

public class Urchin extends Background{
    public Urchin() {
        super("Monello");
    }

    @Override
    public void applicaCompetenzeAbilita(Map<String, Skill> mappaSkill) {
        mappaSkill.get("Rapidità di mano").setCompetenza(true);
        mappaSkill.get("Furtività").setCompetenza(true);
    }

    @Override
    public void applicaCompetenzaStrumenti(ArrayList<String> strumentiProficiency) {
        String[] items = {"Kit per il trucco", "Strumenti da ladro"};
        addBonus(items, strumentiProficiency);
    }

    @Override
    public void applicaEquipaggiamento(ArrayList<String> equipaggiamento) {
        String[] items = {"Coltellino", "Mappa della città in cui sei cresciuto", "Topolino domestico",
                "Ricordo dei genitori", "Abiti comuni", "Borsa con 10 mo"};
        addBonus(items, equipaggiamento);
    }

    @Override
    public void applicaPrivilegiBackground(ArrayList<String> feature) {
        feature.add("Segreti della Città (Conosci passaggi segreti e vie veloci in città)");
    }
}
