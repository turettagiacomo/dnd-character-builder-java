package razze;

import razze.sottorazze.Sottorazza;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Elf extends Razza {

    private Sottorazza sottorazzaScelta;
    //costruttore della Classe Elfo @super serve perchè è sottoclasse di Razza
    public Elf(Sottorazza sottorazzaInput){
        super("Elfo", 9, true);
        this.sottorazzaScelta = sottorazzaInput;
        sottorazzaScelta.sovrascriviValoreVelocità(this);
    }

    @Override
    public void applicaBonusRazziali(HashMap<String, Integer> stat) {
        stat.put("Destrezza",stat.get("Destrezza")+2);
        this.sottorazzaScelta.applicaBonusCaratteristiche(stat);
    }

    @Override
    public void applicaCompetenza(Map<String, Skill> mappaSkill) {
        mappaSkill.get("Percezione").setCompetenza(true);
    }
    @Override
    public void knownLanguages(ArrayList<String> languages) {
        String[] items = {"Comune", "Elfico"};
        addBonus(items, languages);
    }
    @Override
    public void applicaAdvSt(ArrayList<String> advSt) {
        advSt.add("Vantaggio nei tiri salvezza contro l'essere affascinato");
    }
    public void applicaCompetenzaArmi(ArrayList<String> weaponProficiency) {
        this.sottorazzaScelta.applicaBonusArmi(weaponProficiency);
    }
    @Override
    public void applicaBonusExtra(ArrayList<String> extras) {
        extras.add("Non hai bisogno di un riposo lungo ma di 4h");
        extras.add("Non puoi essere messo a dormire da magia");
        this.sottorazzaScelta.applicaBonusExtraSottorazza(extras);
    }
    @Override
    public void applicaIncantesimiConosciuti(ArrayList<String> knownSpells) {
        this.sottorazzaScelta.applicaIncantesimiConosciutiSottorazze(knownSpells);
    }
}