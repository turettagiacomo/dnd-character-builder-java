package classi;

import java.util.ArrayList;

public class Rogue extends Classe{
    public Rogue(){
        super("Ladro", 2, "1d8", 8);
    }

    @Override
    public void applicaCompetenzaArmature(ArrayList<String> armorProficiency) {
        String[] items = {"Armature leggere"};
        addBonus(items, armorProficiency);
    }

    @Override
    public void applicaCompetenzaArmi(ArrayList<String> weaponProficiency) {
        String[] items = {"Armi semplici", "Balestre a mano", "Spade lunghe", "Stocchi", "Spade corte"};
        addBonus(items, weaponProficiency);
    }

    @Override
    public void applicaCompetenzaStrumenti(ArrayList<String> strumentiProficiency) {
        String[] items = {"Strumenti da ladro"};
        addBonus(items, strumentiProficiency);
    }

    @Override
    public void applicaCompetenzaTiriSalvezza(ArrayList<String> proficiencyST) {
        String[] items = {"Destrezza", "Intelligenza"};
        addBonus(items, proficiencyST);
    }

    @Override
    public void applicaEquipaggiamento(ArrayList<String> equipaggiamento) {
        String[] items = {"Strumenti da ladro"};
        addBonus(items, equipaggiamento);
    }

    @Override
    public void applicaArmature(ArrayList<String> armature) {
        String[] items = {"Armatura di cuoio"};
        addBonus(items, armature);
    }

    @Override
    public void applicaArmi(ArrayList<String> armi) {
        String[] items = {"2 pugnali"};
        addBonus(items, armi);
    }

    @Override
    public void applicaPrivilegiClasse(ArrayList<String> privilegiClasse) {
        privilegiClasse.add("Maestria (Raddoppia competenza in 2 abilità)");
        privilegiClasse.add("Attacco Furtivo (1d6)");
        privilegiClasse.add("Gergo Ladresco");
    }
}
