package classi;

import classi.sottoclassi.Sottoclasse;

import java.util.ArrayList;

public class Cleric extends Classe{
    Sottoclasse sottoclasseScelta;
    public Cleric(Sottoclasse sottoclasseInput){
        super("Chierico", 2, "1d8", 8);
        sottoclasseScelta = sottoclasseInput;
    }

    @Override
    public void applicaCompetenzaArmature(ArrayList<String> armorProficiency) {
        String[] items = {"Armature leggere", "Armature medie", "Scudi"};
        addBonus(items, armorProficiency);
        this.sottoclasseScelta.addArmorProficiency(armorProficiency);
    }

    @Override
    public void applicaCompetenzaArmi(ArrayList<String> weaponProficiency) {
        String[] items = {"Armi semplici"};
        addBonus(items, weaponProficiency);
        this.sottoclasseScelta.addWeaponProficiency(weaponProficiency);
    }

    @Override
    public void applicaCompetenzaTiriSalvezza(ArrayList<String> proficiencyST) {
        String[] items = {"Saggezza", "Carisma"};
        addBonus(items, proficiencyST);
    }

    @Override
    public void applicaEquipaggiamento(ArrayList<String> equipaggiamento) {
        String[] items = {"Simbolo sacro"};
        addBonus(items, equipaggiamento);
    }

    @Override
    public void applicaArmature(ArrayList<String> armature){
        String[] items = {"Scudo"};
        addBonus(items, armature);
    }

    @Override
    public void applicaPrivilegiClasse(ArrayList<String> privilegiClasse) {
        privilegiClasse.add("Incantesimi (Saggezza)");
        privilegiClasse.add("Dominio Divino (Scelto al liv. 1)");
        this.sottoclasseScelta.applicaPrivilegiSottoclasse(privilegiClasse);
    }

    @Override
    public String getCaratteristicaIncantatore() {
        return "Saggezza";
    }

    //da sottoclasse
    @Override
    public void addSpells(ArrayList<String> spells){
        this.sottoclasseScelta.addSpell(spells);
    }
}
