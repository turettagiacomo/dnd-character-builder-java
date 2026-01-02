package background;

import razze.Skill;

import java.util.ArrayList;
import java.util.Map;

public class GuildArtisan extends Background{
    public GuildArtisan() {
        super("Artigiano di gilda");
    }

    @Override
    public void applicaCompetenzeAbilita(Map<String, Skill> mappaSkill) {
        mappaSkill.get("Intuizione").setCompetenza(true);
        mappaSkill.get("Persuasione").setCompetenza(true);
    }

    @Override
    public void applicaEquipaggiamento(ArrayList<String> equipaggiamento) {
        String[] items = {"Lettera di presentazione della gilda", "Abiti da viaggiatore", "Borsa con 15 mo"};
        addBonus(items, equipaggiamento);
    }

    @Override
    public void applicaPrivilegiBackground(ArrayList<String> feature) {
        feature.add("Iscrizione alla Gilda (Accesso alle sale della gilda e supporto legale)");
    }
}
