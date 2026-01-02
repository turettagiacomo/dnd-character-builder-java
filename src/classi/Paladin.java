package classi;

import java.util.ArrayList;

public class Paladin extends Classe{
    public Paladin(){
        super("Paladino", 2, "1d10", 10);
    }

    @Override
    public void applicaCompetenzaArmature(ArrayList<String> armorProficiency) {
        String[] items = {"Armature leggere", "Armature medie", "Armature pesanti", "Scudi"};
        addBonus(items,  armorProficiency);
    }

    @Override
    public void applicaCompetenzaArmi(ArrayList<String> weaponProficiency) {
        String[] items = {"Armi semplici", "Armi marziali"};
        addBonus(items, weaponProficiency);
    }

    @Override
    public void applicaCompetenzaTiriSalvezza(ArrayList<String> proficiencyST) {
        String[] items = {"Saggezza", "Carisma"};
        addBonus(items, proficiencyST);
    }

    //2skills

    @Override
    public void applicaEquipaggiamento(ArrayList<String> equipaggiamento) {
        String[] items = {"Simbolo sacro"};
        addBonus(items, equipaggiamento);
    }

    @Override
    public void applicaArmature(ArrayList<String> armature) {
        String[] items = {"Cotta di maglia"};
        addBonus(items, armature);
    }

    @Override
    public void applicaPrivilegiClasse(ArrayList<String> privilegiClasse) {
        privilegiClasse.add("Individuazione del Bene e del Male");
        privilegiClasse.add("Imposizione delle Mani (Guarigione)");
    }

    @Override
    public String getCaratteristicaIncantatore() {
        return "Carisma";
    }
}
