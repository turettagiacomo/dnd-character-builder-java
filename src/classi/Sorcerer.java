package classi;

import classi.sottoclassi.Sottoclasse;

import java.util.ArrayList;

public class Sorcerer extends Classe{
    private Sottoclasse sottoclasseScelta;
    public Sorcerer(Sottoclasse sottoclasseInput){
        super("Stregone", 2, "1d6", 6);
        this.sottoclasseScelta = sottoclasseInput;
    }

    @Override
    public void applicaCompetenzaArmi(ArrayList<String> weaponProficiency) {
        String[] items = {"Pugnali", "Dardi", "Fionde", "Bastoni", "Balestre leggere"};
        addBonus(items, weaponProficiency);
    }

    @Override
    public void applicaCompetenzaTiriSalvezza(ArrayList<String> proficiencyST) {
        String[] items = {"Carisma", "Costituzione"};
        addBonus(items, proficiencyST);
    }

    //2 skills

    @Override
    public void applicaArmi(ArrayList<String> armi) {
        String[] items = {"2 pugnali"};
        addBonus(items, armi);
    }

    @Override
    public void applicaPrivilegiClasse(ArrayList<String> privilegiClasse) {
        privilegiClasse.add("Incantesimi (Carisma)");
        this.sottoclasseScelta.applicaPrivilegiSottoclasse(privilegiClasse);
    }

    @Override
    public String getCaratteristicaIncantatore() {
        return "Carisma";
    }

    @Override
    public void addResistance(ArrayList<String> resistance){
        this.sottoclasseScelta.addResistance(resistance);
    }
}