package classi;

import classi.sottoclassi.Sottoclasse;

import java.util.ArrayList;

public class Warlock extends Classe{
    Sottoclasse sottoclasseScelta;
    public Warlock(Sottoclasse sottoclasseInput) {
        super("Warlock", 2, "1d8", 8);
        sottoclasseScelta = sottoclasseInput;
    }

    @Override
    public void applicaCompetenzaArmature(ArrayList<String> armorProficiency) {
        String[] items = {"Armature leggere"};
        addBonus(items, armorProficiency);
    }

    @Override
    public void applicaCompetenzaArmi(ArrayList<String> weaponProficiency) {
        String[] items = {"Armi semplici"};
        addBonus(items , weaponProficiency);
    }

    @Override
    public void applicaCompetenzaTiriSalvezza(ArrayList<String> proficiencyST) {
        String[] items = {"Saggezza", "Carisma"};
        addBonus(items, proficiencyST);
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
        privilegiClasse.add("Magia del Patto (Slot recuperati a riposo breve)");
        privilegiClasse.add("Patrono Ultraterreno (Scelto al liv. 1)");
        this.sottoclasseScelta.applicaPrivilegiSottoclasse(privilegiClasse);
    }

    @Override
    public String getCaratteristicaIncantatore() {
        return "Carisma";
    }

    @Override
    public void addSpells(ArrayList<String> spells){
        this.sottoclasseScelta.addSpell(spells);
    }
}
