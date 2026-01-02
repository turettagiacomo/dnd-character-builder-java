package background;

import razze.Skill;

import java.util.ArrayList;
import java.util.Map;

public class Noble extends Background{
    public Noble() {
        super("Nobile");
    }

    @Override
    public void applicaCompetenzeAbilita(Map<String, Skill> mappaSkill) {
        mappaSkill.get("Storia").setCompetenza(true);
        mappaSkill.get("Persuasione").setCompetenza(true);
    }

    @Override
    public void applicaEquipaggiamento(ArrayList<String> equipaggiamento) {
        String[] items = {"Abiti pregiati", "Anello con sigillo", "Pergamena con albero genealogico", "Borsa con 25 mo"};
        addBonus(items, equipaggiamento);
    }

    @Override
    public void applicaPrivilegiBackground(ArrayList<String> feature) {
        feature.add("Posizione Privilegiata (Sei benvenuto nell'alta società)");
    }
}
