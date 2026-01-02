package classi;

import java.util.ArrayList;

public class Barbarian extends Classe{
    public Barbarian(){
        super("Barbaro", 2, "1d12", 12);
    }

    @Override
    public void applicaCompetenzaArmature(ArrayList<String> armorProficiency) {
        String[] items = {"Armature leggere", "Armature medie", "Scudi"};
        addBonus(items, armorProficiency);
    }

    @Override
    public void applicaCompetenzaArmi(ArrayList<String> weaponProficiency) {
        String[]  items = {"Armi semplici", "Armi marziali"};
        addBonus(items, weaponProficiency);
    }

    @Override
    public void applicaCompetenzaTiriSalvezza(ArrayList<String> proficiencyST) {
        String[] items = {"Forza", "Costituzione"};
        addBonus(items, proficiencyST);
    }

    @Override
    public void applicaEquipaggiamento(ArrayList<String> equipaggiamento){
        String[] items = {"Pacchetto da esploratore"};
        addBonus(items, equipaggiamento);
    }

    @Override
    public void applicaArmi(ArrayList<String> armi) {
        String[] items = {"4 giavellotti"};
        addBonus(items, armi);
    }

    @Override
    public void applicaPrivilegiClasse(ArrayList<String> privilegiClasse){
        privilegiClasse.add("Rage: ");
        privilegiClasse.add("Difesa disarmata: ");
    }
}
