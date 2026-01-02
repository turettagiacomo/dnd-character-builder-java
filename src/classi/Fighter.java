package classi;

import java.util.ArrayList;

public class Fighter extends Classe{
    public Fighter(){
        super("Guerriero", 2, "1d10", 10);
    }

    @Override
    public void applicaCompetenzaArmature(ArrayList<String> armorProficiency) {
        String[] items = {"Armature leggere", "Armature medie", "Armature pesanti", "Scudi"};
        addBonus(items, armorProficiency);
    }

    @Override
    public void applicaCompetenzaArmi(ArrayList<String> weaponProficiency) {
        String[] items = {"Armi semplici", "Armi marziali"};
        addBonus(items, weaponProficiency);
    }

    @Override
    public void applicaCompetenzaTiriSalvezza(ArrayList<String> proficiencyST) {
        String[] items = {"Forza", "Costituzione"};
        addBonus(items, proficiencyST);
    }

    @Override
    public void applicaPrivilegiClasse(ArrayList<String> privilegiClasse) {
        privilegiClasse.add("Stile di Combattimento (da scegliere)");
        privilegiClasse.add("Recupero delle Energie (1d10 + livello)");
    }
    // Non serve getCaratteristicaIncantatore
}
