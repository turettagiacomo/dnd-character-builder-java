public class MenuPrinter {

    public static final String[] RACES = {
            "Dragonborn", "Elf", "Gnome", "Half-Elf", "Halfling",
            "Half-Orc", "Human", "Dwarf", "Tiefling"
    };

    public static final String[] ELF_SUBRACES = {"High Elf", "Wood Elf", "Dark Elf"};
    public static final String[] GNOME_SUBRACES = {"Forest Gnome", "Rock Gnome"};
    public static final String[] HALFLING_SUBRACES = {"Lightfoot", "Stout"};
    public static final String[] DWARF_SUBRACES = {"Hill Dwarf", "Mountain Dwarf"};

    public static final String[] CLASSES = {
            "Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk",
            "Paladin", "Ranger", "Rogue", "Sorcerer", "Warlock", "Wizard"
    };

    public static final String[] CLERIC_SUBCLASSES = {
            "Knowledge Domain", "Life Domain", "Light Domain", "Nature Domain",
            "Tempest Domain", "Trickery Domain", "War Domain"
    };
    public static final String[] SORCERER_SUBCLASSES = {"Draconic Bloodline", "Wild Magic"};
    public static final String[] WARLOCK_SUBCLASSES = {"The Archfey", "The Fiend", "The Great Old One"};

    // --- SPELLS ---
    public static final String[] BARD_CANTRIPS  = {
            "Friends", "Vicious Mockery", "True Strike",
            "Minor Illusion", "Light", "Dancing Lights",
            "Mage Hand", "Message", "Prestidigitation", "Mending", "Blade Ward"
    };
    public static final String[] BARD_SPELLS_LVL1 = {
            "Animal Friendship", "Bane", "Charm Person", "Comprehend Languages",
            "Cure Wounds", "Detect Magic", "Disguise self", "Dissonant Whispers",
            "Faerie Fire", "Feather Fall", "Healing Word", "Heroism",
            "Identify", "Illusory Script", "Longstrider", "Silent Image", "Sleep",
            "Speak with Animals", "Tasha's Hideous Laughter", "Thunderwave", "Unseen Servant"

    };

    public static final String[] CLERIC_CANTRIPS = {
            "Guidance", "Light", "Mending", "Resistance", "Sacred Flame",
            "Spare the Dying", "Thaumaturgy"
    };
    public static final String[] CLERIC_SPELLS_LVL1 = {
            "Bane", "Bless", "Command", "Create and Destroy Water",
            "Cure Wounds", "Detect Evil and Good", "Detect Magic",
            "Detect Poison and Disease", "Guiding Bolt", "Healing Word",
            "Inflict Wounds", "Protection from Evil and Good", "Purify Food and Drink",
            "Sanctuary", "Shield of Faith"
    };

    public static final String[] DRUID_CANTRIPS = {
            "Druidcraft", "Guidance", "Mending", "Poison Spray", "Produce Flame",
            "Resistance", "Shillelagh", "Thorn Whip"
    };
    public static final String[] DRUID_SPELLS_LVL1 = {
            "Animal Friendship", "Charm Person", "Create and Destroy Water",
            "Cure Wounds", "Detect Magic", "Detect Poison and Disease",
            "Entangle", "Faerie Fire", "Fog Cloud", "Goodberry","Healing Word", "Jump",
            "Longstrider", "Purify Food and Drink", "Speak with Animals","Thunderwave"
    };

    public static final String[] SORCERER_CANTRIPS = {
            "Acid Splash", "Blade Ward", "Chill Touch", "Dancing Lights",
            "Fire Bolt", "Friends", "Light", "Mage Hand", "Mending", "Message",
            "Minor Illusion", "Poison Spray", "Prestidigitation", "Ray of Frost",
            "Shocking Grasp", "True Strike"
    };
    public static final String[] SORCERER_SPELLS_LVL1 = {
            "Burning Hands", "Charm Person", "Chromatic Orb", "Color Spray",
            "Comprehend Languages", "Detect Magic", "Disguise Self", "Expeditious Retreat",
            "False Life", "Feather Fall", "Fog Cloud", "Jump", "Mage Armor", "Magic Missile",
            "Ray of Sickness", "Shield", "Silent Image", "Sleep", "Thunderwave", "Witch Bolt"
    };

    public static final String[] WARLOCK_CANTRIPS = {
            "Blade Ward", "Chill Touch", "Eldrich Blast", "Friends", "Mage Hand",
            "Minor Illusion", "Poison Spray", "Prestidigitation", "True Strike"
    };
    public static final String[] WARLOCK_SPELLS_LVL1 = {
            "Armor of Agathys", "Arms of Hadar", "Charm Person", "Comprehend Languages",
            "Expeditious Retreat", "Hellish Rebuke", "Hex", "Illusory Script", "Protection from Evil and Good",
            "Unseen Servant", "Witch Bolt"
    };

    public static final String[] WIZARD_CANTRIPS = {
            "Acid Splash", "Blade Ward", "Chill Touch", "Dancing Lights", "Fire Bolt",
            "Friends", "Light", "Mage Hand", "Mending", "Message", "Minor Illusion", "Poison Spray",
            "Prestidigitation" ,"Ray of Frost", "Shocking Grasp", "True Strike"
    };
    public static final String[] WIZARD_SPELLS_LVL1 = {
            "Alarm", "Burning Hands", "Charm Person", "Chromatic Orb", "Color Spray",
            "Comprehend Languages", "Disguise Self", "False Life", "Feather Fall", "Find Familiar",
            "Fog Cloud", "Grease", "Identify", "Illusory Script", "Jump", "Longstrider",
            "Mage Armor", "Magic Missile", "Protection from Evil and Good", "Ray of Sickness",
            "Shield", "Silent Image", "Sleep", "Tasha's Hideous Laughter", "Tenser's Floating Disk",
            "Thunderwave", "Unseen Servant", "Witch Bolt"
    };

    public static final String[] LANGUAGES = {
            "Common", "Dwarvish", "Elvish", "Giant", "Gnomish",
            "Goblin", "Halfling", "Orc", "Abyssal", "Celestial",
            "Draconic", "Deep Speech", "Infernal", "Primordial",
            "Sylvan", "Undercommon"
    };

    public static final String[] BACKGROUNDS = {
            "Acolyte", "Charlatan", "Criminal", "Entertainer",
            "Folk Hero", "Guild Artisan", "Hermit", "Noble",
            "Outlander", "Sage", "Sailor", "Soldier", "Urchin"
    };

    public static final String[] ABILITY_SCORES = {
            "Strength", "Dexterity", "Constitution",
            "Intelligence", "Wisdom", "Charisma"
    };

    public static final String[] SKILLS = {
            "Acrobatics", "Animal Handling", "Arcana", "Athletics",
            "Deception", "History", "Insight", "Intimidation",
            "Investigation", "Medicine", "Nature", "Perception",
            "Performance", "Persuasion", "Religion", "Sleight of Hand",
            "Stealth", "Survival"
    };
    public static final String[] SIMPLE_MELEE_WEAPONS = {
            "Club", "Dagger", "Greatclub", "Handaxe", "Javelin",
            "Light hammer", "Mace", "Quarterstaff", "Sickle",
            "Spear"
    };
    public static final String[] SIMPLE_RANGED_WEAPONS = {
            "Crossbow, light", "Dart", "Shortbow", "Sling"
    };
    public static final String[] MARTIAL_MELEE_WEAPONS = {
            "Battleaxe", "Flail", "Glaive", "Greataxe", "Greatsword",
            "Halberd", "Lance", "Longsword", "Maul", "Morningstar",
            "Pike", "Rapier", "Scimitar", "Shortsword", "Trident",
            "War pick", "Warhammer", "Whip"
    };
    public static final String[] MARTIAL_RANGED_WEAPONS = {
            "Blowgun", "Crossbow", "Crossbow", "Longbow", "Net"
    };
    public static final String[] ARTISAN_TOOLS = {
            "Alchemist's supplies", "Brewer's supplies", "Calligrapher's Supplies",
            "Carpenter's tools", "Cartographer's tools", "Cobbler's tools", "Cook's utensils",
            "Glassblower's tools", "Jeweler's tools", "Leatherworker's tools",
            "Mason's tools", "Painter's supplies", "Potter's tools",
            "Smith's tools", "Tinker's tools", "Weaver's tools", "Woodcarver's tools"
    };
    public static final String[] ARCANE_FOCUSES = {
            "Crystal", "Orb", "Road", "Staff", "Wand"
    };
    public static final String[] DRUIDIC_FOCUSES = {
            "Spring of mistletoe", "Totem", "Wooden staff", "Yew wand"
    };
    public static final String[] HOLY_SYMBOLS = {
            "Amulet", "Emblem", "Reliquary"
    };
    public static final String[] GAMING_SETS = {
            "Dice set", "Dragonchess set", "Playing card set", "Three-Dragon Ante set"
    };
    public static final String[] MUSICAL_INSTRUMENTS = {
            "Bagpipes", "Drum", "Dulcimer", "Flute", "Lute",
            "Lyre", "Horn", "Pan flute", "Shawm", "Viol"
    };
    public static final String[] CON_TOOLS = {
            "Ten stoppered bottles", "A set of weighted dice",
            "A deck of marked cards", "A signet ring of an imaginary duke"
    };
    public static final String[] ALIGNMENTS = {
            "Lawful Good", "Neutral Good", "Chaotic Good",
            "Lawful Neutral", "True Neutral", "Chaotic Neutral",
            "Lawful Evil", "Neutral Evil", "Chaotic Evil"
    };

    // --- PRINT METHODS ---
    public static void printRacesList() { printInColumns(RACES); }
    public static void printElfSubraces() { printInColumns(ELF_SUBRACES); }
    public static void printGnomeSubraces() { printInColumns(GNOME_SUBRACES); }
    public static void printHalflingSubraces() { printInColumns(HALFLING_SUBRACES); }
    public static void printDwarfSubraces() { printInColumns(DWARF_SUBRACES); }
    public static void printClassesList() { printInColumns(CLASSES); }
    public static void printClericSubclasses() { printInColumns(CLERIC_SUBCLASSES); }
    public static void printSorcererSubclasses() { printInColumns(SORCERER_SUBCLASSES); }
    public static void printWarlockSubclasses() { printInColumns(WARLOCK_SUBCLASSES); }
    public static void printLanguagesList() { printInColumns(LANGUAGES); }
    public static void printMusicalInstrumentsList() {
        printInColumns(MUSICAL_INSTRUMENTS);
    }
    public static void printArtisanToolsList() {
        printInColumns(ARTISAN_TOOLS);
    }
    public static void printConToolsList() {
        printInColumns(CON_TOOLS);
    }
    public static void printBackgroundsList() { printInColumns(BACKGROUNDS); }
    public static void printDraconicAncestries() {
        String format = "%-15s %-15s %s%n";
        System.out.printf(format, "COLOR", "DAMAGE TYPE", "BREATH WEAPON");
        System.out.println("-----------------------------------------------------");
        System.out.printf(format, "Black", "Acid", "5 by 30 ft. line");
        System.out.printf(format, "Blue", "Lightning", "5 by 30 ft. line");
        System.out.printf(format, "Brass", "Fire", "5 by 30 ft. line");
        System.out.printf(format, "Bronze", "Lightning", "5 by 30 ft. line");
        System.out.printf(format, "Copper", "Fire", "5 by 30 ft. line");
        System.out.printf(format, "Gold", "Acid", "15 ft. cone");
        System.out.printf(format, "Green", "Poison", "15 ft. cone");
        System.out.printf(format, "Red", "Fire", "15 ft. cone");
        System.out.printf(format, "Silver", "Cold", "15 ft. cone");
        System.out.printf(format, "White", "Cold", "15 ft. cone");
    }

    // --- WEAPONS ---
    private static void printWeaponHeader(String title) {
        final int tableWidth = 71;
        int padding = (tableWidth - title.length()) / 2;
        System.out.println("\n" + " ".repeat(padding) + title.toUpperCase());
        String format = "%-20s %-18s %s%n";
        System.out.printf(format, "NAME", "DAMAGE", "PROPERTIES");
        System.out.println("-----------------------------------------------------------------------");
    }
    public static void printSimpleMeleeWeapons() {
        printWeaponHeader("Simple Melee Weapons");
        String format = "%-20s %-18s %s%n";
        System.out.printf(format, "Club", "1d4 bludgeoning", "Light");
        System.out.printf(format, "Dagger", "1d4 piercing", "Finesse, light, thrown (20/60)");
        System.out.printf(format, "Greatclub", "1d8 bludgeoning", "Two-handed");
        System.out.printf(format, "Handaxe", "1d6 slashing", "Light, thrown (20/60)");
        System.out.printf(format, "Javelin", "1d6 piercing", "Thrown (30/120)");
        System.out.printf(format, "Light hammer", "1d4 bludgeoning", "Light, thrown (20/60)");
        System.out.printf(format, "Mace", "1d6 bludgeoning", "-");
        System.out.printf(format, "Quarterstaff", "1d6 bludgeoning", "Versatile (1d8)");
        System.out.printf(format, "Sickle", "1d4 slashing", "Light");
        System.out.printf(format, "Spear", "1d6 piercing", "Thrown (20/60), versatile (1d8)");
    }
    public static void printSimpleRangedWeapons() {
        printWeaponHeader("Simple Ranged Weapons");
        String format = "%-20s %-18s %s%n";
        System.out.printf(format, "Crossbow, light", "1d8 piercing", "Ammo (80/320), loading, two-handed");
        System.out.printf(format, "Dart", "1d4 piercing", "Finesse, thrown (20/60)");
        System.out.printf(format, "Shortbow", "1d6 piercing", "Ammo (80/320), two-handed");
        System.out.printf(format, "Sling", "1d4 bludgeoning", "Ammo (30/120)");
    }
    public static void printMartialMeleeWeapons() {
        printWeaponHeader("Martial Melee Weapons");
        String format = "%-20s %-18s %s%n";
        System.out.printf(format, "Battleaxe", "1d8 slashing", "Versatile (1d10)");
        System.out.printf(format, "Flail", "1d8 bludgeoning", "-");
        System.out.printf(format, "Glaive", "1d10 slashing", "Heavy, reach, two-handed");
        System.out.printf(format, "Greataxe", "1d12 slashing", "Heavy, two-handed");
        System.out.printf(format, "Greatsword", "2d6 slashing", "Heavy, two-handed");
        System.out.printf(format, "Halberd", "1d10 slashing", "Heavy, reach, two-handed");
        System.out.printf(format, "Lance", "1d12 piercing", "Reach, special");
        System.out.printf(format, "Longsword", "1d8 slashing", "Versatile (1d10)");
        System.out.printf(format, "Maul", "2d6 bludgeoning", "Heavy, two-handed");
        System.out.printf(format, "Morningstar", "1d8 piercing", "-");
        System.out.printf(format, "Pike", "1d10 piercing", "Heavy, reach, two-handed");
        System.out.printf(format, "Rapier", "1d8 piercing", "Finesse");
        System.out.printf(format, "Scimitar", "1d6 slashing", "Finesse, light");
        System.out.printf(format, "Shortsword", "1d6 piercing", "Finesse, light");
        System.out.printf(format, "Trident", "1d6 piercing", "Thrown (20/60), versatile (1d8)");
        System.out.printf(format, "War pick", "1d8 piercing", "-");
        System.out.printf(format, "Warhammer", "1d8 bludgeoning", "Versatile (1d10)");
        System.out.printf(format, "Whip", "1d4 slashing", "Finesse, reach");
    }
    public static void printMartialRangedWeapons() {
        printWeaponHeader("Martial Ranged Weapons");
        String format = "%-20s %-18s %s%n";
        System.out.printf(format, "Blowgun", "1 piercing", "Ammo (25/100), loading");
        System.out.printf(format, "Crossbow, hand", "1d6 piercing", "Ammo (30/120), light, loading");
        System.out.printf(format, "Crossbow, heavy", "1d10 piercing", "Ammo (100/400), heavy, loading, 2H");
        System.out.printf(format, "Longbow", "1d8 piercing", "Ammo (150/600), heavy, two-handed");
        System.out.printf(format, "Net", "-", "Special, thrown (5/15)");
    }

    // --- ARMORS ---
    private static void printArmorHeader() {
        System.out.printf("%-25s %-20s %s%n", "NAME", "ARMOR CLASS (AC)", "STEALTH");
        System.out.println("-----------------------------------------------------------------------");
    }
    public static void printLightArmors() {
        System.out.println("\n--- Light Armors ---");
        printArmorHeader();
        String format = "%-25s %-20s %s%n";
        System.out.printf(format, "Padded", "11 + Dex", "Disadvantage");
        System.out.printf(format, "Leather", "11 + Dex", "-");
        System.out.printf(format, "Studded leather", "12 + Dex", "-");
    }
    public static void printMediumArmors() {
        System.out.println("\n--- Medium Armors ---");
        printArmorHeader();
        String format = "%-25s %-20s %s%n";
        System.out.printf(format, "Hide", "12 + Dex (max 2)", "-");
        System.out.printf(format, "Chain shirt", "13 + Dex (max 2)", "-");
        System.out.printf(format, "Scale mail", "14 + Dex (max 2)", "Disadvantage");
        System.out.printf(format, "Breastplate", "14 + Dex (max 2)", "-");
        System.out.printf(format, "Half plate", "15 + Dex (max 2)", "Disadvantage");
    }
    public static void printHeavyArmors() {
        System.out.println("\n--- Heavy Armors ---");
        printArmorHeader();
        String format = "%-25s %-20s %s%n";
        System.out.printf(format, "Ring mail", "14", "Disadvantage");
        System.out.printf(format, "Chain mail", "16", "Disadvantage");
        System.out.printf(format, "Splint", "17", "Disadvantage");
        System.out.printf(format, "Plate", "18", "Disadvantage");
    }

    public static void printAlignmentsList() {
        printInColumns(ALIGNMENTS);
    }

    // --- UTILS ---
    /**
     * Formats and prints an array of strings into a visually aligned three-column grid.
     * This utility is used to display long lists of options (like skills, spells, or equipment)
     * in a compact and readable format on the standard output.
     *
     * @param list The array of strings to be displayed in columns.
     */
    public static void printInColumns(String[] list) {
        String format = "%-35s %-35s %-35s%n";
        for (int i = 0; i < list.length; i += 3) {
            String s1 = list[i];
            String s2 = (i + 1 < list.length) ? list[i + 1] : "";
            String s3 = (i + 2 < list.length) ? list[i + 2] : "";
            System.out.printf(format, s1, s2, s3);
        }
    }

    public static boolean contains(String[] list, String element){
        for(String s : list){
            if(s.equalsIgnoreCase(element)){
                return true;
            }
        }
        return false;
    }

    // --- CHARACTER SHEET ---
    /**
     * Prints a complete, stylized D&D 5e character sheet to the standard output.
     * This method renders all aggregated statistics, ability modifiers, combat stats,
     * inventory, and spellcasting details calculated for the provided character.
     *
     * @param pg The fully generated and calculated PlayerCharacter object to be displayed.
     */
    public static void printCharacter(PlayerCharacter pg) {
        System.out.println("\n\n\n===================================================");
        System.out.println("                 CHARACTER SHEET");
        System.out.println("===================================================");
        System.out.println("Name: " + pg.getName());
        System.out.println("Class: " + pg.getCharacterClass().getName());
        System.out.println("Background: " + pg.getBackground().getName());
        System.out.println("Race: " + pg.getRace().getName());
        System.out.println("Alignment: " + pg.getAlignment());

        System.out.println("\n---------------------------------------------------");
        System.out.println("ABILITY SCORES:");
        for(attributes.Ability key : pg.getAbilityScores().keySet()){
            int score = pg.getAbilityScores().get(key);
            int mod = pg.getAbilityModifier(key);
            System.out.printf("%-15s: %d (%+d)%n", key.name(), score, mod);
        }

        System.out.println("---------------------------------------------------");
        System.out.println("Proficiency Bonus: +" + pg.getProficiencyBonus());

        System.out.println("\n---------------------------------------------------");
        System.out.println("SAVING THROW PROFICIENCIES:");
        for (attributes.Ability ab : pg.getSavingThrowsProficiencies()) {
            System.out.println("- " + ab.name());
        }

        System.out.println("\n---------------------------------------------------");
        System.out.println("SKILLS:");
        for(attributes.Skill skill : attributes.Skill.values()){
            int bonus = pg.getAbilityModifier(skill.getAssociatedAbility());
            String marker = " ";
            if (pg.getSkillExpertises().contains(skill)) {
                bonus += (pg.getProficiencyBonus() * 2);
                marker = "*"; // Expertise
            } else if (pg.getSkillProficiencies().contains(skill)) {
                bonus += pg.getProficiencyBonus();
                marker = "o"; // Proficiency
            }
            String cleanName = skill.name().replace("_", " ");
            System.out.printf("[%s] %-20s: %+d%n", marker, cleanName, bonus);
        }

        System.out.println("\n---------------------------------------------------");
        System.out.println("Passive Perception: " + pg.getPassivePerception());

        System.out.println("\n---------------------------------------------------");
        System.out.println("OTHER PROFICIENCIES & LANGUAGES:");
        System.out.println("Languages: " + String.join(", ", pg.getLanguages()));
        System.out.println("Weapons: " + String.join(", ", pg.getWeaponProficiencies()));
        System.out.println("Armor: " + String.join(", ", pg.getArmorProficiencies()));
        System.out.println("Tools: " + String.join(", ", pg.getToolProficiencies()));

        System.out.println("\n---------------------------------------------------");
        System.out.println("COMBAT STATS:");
        System.out.println("AC: " + pg.getArmorClass());
        System.out.println("Initiative: " + pg.getInitiative());
        System.out.println("Speed: " + pg.getSpeed() + " m.");
        System.out.println("Hit Points: " + pg.getCurrentHitPoints() + " / " + pg.getMaxHitPoints());
        System.out.println("Hit Dice: " + pg.getCharacterClass().getHitDices());

        System.out.println("\n---------------------------------------------------");
        System.out.println("INVENTORY & EQUIPMENT:");
        System.out.println("Equipped Armor: " + pg.getEquippedArmor() + (pg.isShieldEquipped() ? " & Shield" : ""));
        System.out.println("Weapons: " + String.join(", ", pg.getWeapons()));
        System.out.println("Inventory: " + String.join(", ", pg.getInventory()));

        System.out.println("\n---------------------------------------------------");
        System.out.println("FEATURES & TRAITS:");
        System.out.println("Resistances: " + String.join(", ", pg.getResistances()));
        System.out.println("Class/Race/Background Features: \n- " + String.join("\n- ", pg.getExtraBonuses()));
        if (!pg.getDisadvantages().isEmpty()) {
            System.out.println("\nDISADVANTAGES & PENALTIES:\n- " + String.join("\n- ", pg.getDisadvantages()));
        }

        System.out.println("\n---------------------------------------------------");
        System.out.println("PHYSICAL TRAITS:");
        System.out.printf("Age: %d | Height: %d | Weight: %.1f%n", pg.getAge(), pg.getHeight(), pg.getWeight());
        System.out.printf("Eyes: %s | Skin: %s | Hair: %s%n", pg.getEyes(), pg.getSkin(), pg.getHair());

        System.out.println("\n---------------------------------------------------");
        if(pg.getSpellcastingAbility() != null){
            System.out.println("SPELLCASTING:");
            System.out.println("Spellcasting Ability: " + pg.getSpellcastingAbility());
            int spellSaveDC = 8 + pg.getAbilityModifier(pg.getSpellcastingAbility()) + pg.getProficiencyBonus();
            int spellAttackBonus = pg.getAbilityModifier(pg.getSpellcastingAbility()) + pg.getProficiencyBonus();
            System.out.println("Spell Save DC: " + spellSaveDC);
            System.out.printf("Spell Attack Bonus: %+d%n", spellAttackBonus);
            System.out.println("Known Spells & Cantrips:");
            System.out.println("- " + String.join("\n- ", pg.getSpells()));
        } else {
            System.out.println("You are not a spellcaster.");
        }
        System.out.println("===================================================\n");
    }

    // --- UTILITIES ---
    public static String[] merge(String[] a, String[] b){
        String[] result = new String[a.length + b.length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        return result;
    }
}