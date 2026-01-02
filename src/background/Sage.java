package background;

import razze.Skill;

import java.util.ArrayList;
import java.util.Map;

public class Sage extends Background{
    public Sage() {
        super("Saggio");
    }

    @Override
    public void applicaCompetenzeAbilita(Map<String, Skill> mappaSkill) {
        mappaSkill.get("Arcano").setCompetenza(true);
        mappaSkill.get("Storia").setCompetenza(true);
    }

    @Override
    public void applicaEquipaggiamento(ArrayList<String> equipaggiamento) {
        String[] items = {"Boccetta di inchiostro nero", "Pennino", "Coltellino", "Lettera di un collega morto", "Abiti comuni", "Borsa con 10 mo"};
        addBonus(items, equipaggiamento);
    }

    @Override
    public void applicaPrivilegiBackground(ArrayList<String> feature) {
        feature.add("Ricercatore (Sai dove trovare le informazioni che non conosci)");
    }
}
