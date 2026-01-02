package classi;

import java.util.ArrayList;

public class Monk extends Classe{
    public Monk(){
        super("Monaco", 2, "1d8", 8);
    }

    @Override
    public void applicaCompetenzaArmi(ArrayList<String> weaponProficiency) {
        String[] items = {"Armi semplici", "Spade corte"};
        addBonus(items, weaponProficiency);
    }

    @Override
    public void applicaCompetenzaTiriSalvezza(ArrayList<String> proficiencyST) {
        String[] items = {"Destrezza", "Forza"};
        addBonus(items, proficiencyST);
    }

    @Override
    public void applicaArmi(ArrayList<String> armi) {
        String[] items = {"10 dardi"};
        addBonus(items, armi);
    }

    @Override
    public void applicaPrivilegiClasse(ArrayList<String> privilegiClasse) {
        privilegiClasse.add("Difesa Senza Armatura (CA = 10 + Des + Sag)");
        privilegiClasse.add("Arti Marziali (d4, usa Des, attacco bonus)");
    }
    // Non serve getCaratteristicaIncantatore (Ki usa Saggezza ma non è spellcasting puro al liv 1)
}
