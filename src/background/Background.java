package background;

import attributes.Skill;

import java.io.Serializable;
import java.util.List;

/**
 * Represents a generic D&D 5e character background.
 * This abstract class defines the contract for applying background-specific
 * proficiencies, languages, equipment, and unique features to a PlayerCharacter.
 */
public abstract class Background implements Serializable {
    private final String name;

    public Background(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * Helper method to add multiple string elements to a target list without creating duplicates.
     * @param elements   The array of elements to be added.
     * @param targetList The list where the elements will be inserted.
     */
    public void addBonus(String[] elements, List<String> targetList) {
        for(String s : elements){
            if(!targetList.contains(s)){
                targetList.add(s);
            }
        }
    }

    public abstract void applyProficiencies(List<Skill> skillProficiencies);

    public void applyLanguages(List<String> languages){}

    public void applyToolsProficiencies(List<String> toolsProficiencies){}

    public abstract void applyEquipment(List<String> equipment);

    public abstract void applyBonuses(List<String> bonuses);

}
