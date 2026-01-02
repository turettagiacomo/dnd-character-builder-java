package razze;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class Razza implements Serializable {
    //variabili di esemplare che sicuramente hanno tutte le razze
    private String nomeRazza;
    private float baseSpeed;
    private final boolean scurovisione;

    //costruttore della Classe madre
    public Razza(String nome, float speed, boolean scurovisione) {
        this.nomeRazza = nome;
        this.baseSpeed = speed;
        this.scurovisione = scurovisione;
    }

    //metodi concreti (scrivo una sola volta)
    //permettono di accedere a questi parametri
    public float getBaseSpeed() {
        return baseSpeed;
    }
    public String getNomeRazza() {
        return nomeRazza;
    }
    public boolean getScurovisione() {
        return scurovisione;
    }

    public void setBaseSpeed(float baseSpeed) {
        this.baseSpeed = baseSpeed;
    }

    public void addBonus(String[] elementi, ArrayList<String> bonusType) {
        for(String s : elementi){
            if(!bonusType.contains(s)){
                bonusType.add(s);
            }
        }
    }

    //applica il bonus di competenza delle razze
    public void applicaCompetenza(Map<String, Skill> proficiency){}

    //applica le resistenze della Classe
    public void applicaResistenze(ArrayList<String> resistance){}

    //applica il vantaggio nei tiri salvezza
    public void applicaAdvSt(ArrayList<String> advSt){}

    //applica i bonus extra
    public void applicaBonusExtra(ArrayList<String> extras){}

    //competenza nelle armi
    public void applicaCompetenzaArmi(ArrayList<String> weaponProficiency){}

    public void applicaCompetenzaArmature(ArrayList<String> armorProficiency){}

    public void applicaIncantesimiConosciuti(ArrayList<String> knownSpells){}

    public void applicaCompetenzaStrumenti(ArrayList<String> toolsProficiency){}

    public abstract void applicaBonusRazziali(HashMap<String, Integer> stat);

    //applica le lingue conosciute dalla razza
    public abstract void knownLanguages(ArrayList<String> languages);

}
