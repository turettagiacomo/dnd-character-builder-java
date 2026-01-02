package razze;

import razze.sottorazze.Sottorazza;

import java.util.ArrayList;
import java.util.HashMap;

public class Halfling extends Razza {

    private Sottorazza sottorazzaScelta;
    //costruttore della Classe Halfling @super serve perchè è sottoclasse di Razza
    public Halfling(Sottorazza sottorazzaInput){
        super("Halfling", 7.5F, false);
        this.sottorazzaScelta = sottorazzaInput;
    }
    @Override
    public void applicaBonusRazziali(HashMap<String, Integer> stat) {
        stat.put("Destrezza",stat.get("Destrezza")+2);
        this.sottorazzaScelta.applicaBonusCaratteristiche(stat);
    }
    @Override
    public void knownLanguages(ArrayList<String> languages) {
        String[] items = {"Comune", "Halfling"};
        addBonus(items, languages);
    }
    @Override
    public void applicaAdvSt(ArrayList<String> advSt) {
        advSt.add("Vantaggio nei tiri salvezza contro l'essere spaventato");
        this.sottorazzaScelta.applicaAdvStSottorazza(advSt);
    }
    @Override
    public void applicaBonusExtra(ArrayList<String> extras) {
        extras.add("Se il risultato di un d20 per colpire, prova abilità o tiro salvezza è 1 puoi rilanciare");
        extras.add("Puoi muoverti attraverso gli spazi di qualsiasi creatura più grande");
        this.sottorazzaScelta.applicaBonusExtraSottorazza(extras);
    }
    @Override
    public void applicaResistenze(ArrayList<String> resistance) {
        this.sottorazzaScelta.applicaResistenzeSottorazze(resistance);
    }
}