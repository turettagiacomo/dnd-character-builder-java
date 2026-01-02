package razze.sottorazze;

import razze.Razza;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class Sottorazza implements Serializable {
    private String nome;

    public Sottorazza(String nome){
        this.nome = nome;
    }

    public String getNomeSottorazza() {
        return nome;
    }

    public void addBonus(String[] elementi, ArrayList<String> bonusType) {
        for(String s : elementi){
            if(!bonusType.contains(s)){
                bonusType.add(s);
            }
        }
    }

    public void sovrascriviValoreVelocità(Razza razza) {}

    public abstract void applicaBonusCaratteristiche(HashMap<String, Integer> stat);

    public void applicaBonusArmature(ArrayList<String> armorProficiency){}

    public void applicaBonusArmi(ArrayList<String> weapomProficiency){}

    public void applicaIncantesimiConosciutiSottorazze(ArrayList<String> knownSpells){}

    public void applicaBonusExtraSottorazza(ArrayList<String> extra){}

    public void applicaAdvStSottorazza(ArrayList<String> advSt){}

    public void applicaResistenzeSottorazze(ArrayList<String> resistance){}

    public void applicaCompetenzaStrumentiSottorazza(ArrayList<String> competenzaStrumenti){}
}
