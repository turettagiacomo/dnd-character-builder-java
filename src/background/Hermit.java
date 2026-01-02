package background;

import razze.Skill;

import java.util.ArrayList;
import java.util.Map;

public class Hermit extends Background{
    public Hermit() {
        super("Eremita");
    }

    @Override
    public void applicaCompetenzeAbilita(Map<String, Skill> mappaSkill) {
        mappaSkill.get("Medicina").setCompetenza(true);
        mappaSkill.get("Religione").setCompetenza(true);
    }

    @Override
    public void applicaCompetenzaStrumenti(ArrayList<String> strumentiProficiency) {
        String[] items = {"Borsa da erborista"};
        addBonus(items, strumentiProficiency);
    }

    @Override
    public void applicaEquipaggiamento(ArrayList<String> equipaggiamento) {
        String[] items = {"Custodia per pergamene piena di appunti", "Coperta invernale",
                "Abiti comuni", "Borsa da erborista", "Borsa con 5 mo"};
        addBonus(items, equipaggiamento);
    }

    @Override
    public void applicaPrivilegiBackground(ArrayList<String> feature) {
        feature.add("Scoperta (Conosci un segreto unico o fondamentale del multiverso)");
    }
}
