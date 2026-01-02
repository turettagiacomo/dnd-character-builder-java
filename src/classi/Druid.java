package classi;

import java.util.ArrayList;

public class Druid extends Classe{
    public Druid(){
        super("Druido", 2, "1d8", 8);
    }

    @Override
    public void applicaCompetenzaArmature(ArrayList<String> armorProficiency) {
        String[] items = {"Armature leggere", "Armature medie", "Scudi"};
        addBonus(items, armorProficiency);
    }

    @Override
    public void applicaCompetenzaArmi(ArrayList<String> weaponProficiency) {
        String[] items = {"Randelli", "Pugnali", "Dardi", "Giavellotti", "Mazze", "Bastone", "Scimitarre", "Falci", "Fionda", "Lance"};
        addBonus(items, weaponProficiency);
    }

    @Override
    public void applicaCompetenzaStrumenti(ArrayList<String> strumentiProficiency) {
        String[] items = {"Strumenti da erborista"};
        addBonus(items, strumentiProficiency);
    }

    @Override
    public void applicaCompetenzaTiriSalvezza(ArrayList<String> proficiencyST) {
        String[] items = {"Intelligenza", "Saggezza"};
        addBonus(items, proficiencyST);
    }

    //2 skills

    @Override
    public void applicaEquipaggiamento(ArrayList<String> equipaggiamento) {
        String[] items = {"Pacchetto da esploratore", "Focus druidico"};
        addBonus(items, equipaggiamento);
    }

    @Override
    public void applicaArmature(ArrayList<String> armature) {
        String[]  items = {"Armatura di cuoio"};
        addBonus(items, armature);
    }

    @Override
    public void applicaPrivilegiClasse(ArrayList<String> privilegiClasse) {
        privilegiClasse.add("Incantesimi (Saggezza)");
        privilegiClasse.add("Linguaggio Druidico");
    }

    @Override
    public String getCaratteristicaIncantatore() {
        return "Saggezza";
    }
}
