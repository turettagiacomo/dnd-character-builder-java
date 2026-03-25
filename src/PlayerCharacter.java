import attributes.Ability;
import attributes.Skill;
import background.Background;
import classes.CharacterClass;
import races.Race;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class PlayerCharacter implements Serializable {
    private String name;
    private Race race;
    private CharacterClass characterClass;
    private Background background;

    private String gender;
    private int age;
    private double weight;
    private int height;
    private String eyes;
    private String skin;
    private String hair;
    private String alignment;

    private int level;
    private int experiencePoints;
    private int maxHitPoints;
    private int currentHitPoints;
    private int armorClass;
    private float speed;
    private int passivePerception;
    private int initiative;
    private int proficiencyBonus;
    private String equippedArmor;
    private boolean shieldEquipped;
    private Ability spellcastingAbility;

    private Map<Ability, Integer> abilityScores;
    private List<Skill> skillProficiencies;
    private List<Skill> skillExpertises;
    private List<String> inventory;
    private List<String> weapons;
    private List<String> armors;
    private List<String> languages;
    private List<String> resistances;
    private List<String> spells;
    private List<String> weaponProficiencies;
    private List<String> armorProficiencies;
    private List<String> toolProficiencies;
    private List<Ability> savingThrowsProficiencies;
    private List<String> extraBonuses;
    private List<String> disadvantages;

    public PlayerCharacter(String name, Race race, CharacterClass characterClass, Background background) {
        this.name = name;
        this.race = race;
        this.characterClass = characterClass;
        this.background = background;

        this.gender = "";
        this.age = 0;
        this.weight = 0;
        this.height = 0;
        this.eyes = "";
        this.skin = "";
        this.hair = "";
        this.alignment = "";

        this.level = 1;
        this.experiencePoints = 0;
        this.abilityScores = new EnumMap<>(Ability.class);
        for(Ability ability : Ability.values()) {
            abilityScores.put(ability, 10);
        }
        this.passivePerception = 10;
        this.equippedArmor = "None";
        this.shieldEquipped = false;
        this.spellcastingAbility = null;

        this.skillProficiencies = new ArrayList<>();
        this.skillExpertises = new ArrayList<>();
        this.inventory = new ArrayList<>();
        this.weapons = new ArrayList<>();
        this.armors = new ArrayList<>();
        this.languages = new ArrayList<>();
        this.resistances = new ArrayList<>();
        this.spells = new ArrayList<>();
        this.weaponProficiencies = new ArrayList<>();
        this.armorProficiencies = new ArrayList<>();
        this.toolProficiencies = new ArrayList<>();
        this.savingThrowsProficiencies = new ArrayList<>();
        this.extraBonuses = new ArrayList<>();
        this.disadvantages = new ArrayList<>();
    }
    public PlayerCharacter() {
        this.level = 1;
        this.experiencePoints = 0;
        this.abilityScores = new java.util.EnumMap<>(attributes.Ability.class);
        for(attributes.Ability ability : attributes.Ability.values()) {
            abilityScores.put(ability, 10);
        }
        this.passivePerception = 10;
        this.equippedArmor = "None";
        this.shieldEquipped = false;
        this.spellcastingAbility = null;

        this.skillProficiencies = new java.util.ArrayList<>();
        this.skillExpertises = new java.util.ArrayList<>();
        this.inventory = new java.util.ArrayList<>();
        this.weapons = new java.util.ArrayList<>();
        this.armors = new java.util.ArrayList<>();
        this.languages = new java.util.ArrayList<>();
        this.resistances = new java.util.ArrayList<>();
        this.spells = new java.util.ArrayList<>();
        this.weaponProficiencies = new java.util.ArrayList<>();
        this.armorProficiencies = new java.util.ArrayList<>();
        this.toolProficiencies = new java.util.ArrayList<>();
        this.savingThrowsProficiencies = new java.util.ArrayList<>();
        this.extraBonuses = new java.util.ArrayList<>();
        this.disadvantages = new java.util.ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setRace(Race race) {
        this.race = race;
    }
    public void setCharacterClass(CharacterClass characterClass) {
        this.characterClass = characterClass;
    }
    public void setBackground(Background background) {
        this.background = background;
    }

    // --- SETTER PHYSICAL ---
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void setEyes(String eyes) {
        this.eyes = eyes;
    }
    public void setSkin(String skin) {
        this.skin = skin;
    }
    public void setHair(String hair) {
        this.hair = hair;
    }
    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    // --- ARMOR SETTER ---
    public void setEquippedArmor(String armor) {
        this.equippedArmor = armor;
    }
    public void setShieldEquipped(boolean shield) {
        this.shieldEquipped = shield;
    }

    // --- GETTERS ---
    public String getName() {
        return name;
    }
    public Race getRace() {
        return race;
    }
    public CharacterClass getCharacterClass() {
        return characterClass;
    }
    public Background getBackground() {
        return background;
    }
    public String getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }
    public double getWeight() {
        return weight;
    }
    public int getHeight() {
        return height;
    }
    public String getEyes() {
        return eyes;
    }
    public String getSkin() {
        return skin;
    }
    public String getHair() {
        return hair;
    }
    public String getAlignment() {
        return alignment;
    }
    public int getLevel() {
        return level;
    }
    public int getExperiencePoints() {
        return experiencePoints;
    }
    public int getMaxHitPoints() {
        return maxHitPoints;
    }
    public int getCurrentHitPoints() {
        return currentHitPoints;
    }
    public int getArmorClass() {
        return armorClass;
    }
    public float getSpeed() {
        return speed;
    }
    public int getPassivePerception() {
        return passivePerception;
    }
    public int getInitiative() {
        return initiative;
    }
    public int getProficiencyBonus() {
        return proficiencyBonus;
    }
    public String getEquippedArmor() {
        return equippedArmor;
    }
    public boolean isShieldEquipped() {
        return shieldEquipped;
    }
    public Ability getSpellcastingAbility() {
        return spellcastingAbility;
    }
    public Map<Ability, Integer> getAbilityScores() {
        return abilityScores;
    }
    public List<Skill> getSkillProficiencies() {
        return skillProficiencies;
    }
    public List<Skill> getSkillExpertises() {
        return skillExpertises;
    }
    public List<String> getInventory() {
        return inventory;
    }
    public List<String> getWeapons() {
        return weapons;
    }
    public List<String> getArmors() {
        return armors;
    }
    public List<String> getLanguages() {
        return languages;
    }
    public List<String> getResistances() {
        return resistances;
    }
    public List<String> getSpells() {
        return spells;
    }
    public List<String> getWeaponProficiencies(){
        return weaponProficiencies;
    }
    public List<String> getArmorProficiencies(){
        return armorProficiencies;
    }
    public List<String> getToolProficiencies(){
        return toolProficiencies;
    }
    public List<Ability> getSavingThrowsProficiencies() {
        return savingThrowsProficiencies;
    }
    public List<String> getExtraBonuses() {
        return extraBonuses;
    }
    public List<String> getDisadvantages() {
        return disadvantages;
    }


    // --- ADDERS FOR USER BASED CHOICES ---
    public void addAbilityScorePoint(Ability ability) {
        this.abilityScores.put(ability, this.abilityScores.get(ability) + 1);
    }
    public void setAbilityScore(Ability ability, int score) {
        this.abilityScores.put(ability, score);
    }

    /**
     * Adds a skill proficiency to the character.
     * * @param skill The skill to become proficient in.
     * @return True if the proficiency was successfully added, false if the character was already proficient.
     */
    public boolean addSkillProficiency(Skill skill) {
        if (!this.skillProficiencies.contains(skill)) {
            this.skillProficiencies.add(skill);
            return true;
        }
        return false;
    }

    /**
     * Adds a skill expertise (double proficiency) to the character.
     * @param skill The skill to gain expertise in.
     * @return True if the expertise was successfully added, false if the character already had it.
     */
    public boolean addSkillExpertise(Skill skill) {
        if (!this.skillProficiencies.contains(skill)) {
            this.skillProficiencies.add(skill);
        }
        if (!this.skillExpertises.contains(skill)) {
            this.skillExpertises.add(skill);
            return true;
        }
        return false;
    }

    /**
     * Adds a spoken language to the character's known languages.
     * @param language The name of the language to add.
     * @return True if the language was successfully added, false if the character already knew it.
     */
    public boolean addLanguage(String language) {
        if (!this.languages.contains(language)) {
            this.languages.add(language);
            return true;
        }
        return false;
    }

    /**
     * Adds a tool proficiency to the character.
     * @param tool The name of the tool (e.g., a gaming set, musical instrument, or artisan's tool).
     * @return True if the proficiency was successfully added, false if the character was already proficient.
     */
    public boolean addToolProficiency(String tool) {
        if (!this.toolProficiencies.contains(tool)) {
            this.toolProficiencies.add(tool);
            return true;
        }
        return false;
    }

    /**
     * Adds a spell or cantrip to the character's list of known spells.
     * @param spell The name of the spell to add.
     * @return True if the spell was successfully added, false if the character already knew it.
     */
    public boolean addSpell(String spell) {
        if (!this.spells.contains(spell)) {
            this.spells.add(spell);
            return true;
        }
        return false;
    }
    public void addEquipment(String item) {
        this.inventory.add(item);
    }
    public void addWeapon(String weapon) {
        this.weapons.add(weapon);
    }
    public void addArmor(String armor) {
        this.armors.add(armor);
    }


    // --- MATH ENGINE ---
    public void calculateInitiative() {
        this.initiative = getAbilityModifier(Ability.DEXTERITY);
    }

    /**
     * Calculates the Passive Perception score (10 + Wisdom modifier).
     * Automatically accounts for proficiency or expertise in the Perception skill.
     */
    public void calculatePassivePerception() {
        this.passivePerception = 10 + getAbilityModifier(Ability.WISDOM);
        if (this.skillProficiencies.contains(Skill.PERCEPTION)) {
            this.passivePerception += this.characterClass.getProficiencyBonus();
        }
        if (this.skillExpertises.contains(Skill.PERCEPTION)) {
            this.passivePerception += this.characterClass.getProficiencyBonus();
        }
    }

    /**
     * Calculates the final Armor Class (AC) according to D&D 5e rules.
     * This calculation factors in the equipped armor type, shield usage, Dexterity modifier caps
     * for medium/heavy armors, and class-specific features (e.g., Unarmored Defense).
     * It also assigns stealth or spellcasting disadvantages if the character lacks the proper armor proficiency.
     */
    public void calculateArmorClass(){
        int dexMod = getAbilityModifier(Ability.DEXTERITY);
        this.armorClass = 10 + dexMod;
        this.speed = this.race.getBaseSpeed();

        if(!this.equippedArmor.equals("None")){
            //light armors
            switch (equippedArmor) {
                case "Padded" -> {
                    armorClass = 11 + dexMod;
                    disadvantages.add("Disadvantage in stealth check");
                }
                case "Leather" -> armorClass = 11 + dexMod;
                case "Studded leather" -> armorClass = 12 + dexMod;

                //medium armors
                case "Hide" -> {
                    if (dexMod <= 2) {
                        armorClass = 12 + dexMod;
                    } else {
                        armorClass = 14;
                    }
                }
                case "Chain shirt" -> {
                    if (dexMod <= 2) {
                        armorClass = 13 + dexMod;
                    } else {
                        armorClass = 15;
                    }
                }
                case "Scale mail" -> {
                    disadvantages.add("Disadvantage in stealth check");
                    if (dexMod <= 2) {
                        armorClass = 14 + dexMod;
                    } else {
                        armorClass = 16;
                    }
                }
                case "Breastplate" -> {
                    if (dexMod <= 2) {
                        armorClass = 14 + dexMod;
                    } else {
                        armorClass = 16;
                    }
                }
                case "Half plate" -> {
                    disadvantages.add("Disadvantage in stealth check");
                    if (dexMod <= 2) {
                        armorClass = 15 + dexMod;
                    } else {
                        armorClass = 17;
                    }
                }
                //heavy armors
                case "Ring mail" -> {
                    disadvantages.add("Disadvantage in stealth check");
                    armorClass = 14;
                }
                case "Chain mail" -> {
                    disadvantages.add("Disadvantage in stealth check");
                    armorClass = 16;
                    if (abilityScores.get(Ability.STRENGTH) < 13) {
                        speed -= 3;
                    }
                }
                case "Splint" -> {
                    disadvantages.add("Disadvantage in stealth check");
                    armorClass = 17;
                    if (abilityScores.get(Ability.STRENGTH) < 15) {
                        speed -= 3;
                    }
                }
                case "Plate" -> {
                    disadvantages.add("Disadvantage in stealth check");
                    armorClass = 18;
                    if (abilityScores.get(Ability.STRENGTH) < 15) {
                        speed -= 3;
                    }
                }
            }

            if((equippedArmor.equals("Padded") || equippedArmor.equals("Leather") ||  equippedArmor.equals("Studded leather")) && !armorProficiencies.contains("Light armor")) {
                disadvantages.add("Disadvantage on any ability check, saving throw, or attack roll that involves Strength or Dexterity, and you can't cast spells");
            }
            else if((equippedArmor.equals("Hide") || equippedArmor.equals("Chain shirt") || equippedArmor.equals("Scale mail") || equippedArmor.equals("Breastplate") || equippedArmor.equals("Half plate")) && !armorProficiencies.contains("Medium armor") ) {
                disadvantages.add("Disadvantage on any ability check, saving throw, or attack roll that involves Strength or Dexterity, and you can't cast spells");
            }
            else if((equippedArmor.equals("Ring mail") || equippedArmor.equals("Chain mail") || equippedArmor.equals("Splint") || equippedArmor.equals("Plate")) && !armorProficiencies.contains("Heavy armor")){
                disadvantages.add("Disadvantage on any ability check, saving throw, or attack roll that involves Strength or Dexterity, and you can't cast spells");
            }
        }
        else{
            if(characterClass.getName().equals("Barbarian")){
                armorClass += getAbilityModifier(Ability.CONSTITUTION);
            }
            else if(characterClass.getName().equals("Monk")) {
                if (!shieldEquipped) {
                    armorClass += getAbilityModifier(Ability.WISDOM);
                }
            }
            else if(extraBonuses.contains("Draconic resilience")){
                armorClass = 13 + dexMod;
            }
        }
        if(shieldEquipped){
            armorClass += 2;
        }
    }

    /**
     * Calculates the maximum Hit Points at level 1, combining the base hit points
     * provided by the character's class with their Constitution modifier and any extra racial bonuses.
     */
    public void calculateHitPoints() {
        this.maxHitPoints = this.characterClass.getHitPoints() + getAbilityModifier(Ability.CONSTITUTION);
        if (this.extraBonuses.contains("Dwarven toughness") || this.extraBonuses.contains("Draconic resilience")) {
            this.maxHitPoints += 1;
        }
        this.currentHitPoints = this.maxHitPoints;
    }

    public int getAbilityModifier(Ability ability) {
        int score = this.abilityScores.get(ability);
        return Math.floorDiv(score - 10, 2);
    }

    /**
     * Aggregates and applies all features, proficiencies, and modifiers derived from
     * the character's chosen Race, Class, and Background.
     * This method must be called before calculating final combat stats.
     */
    public void applyAllBonuses() {
        // --- RACE ---
        this.race.applyResistances(this.resistances);
        this.race.applyAdvantageSavingThrows(this.extraBonuses);
        this.race.applyProficiencies(this.skillProficiencies);
        this.race.applyWeaponProficiencies(this.weaponProficiencies);
        this.race.applyArmorProficiencies(this.armorProficiencies);
        this.race.applyToolsProficiencies(this.toolProficiencies);
        this.race.applyKnownSpells(this.spells);
        this.race.applyKnownLanguages(this.languages);
        this.race.applyRacialBonuses(this.abilityScores);
        this.race.applyExtraBonuses(this.extraBonuses);

        // --- CHARACTER CLASS ---
        this.characterClass.applyEquipment(this.inventory);
        this.characterClass.applyArmor(this.armors);
        this.characterClass.applyWeapons(this.weapons);
        this.characterClass.applyClassBonuses(this.extraBonuses);
        this.spellcastingAbility = this.characterClass.getSpellcastingAbility();
        this.characterClass.applyResistances(this.resistances);
        this.characterClass.applyProficiencySavingThrows(this.savingThrowsProficiencies);
        this.characterClass.applyProficiencies(this.skillProficiencies);
        this.characterClass.applyWeaponProficiencies(this.weaponProficiencies);
        this.characterClass.applyArmorProficiencies(this.armorProficiencies);
        this.characterClass.applyToolsProficiencies(this.toolProficiencies);
        this.characterClass.applyKnownSpells(this.spells);
        this.characterClass.applyKnownLanguages(this.languages);

        // --- BACKGROUND ---
        this.background.applyProficiencies(this.skillProficiencies);
        this.background.applyLanguages(this.languages);
        this.background.applyToolsProficiencies(this.toolProficiencies);
        this.background.applyEquipment(this.inventory);
        this.background.applyBonuses(this.extraBonuses);
    }
    public void calculateFinalStats() {
        this.proficiencyBonus = this.characterClass.getProficiencyBonus();
        calculateHitPoints();
        calculateInitiative();
        calculatePassivePerception();
        calculateArmorClass();
    }

    // --- SAVE & LOAD ---
    /**
     * Deserializes and loads an existing PlayerCharacter from a file.
     * @param fileName The path or name of the .dat file containing the character data.
     * @return The loaded PlayerCharacter object, or null if the operation fails.
     */
    public static PlayerCharacter loadCharacter(String fileName) {
        PlayerCharacter p = null;
        try (java.io.ObjectInputStream in = new java.io.ObjectInputStream(new java.io.FileInputStream(fileName))) {
            p = (PlayerCharacter) in.readObject();
            System.out.println("Character loaded successfully!");
        }
        catch (java.io.IOException | ClassNotFoundException e) {
            System.out.println("Error during loading: " + e.getMessage());
        }
        return p;
    }

    /**
     * Serializes and saves the current PlayerCharacter object to a file.
     * @param fileName The path or name of the destination .dat file.
     */
    public void saveCharacter(String fileName) {
        try (java.io.ObjectOutputStream out = new java.io.ObjectOutputStream(new java.io.FileOutputStream(fileName))) {
            out.writeObject(this);
            System.out.println("Save completed in: " + fileName);
        } catch (java.io.IOException e) {
            System.out.println("Error during saving: " + e.getMessage());
            e.printStackTrace();
        }
    }
}