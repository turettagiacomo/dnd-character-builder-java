package background;

import razze.Skill;

import java.util.ArrayList;
import java.util.Map;

public class Entertainer extends Background{
    public Entertainer() {
        super("Intrattenitore");
    }

    @Override
    public void applicaCompetenzeAbilita(Map<String, Skill> mappaSkill) {
        mappaSkill.get("Acrobazia").setCompetenza(true);
        mappaSkill.get("Intrattenere").setCompetenza(true);
    }

    @Override
    public void applicaCompetenzaStrumenti(ArrayList<String> strumentiProficiency) {
        String[] items ={"Kit per il trucco"};
        addBonus(items, strumentiProficiency);
    }

    @Override
    public void applicaEquipaggiamento(ArrayList<String> equipaggiamento) {
        String[] items = {"Favore di un ammiratore", "Costume di scena", "Borsa con 15 mo"};
        addBonus(items, equipaggiamento);
    }

    @Override
    public void applicaPrivilegiBackground(ArrayList<String> feature) {
        feature.add("A Grande Richiesta (Puoi trovare vitto e alloggio esibendoti)");
    }
}
