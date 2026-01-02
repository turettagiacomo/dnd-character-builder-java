package background;

import razze.Skill;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

public abstract class Background implements Serializable {
    private String nomeBackground;

    public Background(String nomeBackground) {
        this.nomeBackground = nomeBackground;
    }

    public String getNomeBackground() {
        return nomeBackground;
    }

    public void addBonus(String[] elementi, ArrayList<String> bonusType) {
        for(String s : elementi){
            if(!bonusType.contains(s)){
                bonusType.add(s);
            }
        }
    }

    public abstract void applicaCompetenzeAbilita(Map<String, Skill> mappaSkill);

    public void knownLanguages(ArrayList<String> languages){}

    public void applicaCompetenzaStrumenti(ArrayList<String> strumentiProficiency){}

    public abstract void applicaEquipaggiamento(ArrayList<String> equipaggiamento);

    public abstract void applicaPrivilegiBackground(ArrayList<String> feature);

}
