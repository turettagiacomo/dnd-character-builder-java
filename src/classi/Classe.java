package classi;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Classe implements Serializable {
    private String nomeClasse;
    private int bonusCompetenza;
    private String hitDice;
    private int hitPoints;

    public Classe(String className, int proficienyBonus, String hD, int hP) {
        this.nomeClasse = className;
        this.bonusCompetenza = proficienyBonus;
        this.hitDice = hD;
        this.hitPoints = hP;
    }

    public String getNomeClasse() {
        return nomeClasse;
    }
    public int getBonusCompetenza() {
        return bonusCompetenza;
    }
    public String getHitDice() {
        return hitDice;
    }
    public int getHitPoints() {
        return hitPoints;
    }

    public void addBonus(String[] elementi, ArrayList<String> bonusType) {
        for(String s : elementi){
            if(!bonusType.contains(s)){
                bonusType.add(s);
            }
        }
    }

    public void applicaCompetenzaArmature(ArrayList<String> armorProficiency){}

    public abstract void applicaCompetenzaArmi(ArrayList<String> weaponProficiency);

    public void applicaCompetenzaStrumenti(ArrayList<String> strumentiProficiency){}

    public void applicaEquipaggiamento(ArrayList<String> equipaggiamento){}

    public void applicaArmature(ArrayList<String> armature){}

    public void applicaArmi(ArrayList<String> armi){}

    public abstract void applicaCompetenzaTiriSalvezza(ArrayList<String> proficiencyST);

    public abstract void applicaPrivilegiClasse(ArrayList<String> privilegiClasse);

    public String getCaratteristicaIncantatore(){
        return null;
    }

    public void addSpells(ArrayList<String> spells){}

    public void addResistance(ArrayList<String> resistance){}
}
