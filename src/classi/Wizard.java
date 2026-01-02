package classi;

import java.util.ArrayList;

public class Wizard extends Classe{
    public Wizard(){
        super("Mago", 2, "1d6", 6);
    }

    @Override
    public void applicaCompetenzaArmi(ArrayList<String> weaponProficiency) {
        String[] items = {"Pugnali", "Dardi", "Fionde", "Bastoni", "Balestre a mano"};
        addBonus(items, weaponProficiency);
    }

    @Override
    public void applicaCompetenzaTiriSalvezza(ArrayList<String> proficiencyST) {
        String[] items = {"Intelligenza", "Saggezza"};
        addBonus(items, proficiencyST);
    }

    //2 skills

    @Override
    public void applicaEquipaggiamento(ArrayList<String> equipaggiamento) {
        String[]  items = {"Libro degli incantesimi"};
        addBonus(items, equipaggiamento);
    }

    @Override
    public void applicaPrivilegiClasse(ArrayList<String> privilegiClasse) {
        privilegiClasse.add("Incantesimi (Intelligenza)");
        privilegiClasse.add("Recupero Arcano (Recupera slot a riposo breve)");
    }

    @Override
    public String getCaratteristicaIncantatore() {
        return "Intelligenza";
    }
}
