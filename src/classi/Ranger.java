package classi;

import java.util.ArrayList;

public class Ranger extends Classe{
    public Ranger(){
        super("Ranger", 2, "1d10", 10);
    }

    @Override
    public void applicaCompetenzaArmature(ArrayList<String> armorProficiency) {
        String[] items = {"Armature leggere", "Armature medie", "Scudi"};
        addBonus(items, armorProficiency);
    }

    @Override
    public void applicaCompetenzaArmi(ArrayList<String> weaponProficiency) {
        String[] items = {"Armi semplici", "Armi marziali"};
        addBonus(items, weaponProficiency);
    }

    @Override
    public void applicaCompetenzaTiriSalvezza(ArrayList<String> proficiencyST) {
        String[] items = {"Forza", "Destrezza"};
        addBonus(items, proficiencyST);
    }

    //3 skills

    @Override
    public void applicaArmi(ArrayList<String> armi) {
        String[] items = {"Arco lungo", "Faretra con 20 frecce"};
        addBonus(items, armi);
    }

    @Override
    public void applicaPrivilegiClasse(ArrayList<String> privilegiClasse) {
        privilegiClasse.add("Nemico Prescelto");
        privilegiClasse.add("Esploratore Nato");
    }

    @Override
    public String getCaratteristicaIncantatore() {
        return "Saggezza"; // (Gli incantesimi arrivano al liv 2)
    }
}
