package background;

import razze.Skill;

import java.util.ArrayList;
import java.util.Map;

public class Soldier extends Background{
    public Soldier() {
        super("Soldato");
    }

    @Override
    public void applicaCompetenzeAbilita(Map<String, Skill> mappaSkill) {
        mappaSkill.get("Atletica").setCompetenza(true);
        mappaSkill.get("Intimidire").setCompetenza(true);
    }

    @Override
    public void applicaCompetenzaStrumenti(ArrayList<String> strumentiProficiency) {
        String[] items = {"Veicoli terrestri"};
        addBonus(items, strumentiProficiency);
    }

    @Override
    public void applicaEquipaggiamento(ArrayList<String> equipaggiamento) {
        String[]  items = {"Insegna di grado", "Trofeo di un nemico caduto", "Set di dadi o carte", "Abiti comuni", "Borsa con 10 mo"};
        addBonus(items, equipaggiamento);
    }

    @Override
    public void applicaPrivilegiBackground(ArrayList<String> feature) {
        feature.add("Grado Militare (I soldati fedeli alla tua organizzazione riconoscono la tua autorità)");
    }
}
