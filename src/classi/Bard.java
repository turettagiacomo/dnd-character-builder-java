package classi;

import java.util.ArrayList;

public class Bard extends Classe{
    public Bard(){
        super("Bardo", 2, "1d8", 8);
    }

    @Override
    public void applicaCompetenzaArmature(ArrayList<String> armorProficiency) {
        String[] items = {"Armature leggere"};
        addBonus(items, armorProficiency);
    }

    @Override
    public void applicaCompetenzaArmi(ArrayList<String> weaponProficiency) {
        String[] items = {"Armi semplici", "Balestra a mano", "Spade lunghe", "Spade corte", "Stocco"};
        addBonus(items, weaponProficiency);
    }

    //3 strunenti musicali

    @Override
    public void applicaCompetenzaTiriSalvezza(ArrayList<String> proficiencyST) {
        String[] items = {"Destrezza", "Carisma"};
        addBonus(items, proficiencyST);
    }

    //3 skill
    @Override
    public void applicaArmature(ArrayList<String> armature){
        String[] items = {"Armatura di cuoio"};
        addBonus(items, armature);
    }

    @Override
    public void applicaArmi(ArrayList<String> armi) {
        String[] items = {"Pugnale"};
        addBonus(items, armi);
    }

    @Override
    public void applicaPrivilegiClasse(ArrayList<String> privilegiClasse) {
        privilegiClasse.add("Ispirazione bardica");
        privilegiClasse.add("Incantesimi");
    }

    @Override
    public String getCaratteristicaIncantatore() {
        return "Carisma";
    }
}
