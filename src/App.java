import background.*;
import classes.*;
import classes.subclasses.*;
import races.*;
import races.subraces.*;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nWelcome to Project Nox. This software will help you build your D&D character.\n");

        System.out.println("What do you want to do?");
        System.out.println("[a] Load a character");
        System.out.println("[b] Create a new character");

        String startChoice = getValidMenuChoice(sc, 2);

        if (startChoice.equals("a")) {
            System.out.print("Enter the file name to load (e.g., 'Thor'): ");
            String fileName = sc.nextLine().trim();
            if (!fileName.endsWith(".dat")) {
                fileName += ".dat";
            }

            PlayerCharacter loadedPc = PlayerCharacter.loadCharacter(fileName);
            if (loadedPc != null) {
                MenuPrinter.printCharacter(loadedPc);
                sc.close();
                return;
            }
            else {
                System.out.println("Loading failed. Starting new character creation...\n");
            }
        }
        PlayerCharacter myPc = new PlayerCharacter();


        // --- RACE SELECTION ---

        System.out.println("\nLet's start with the basics. Choose your character's race from the list below:");
        MenuPrinter.printRacesList();

        while (myPc.getRace() == null) {
            System.out.print("\nWhat race do you choose? ");
            String choice = sc.nextLine().trim();

            if (choice.equalsIgnoreCase("Dwarf")) {
                System.out.println("Dwarves are renowned craftsmen. Choose your artisan's tool proficiency:");
                String[] dwarvenTools = {"Smith's tools", "Brewer's supplies", "Mason's tools"};
                multipleChoice(1, myPc, dwarvenTools, sc, "TOOL_PROFICIENCY");

                System.out.println("\nDwarven clans are diverse and proud.");
                MenuPrinter.printDwarfSubraces();
                System.out.print("\nWhich lineage do you hail from? ");

                DwarvenSubrace subDwarf = null;
                while (subDwarf == null) {
                    String subChoice = sc.nextLine().trim();
                    if (subChoice.equalsIgnoreCase("Hill Dwarf")) {
                        subDwarf = new HillDwarf();
                    }
                    else if (subChoice.equalsIgnoreCase("Mountain Dwarf")) {
                        subDwarf = new MountainDwarf();
                    }
                    else{
                        System.out.println("Invalid subrace. Try again.");
                    }
                }
                myPc.setRace(new Dwarf(subDwarf));
            }
            else if (choice.equalsIgnoreCase("Elf")) {
                System.out.println("Graceful and long-lived, the elven kin are divided into distinct cultures.");
                MenuPrinter.printElfSubraces();
                System.out.print("\nWhich one do you belong to? ");

                ElvenSubrace subElven = null;
                while (subElven == null) {
                    String subChoice = sc.nextLine().trim();
                    if (subChoice.equalsIgnoreCase("High Elf")) {
                        subElven = new HighElf();
                        multipleChoice(1, myPc, MenuPrinter.LANGUAGES, sc, "LANGUAGE");
                        multipleChoice(1, myPc, MenuPrinter.WIZARD_CANTRIPS, sc, "SPELL");
                    }
                    else if (subChoice.equalsIgnoreCase("Wood Elf")) {
                        subElven = new WoodElf();
                    }
                    else if (subChoice.equalsIgnoreCase("Dark Elf")){
                        subElven = new DarkElf();
                    }
                    else {
                        System.out.println("Invalid subrace. Try again.");
                    }
                }
                myPc.setRace(new Elf(subElven));
            }
            else if (choice.equalsIgnoreCase("Halfling")) {
                System.out.println("The two main kinds of halfling, lightfoot and stout, are more like closely related families than true subraces.");
                MenuPrinter.printHalflingSubraces();
                System.out.print("\nWhich one do you belong to? ");

                HalflingSubrace subHalfling = null;
                while (subHalfling == null) {
                    String subChoice = sc.nextLine().trim();
                    if (subChoice.equalsIgnoreCase("Lightfoot")) {
                        subHalfling = new LightfootHalfling();
                    }
                    else if (subChoice.equalsIgnoreCase("Stout")) {
                        subHalfling = new StoutHalfling();
                    }
                    else {
                        System.out.println("Invalid subrace. Try again.");
                    }
                }
                myPc.setRace(new Halfling(subHalfling));
            }
            else if (choice.equalsIgnoreCase("Human")) {
                myPc.setRace(new Human());
                multipleChoice(1, myPc, MenuPrinter.LANGUAGES, sc, "LANGUAGE");
            }
            else if (choice.equalsIgnoreCase("Dragonborn")) {
                System.out.println("Descended from dragons, your bloodline determines your breath weapon.");
                MenuPrinter.printDraconicAncestries();
                System.out.print("Who are your ancestors? ");

                boolean validAncestry = false;
                while (!validAncestry) {
                    String ancestry = sc.nextLine().trim();
                    switch (ancestry.toLowerCase()) {
                        case "black": case "blue": case "brass": case "bronze": case "copper":
                        case "gold": case "green": case "red": case "silver": case "white":
                            String formattedAncestry = ancestry.substring(0, 1).toUpperCase() + ancestry.substring(1).toLowerCase();
                            myPc.setRace(new Dragonborn(formattedAncestry));
                            validAncestry = true;
                            break;
                        default:
                            System.out.println("'" + ancestry + "' is not a valid ancestry. Try again.");
                    }
                }
            }
            else if (choice.equalsIgnoreCase("Gnome")) {
                System.out.println("Gnomish communities are generally divided into two distinct subraces: forest gnomes and rock gnomes.");
                MenuPrinter.printGnomeSubraces();
                System.out.print("\nWhich subrace do you choose? ");

                GnomishSubrace subGnome = null;
                while (subGnome == null) {
                    String subChoice = sc.nextLine().trim();
                    if (subChoice.equalsIgnoreCase("Forest Gnome")) {
                        subGnome = new ForestGnome();
                    }
                    else if (subChoice.equalsIgnoreCase("Rock Gnome")) {
                    subGnome = new RockGnome();
                    }
                    else{
                        System.out.println("Invalid subrace. Try again.");
                    }
                }
                myPc.setRace(new Gnome(subGnome));
            }
            else if (choice.equalsIgnoreCase("Half-Elf")) {
                myPc.setRace(new HalfElf());
                multipleChoice(1, myPc, MenuPrinter.LANGUAGES, sc, "LANGUAGE");
                multipleChoice(2, myPc, MenuPrinter.ABILITY_SCORES, sc, "ABILITY_SCORE");
                multipleChoice(2, myPc, MenuPrinter.SKILLS, sc, "SKILL");
            }
            else if (choice.equalsIgnoreCase("Half-Orc")) {
                myPc.setRace(new HalfOrc());
            }
            else if (choice.equalsIgnoreCase("Tiefling")) {
                myPc.setRace(new Tiefling());
            }
            else {
                System.out.println("Invalid race. Please try again.");
            }
        }


        // --- CLASS SELECTION ---

        System.out.println("\nExcellent choice! The next step is to choose your character's class.");
        MenuPrinter.printClassesList();
        System.out.print("Which class will you play? ");

        while (myPc.getCharacterClass() == null) {
            String choice = sc.nextLine().trim();

            if (choice.equalsIgnoreCase("Barbarian")) {
                myPc.setCharacterClass(new Barbarian());

                String[] barbarianSkills = {"Animal Handling", "Athletics", "Intimidation", "Nature", "Perception", "Survival"};
                multipleChoice(2, myPc, barbarianSkills, sc, "SKILL");

                System.out.println("\nEvery adventurer needs gear to survive. Let's pack your starting equipment.");
                System.out.println("[a] Greataxe / [b] Any martial melee weapon");

                String eq1 = getValidMenuChoice(sc, 2);

                if (eq1.equals("a")) {
                    myPc.addWeapon("Greataxe");
                }
                else {
                    multipleChoice(1, myPc, MenuPrinter.MARTIAL_MELEE_WEAPONS, sc, "WEAPON");
                }

                System.out.println("[a] Two handaxes / [b] Any simple weapon");

                String eq2 = getValidMenuChoice(sc, 2);

                if (eq2.equals("a")) {
                    myPc.addWeapon("Two handaxes");
                }
                else {
                    multipleChoice(1, myPc, MenuPrinter.merge(MenuPrinter.SIMPLE_MELEE_WEAPONS, MenuPrinter.SIMPLE_RANGED_WEAPONS), sc, "WEAPON");
                }
            }
            else if (choice.equalsIgnoreCase("Bard")) {
                myPc.setCharacterClass(new Bard());

                multipleChoice(3, myPc, MenuPrinter.SKILLS, sc, "SKILL");

                System.out.println("\nEvery adventurer needs gear to survive. Let's pack your starting equipment.");
                System.out.println("[a] Rapier / [b] Longsword / [c] Any simple weapon");
                String eq1 = getValidMenuChoice(sc, 3);
                if (eq1.equals("a")) {
                    myPc.addWeapon("Rapier");
                }
                else if (eq1.equals("b")) {
                    myPc.addWeapon("Longsword");
                }
                else {
                    multipleChoice(1, myPc, MenuPrinter.merge(MenuPrinter.SIMPLE_MELEE_WEAPONS, MenuPrinter.SIMPLE_RANGED_WEAPONS), sc, "WEAPON");
                }

                System.out.println("[a] Diplomat's pack / [b] Entertainer's pack");
                String eq2 = getValidMenuChoice(sc, 2);
                if (eq2.equals("a")) {
                    myPc.addEquipment("Diplomat's pack");
                }
                else {
                    myPc.addEquipment("Entertainer's pack");
                }

                System.out.println("[a] Lute / [b] Any other musical instrument");
                String eq3 = getValidMenuChoice(sc, 2);
                if (eq3.equals("a")) {
                    myPc.addEquipment("Lute");
                }
                else {
                    multipleChoice(1, myPc, MenuPrinter.MUSICAL_INSTRUMENTS, sc, "EQUIPMENT");
                }

                multipleChoice(2, myPc, MenuPrinter.BARD_CANTRIPS, sc, "SPELL");
                multipleChoice(4, myPc, MenuPrinter.BARD_SPELLS_LVL1, sc, "SPELL");
            }
            else if (choice.equalsIgnoreCase("Cleric")) {
                String[] clericSkills = {"History", "Insight", "Medicine", "Persuasion", "Religion"};
                multipleChoice(2, myPc, clericSkills, sc, "SKILL");

                System.out.println("\nEvery adventurer needs gear to survive. Let's pack your starting equipment.");
                if(myPc.getWeaponProficiencies().contains("Martial weapons") || myPc.getWeaponProficiencies().contains("Warhammer")){
                    System.out.println("[a] Mace / [b] Warhammer");
                    String eq1 = getValidMenuChoice(sc, 2);
                    if (eq1.equals("a")) {
                        myPc.addWeapon("Mace");
                    }
                    else {
                        myPc.addWeapon("Warhammer");
                    }
                }
                else{
                    myPc.addWeapon("Mace");
                }


                if(myPc.getArmorProficiencies().contains("Heavy Armor") || myPc.getArmorProficiencies().contains("Chain mail")){
                    System.out.println("[a] Scale mail / [b] Leather armor / [c] Chain mail");
                    String eq2 = getValidMenuChoice(sc, 3);
                    if (eq2.equals("a")) {
                        myPc.addArmor("Scale mail");
                    }
                    else if (eq2.equals("b")) {
                        myPc.addArmor("Leather");
                    }
                    else {
                        myPc.addArmor("Chain mail");
                    }
                }
                else{
                    System.out.println("[a] Scale mail / [b] Leather armor");
                    String eq2 = getValidMenuChoice(sc, 2);
                    if (eq2.equals("a")) {
                        myPc.addArmor("Scale mail");
                    }
                    else {
                        myPc.addArmor("Leather");
                    }
                }

                System.out.println("[a] Light crossbow and 20 bolts / [b] Any simple weapon");
                String eq3 = getValidMenuChoice(sc, 2);
                if (eq3.equals("a")) {
                    myPc.addWeapon("Light crossbow and 20 bolts");
                }
                else {
                    multipleChoice(1, myPc, MenuPrinter.merge(MenuPrinter.SIMPLE_MELEE_WEAPONS, MenuPrinter.SIMPLE_RANGED_WEAPONS), sc, "WEAPON");
                }

                multipleChoice(1, myPc, MenuPrinter.HOLY_SYMBOLS, sc, "EQUIPMENT");

                System.out.println("[a] Priest's pack / [b] Explorer's pack");
                String eq4 = getValidMenuChoice(sc, 2);
                if (eq4.equals("a")) {
                    myPc.addEquipment("Priest's pack");
                }
                else {
                    myPc.addEquipment("Explorer's pack");
                }

                multipleChoice(3, myPc, MenuPrinter.CLERIC_CANTRIPS, sc, "SPELL");
                multipleChoice(4, myPc, MenuPrinter.CLERIC_SPELLS_LVL1, sc, "SPELL");

                System.out.println("Choose your Divine Domain:");
                MenuPrinter.printClericSubclasses();
                ClericSubclass subCleric = null;
                while (subCleric == null) {
                    String subChoice = sc.nextLine().trim();
                    if (subChoice.equalsIgnoreCase("Knowledge Domain")) {
                        subCleric = new KnowledgeDomain();
                        multipleChoice(2, myPc, MenuPrinter.LANGUAGES, sc, "LANGUAGE");
                        String[] knSkills = {"Arcana", "History", "Nature", "Religion"};
                        multipleChoice(2, myPc, knSkills, sc, "SKILL_EXPERTISE");
                    }
                    else if (subChoice.equalsIgnoreCase("Life Domain")) {
                        subCleric = new LifeDomain();
                    }
                    else if (subChoice.equalsIgnoreCase("Light Domain")) {
                        subCleric = new LightDomain();
                    }
                    else if (subChoice.equalsIgnoreCase("Nature Domain")) {
                        subCleric = new NatureDomain();
                        String[] natSkills = {"Animal Handling", "Nature", "Survival"};
                        multipleChoice(1, myPc, natSkills, sc, "SKILL");
                        multipleChoice(1, myPc, MenuPrinter.DRUID_CANTRIPS, sc, "SPELL");
                    }
                    else if (subChoice.equalsIgnoreCase("Tempest Domain")) {
                        subCleric = new TempestDomain();
                    }
                    else if (subChoice.equalsIgnoreCase("Trickery Domain")) {
                        subCleric = new TrickeryDomain();
                    }
                    else if (subChoice.equalsIgnoreCase("War Domain")) {
                        subCleric = new WarDomain();
                    }
                    else System.out.println("Invalid Divine Domain. Please try again.");
                }
                myPc.setCharacterClass(new Cleric(subCleric));
            }
            else if (choice.equalsIgnoreCase("Druid")) {
                myPc.setCharacterClass(new Druid());

                String[] druidSkills = {"Arcana", "Animal Handling", "Insight", "Medicine", "Nature", "Perception", "Religion", "Survival"};
                multipleChoice(2, myPc, druidSkills, sc, "SKILL");

                System.out.println("\nEvery adventurer needs gear to survive. Let's pack your starting equipment.");
                System.out.println("[a] Shield / [b] Any simple weapon");
                String eq1 = getValidMenuChoice(sc, 2);
                if (eq1.equals("a")) {
                    myPc.addArmor("Shield");
                }
                else {
                    multipleChoice(1, myPc, MenuPrinter.merge(MenuPrinter.SIMPLE_MELEE_WEAPONS, MenuPrinter.SIMPLE_RANGED_WEAPONS), sc, "WEAPON");
                }

                System.out.println("[a] Scimitar / [b] Any simple melee weapon");
                String eq2 = getValidMenuChoice(sc, 2);
                if (eq2.equals("a")) {
                    myPc.addWeapon("Scimitar");
                }
                else {
                    multipleChoice(1, myPc, MenuPrinter.SIMPLE_MELEE_WEAPONS, sc, "WEAPON");
                }

                multipleChoice(1, myPc, MenuPrinter.DRUIDIC_FOCUSES, sc, "EQUIPMENT");

                multipleChoice(2, myPc, MenuPrinter.DRUID_CANTRIPS, sc, "SPELL");
                multipleChoice(4, myPc, MenuPrinter.DRUID_SPELLS_LVL1, sc, "SPELL");
            }
            else if (choice.equalsIgnoreCase("Fighter")) {
                myPc.setCharacterClass(new Fighter());

                String[] fighterSkills = {"Acrobatics", "Animal Handling", "Athletics", "History", "Insight", "Intimidation", "Perception", "Survival"};
                multipleChoice(2, myPc, fighterSkills, sc, "SKILL");

                System.out.println("\nEvery adventurer needs gear to survive. Let's pack your starting equipment.");
                System.out.println("[a] Chain mail / [b] Leather armor, longbow, and 20 arrows");
                String eq1 = getValidMenuChoice(sc, 2);
                if (eq1.equals("a")) {
                    myPc.addArmor("Chain mail");
                }
                else {
                    myPc.addArmor("Leather");
                    myPc.addWeapon("Longbow and 20 arrows");
                }

                System.out.println("[a] Martial weapon and shield / [b] Two martial weapons");
                String eq2 = getValidMenuChoice(sc, 2);
                if (eq2.equals("a")) {
                    myPc.addArmor("Shield");
                    multipleChoice(1, myPc, MenuPrinter.merge(MenuPrinter.MARTIAL_MELEE_WEAPONS, MenuPrinter.MARTIAL_RANGED_WEAPONS), sc, "WEAPON");
                }
                else {
                    multipleChoice(2, myPc, MenuPrinter.merge(MenuPrinter.MARTIAL_MELEE_WEAPONS, MenuPrinter.MARTIAL_RANGED_WEAPONS), sc, "WEAPON");
                }

                System.out.println("[a] Light crossbow and 20 bolts / [b] Two handaxes");
                String eq3 = getValidMenuChoice(sc, 2);
                if (eq3.equals("a")) {
                    myPc.addWeapon("Light crossbow and 20 bolts");
                }
                else {
                    myPc.addWeapon("Two handaxes");
                }

                System.out.println("[a] Dungeoneer's pack / [b] Explorer's pack");
                String eq4 = getValidMenuChoice(sc, 2);
                if (eq4.equals("a")) {
                    myPc.addEquipment("Dungeoneer's pack");
                }
                else {
                    myPc.addEquipment("Explorer's pack");
                }
            }
            else if (choice.equalsIgnoreCase("Monk")) {
                myPc.setCharacterClass(new Monk());

                String[] monkSkills = {"Acrobatics", "Athletics", "History", "Insight", "Religion", "Stealth"};
                multipleChoice(2, myPc, monkSkills, sc, "SKILL");

                System.out.println("\nEvery adventurer needs gear to survive. Let's pack your starting equipment.");
                System.out.println("[a] Shortsword / [b] Any simple weapon");
                String eq1 = getValidMenuChoice(sc, 2);
                if (eq1.equals("a")) {
                    myPc.addWeapon("Shortsword");
                }
                else {
                    multipleChoice(1, myPc, MenuPrinter.merge(MenuPrinter.SIMPLE_MELEE_WEAPONS, MenuPrinter.SIMPLE_RANGED_WEAPONS), sc, "WEAPON");
                }

                multipleChoice(1, myPc, MenuPrinter.merge(MenuPrinter.ARTISAN_TOOLS, MenuPrinter.MUSICAL_INSTRUMENTS), sc, "TOOL_PROFICIENCY");

                System.out.println("[a] Dungeoneer's pack / [b] Explorer's pack");
                String eq2 = getValidMenuChoice(sc, 2);
                if (eq2.equals("a")) {
                    myPc.addEquipment("Dungeoneer's pack");
                }
                else {
                    myPc.addEquipment("Explorer's pack");
                }
            }
            else if (choice.equalsIgnoreCase("Paladin")) {
                myPc.setCharacterClass(new Paladin());

                String[] paladinSkills = {"Athletics", "Insight", "Intimidation", "Medicine", "Persuasion", "Religion"};
                multipleChoice(2, myPc, paladinSkills, sc, "SKILL");

                System.out.println("\nEvery adventurer needs gear to survive. Let's pack your starting equipment.");
                System.out.println("[a] Martial weapon and shield / [b] Two martial weapons");
                String eq1 = getValidMenuChoice(sc, 2);
                if (eq1.equals("a")) {
                    myPc.addArmor("Shield");
                    multipleChoice(1, myPc, MenuPrinter.merge(MenuPrinter.MARTIAL_MELEE_WEAPONS, MenuPrinter.MARTIAL_RANGED_WEAPONS), sc, "WEAPON");
                }
                else {
                    multipleChoice(2, myPc, MenuPrinter.merge(MenuPrinter.MARTIAL_MELEE_WEAPONS, MenuPrinter.MARTIAL_RANGED_WEAPONS), sc, "WEAPON");
                }

                System.out.println("[a] Five javelins / [b] Any simple melee weapon");
                String eq2 = getValidMenuChoice(sc, 2);
                if (eq2.equals("a")) {
                    myPc.addWeapon("Five javelins");
                }
                else {
                    multipleChoice(1, myPc, MenuPrinter.SIMPLE_MELEE_WEAPONS, sc, "WEAPON");
                }

                multipleChoice(1, myPc, MenuPrinter.HOLY_SYMBOLS, sc, "EQUIPMENT");

                System.out.println("[a] Priest's pack / [b] Explorer's pack");
                String eq3 = getValidMenuChoice(sc, 2);
                if (eq3.equals("a")) {
                    myPc.addEquipment("Priest's pack");
                }
                else {
                    myPc.addEquipment("Explorer's pack");
                }
            }
            else if (choice.equalsIgnoreCase("Ranger")) {
                myPc.setCharacterClass(new Ranger());

                String[] rangerSkills = {"Animal Handling", "Athletics", "Insight", "Investigation", "Nature", "Perception", "Stealth", "Survival"};
                multipleChoice(3, myPc, rangerSkills, sc, "SKILL");

                System.out.println("\nEvery adventurer needs gear to survive. Let's pack your starting equipment.");
                System.out.println("[a] Scale mail / [b] Leather armor");
                String eq1 = getValidMenuChoice(sc, 2);
                if (eq1.equals("a")) {
                    myPc.addArmor("Scale mail");
                }
                else {
                    myPc.addArmor("Leather");
                }

                System.out.println("[a] Two shortswords / [b] Two simple melee weapons");
                String eq2 = getValidMenuChoice(sc, 2);
                if (eq2.equals("a")) {
                    myPc.addWeapon("2 Shortswords");
                }
                else {
                    multipleChoice(2, myPc, MenuPrinter.SIMPLE_MELEE_WEAPONS, sc, "WEAPON");
                }

                System.out.println("[a] Dungeoneer's pack / [b] Explorer's pack");
                String eq3 = getValidMenuChoice(sc, 2);
                if (eq3.equals("a")) {
                    myPc.addEquipment("Dungeoneer's pack");
                }
                else {
                    myPc.addEquipment("Explorer's pack");
                }
            }
            else if (choice.equalsIgnoreCase("Rogue")) {
                myPc.setCharacterClass(new Rogue());

                String[] rogueSkills = {"Acrobatics", "Athletics", "Deception", "Insight", "Intimidation", "Investigation", "Perception", "Performance", "Persuasion", "Sleight of Hand", "Stealth"};
                multipleChoice(4, myPc, rogueSkills, sc, "SKILL");
                System.out.println("Choose 2 skills for Expertise (double proficiency):");
                multipleChoice(2, myPc, rogueSkills, sc, "SKILL_EXPERTISE");

                System.out.println("\nEvery adventurer needs gear to survive. Let's pack your starting equipment.");
                System.out.println("[a] Rapier / [b] Shortsword");
                String eq1 = getValidMenuChoice(sc, 2);
                if (eq1.equals("a")) {
                    myPc.addWeapon("Rapier");
                }
                else {
                    myPc.addWeapon("Shortsword");
                }

                System.out.println("[a] Shortbow and 20 arrows / [b] Shortsword");
                String eq2 = getValidMenuChoice(sc, 2);
                if (eq2.equals("a")) {
                    myPc.addWeapon("Shortbow and 20 arrows");
                }
                else {
                    myPc.addWeapon("Shortsword");
                }

                System.out.println("[a] Burglar's pack / [b] Dungeoneer's pack / [c] Explorer's pack");
                String eq3 = getValidMenuChoice(sc, 3);
                if (eq3.equals("a")) {
                    myPc.addEquipment("Burglar's pack");
                }
                else if (eq3.equals("b")) {
                    myPc.addEquipment("Dungeoneer's pack");
                }
                else {
                    myPc.addEquipment("Explorer's pack");
                }
            }
            else if (choice.equalsIgnoreCase("Sorcerer")) {
                String[] sorcererSkills = {"Arcana", "Deception", "Insight", "Intimidation", "Persuasion", "Religion"};
                multipleChoice(2, myPc, sorcererSkills, sc, "SKILL");

                System.out.println("\nEvery adventurer needs gear to survive. Let's pack your starting equipment.");
                System.out.println("[a] Light crossbow and 20 bolts / [b] Any simple weapon");
                String eq1 = getValidMenuChoice(sc, 2);
                if (eq1.equals("a")) {
                    myPc.addWeapon("Light crossbow and 20 bolts");
                }
                else {
                    multipleChoice(1, myPc, MenuPrinter.merge(MenuPrinter.SIMPLE_MELEE_WEAPONS, MenuPrinter.SIMPLE_RANGED_WEAPONS), sc, "WEAPON");
                }

                System.out.println("[a] Component pouch / [b] Arcane Focus");
                String eq2 = getValidMenuChoice(sc, 2);
                if (eq2.equals("a")) {
                    myPc.addEquipment("Component pouch");
                }
                else {
                    multipleChoice(1, myPc, MenuPrinter.ARCANE_FOCUSES, sc, "EQUIPMENT");
                }

                System.out.println("[a] Dungeoneer's pack / [b] Explorer's pack");
                String eq3 = getValidMenuChoice(sc, 2);
                if (eq3.equals("a")) {
                    myPc.addEquipment("Dungeoneer's pack");
                }
                else {
                    myPc.addEquipment("Explorer's pack");
                }

                multipleChoice(4, myPc, MenuPrinter.SORCERER_CANTRIPS, sc, "SPELL");
                multipleChoice(2, myPc, MenuPrinter.SORCERER_SPELLS_LVL1, sc, "SPELL");

                System.out.println("Choose your Sorcerous Origin:");
                MenuPrinter.printSorcererSubclasses();
                SourcererSubclass subSorc = null;
                while (subSorc == null) {
                    String subChoice = sc.nextLine().trim();
                    if (subChoice.equalsIgnoreCase("Draconic Bloodline")) {
                        System.out.println("Choose your draconic ancestry:");
                        MenuPrinter.printDraconicAncestries();
                        String formattedAncestry = null;
                        while (formattedAncestry == null) {
                            String ancestry = sc.nextLine().trim();
                            switch (ancestry.toLowerCase()) {
                                case "black": case "blue": case "brass": case "bronze": case "copper":
                                case "gold": case "green": case "red": case "silver": case "white":
                                    formattedAncestry = ancestry.substring(0, 1).toUpperCase() + ancestry.substring(1).toLowerCase();
                                    break;
                                default:
                                    System.out.println("'" + ancestry + "' is not a valid ancestry. Try again.");
                            }
                        }
                        subSorc = new DraconicBloodline(formattedAncestry);
                    }
                    else if (subChoice.equalsIgnoreCase("Wild Magic")) {
                        subSorc = new WildMagic();
                    }
                    else {
                        System.out.println("Invalid Sorcerous Origin. Please try again.");
                    }
                }
                myPc.setCharacterClass(new Sorcerer(subSorc));
            }
            else if (choice.equalsIgnoreCase("Warlock")) {
                String[] warlockSkills = {"Arcana", "Deception", "History", "Intimidation", "Investigation", "Nature", "Religion"};
                multipleChoice(2, myPc, warlockSkills, sc, "SKILL");

                System.out.println("\nEvery adventurer needs gear to survive. Let's pack your starting equipment.");
                System.out.println("[a] Light crossbow and 20 bolts / [b] Any simple weapon");
                String eq1 = getValidMenuChoice(sc, 2);
                if (eq1.equals("a")) {
                    myPc.addWeapon("Light crossbow and 20 bolts");
                }
                else {
                    multipleChoice(1, myPc, MenuPrinter.merge(MenuPrinter.SIMPLE_MELEE_WEAPONS, MenuPrinter.SIMPLE_RANGED_WEAPONS), sc, "WEAPON");
                }

                System.out.println("[a] Component pouch / [b] Arcane Focus");
                String eq2 = getValidMenuChoice(sc, 2);
                if (eq2.equals("a")) {
                    myPc.addEquipment("Component pouch");
                }
                else {
                    multipleChoice(1, myPc, MenuPrinter.ARCANE_FOCUSES, sc, "EQUIPMENT");
                }

                System.out.println("[a] Scholar's pack / [b] Dungeoneer's pack");
                String eq3 = getValidMenuChoice(sc, 2);
                if (eq3.equals("a")) {
                    myPc.addEquipment("Scholar's pack");
                }
                else {
                    myPc.addEquipment("Dungeoneer's pack");
                }

                multipleChoice(2, myPc, MenuPrinter.WARLOCK_CANTRIPS, sc, "SPELL");
                multipleChoice(2, myPc, MenuPrinter.WARLOCK_SPELLS_LVL1, sc, "SPELL");

                System.out.println("Choose your Otherworldly Patron:");
                MenuPrinter.printWarlockSubclasses();
                WarlockSubclass subWarlock = null;
                while (subWarlock == null) {
                    String subChoice = sc.nextLine().trim();
                    if (subChoice.equalsIgnoreCase("The Archfey")) {
                        subWarlock = new TheArchfey();
                    }
                    else if (subChoice.equalsIgnoreCase("The Fiend")) {
                        subWarlock = new TheFiend();
                    }
                    else if (subChoice.equalsIgnoreCase("The Great Old One")) {
                        subWarlock = new TheGreatOldOne();
                    }
                    else System.out.println("Invalid Otherworldly Patron. Please try again.");
                }
                myPc.setCharacterClass(new Warlock(subWarlock));
            }
            else if (choice.equalsIgnoreCase("Wizard")) {
                myPc.setCharacterClass(new Wizard());

                String[] wizardSkills = {"Arcana", "History", "Insight", "Investigation", "Medicine", "Religion"};
                multipleChoice(2, myPc, wizardSkills, sc, "SKILL");

                System.out.println("\nEvery adventurer needs gear to survive. Let's pack your starting equipment.");
                System.out.println("[a] Quarterstaff / [b] Dagger");
                String eq1 = getValidMenuChoice(sc, 2);
                if (eq1.equals("a")) {
                    myPc.addWeapon("Quarterstaff");
                }
                else {
                    myPc.addWeapon("Dagger");
                }

                System.out.println("[a] Component pouch / [b] Arcane Focus");
                String eq2 = getValidMenuChoice(sc, 2);
                if (eq2.equals("a")) {
                    myPc.addEquipment("Component pouch");
                }
                else {
                    multipleChoice(1, myPc, MenuPrinter.ARCANE_FOCUSES, sc, "EQUIPMENT");
                }

                System.out.println("[a] Scholar's pack / [b] Explorer's pack");
                String eq3 = getValidMenuChoice(sc, 2);
                if (eq3.equals("a")) {
                    myPc.addEquipment("Scholar's pack");
                }
                else {
                    myPc.addEquipment("Explorer's pack");
                }

                multipleChoice(3, myPc, MenuPrinter.WIZARD_CANTRIPS, sc, "SPELL");
                multipleChoice(6, myPc, MenuPrinter.WIZARD_SPELLS_LVL1, sc, "SPELL");
            }
            else {
                System.out.println("Invalid class. Please try again.");
            }
        }


        // --- BACKGROUND SELECTION ---

        System.out.println("\nEvery story has a beginning. Your character's background reveals where you came from, how you became an adventurer, and your place in the world.\n");
        MenuPrinter.printBackgroundsList();

        while (myPc.getBackground() == null) {
            System.out.print("Who were you? ");
            String choice = sc.nextLine().trim();

            if (choice.equalsIgnoreCase("Acolyte")) {
                multipleChoice(2, myPc, MenuPrinter.LANGUAGES, sc, "LANGUAGE");
                multipleChoice(1, myPc, MenuPrinter.HOLY_SYMBOLS, sc, "EQUIPMENT");
                myPc.setBackground(new Acolyte());
            }
            else if (choice.equalsIgnoreCase("Charlatan")) {
                multipleChoice(1,  myPc, MenuPrinter.CON_TOOLS, sc, "EQUIPMENT");
                myPc.setBackground(new Charlatan());
            }
            else if (choice.equalsIgnoreCase("Criminal")) {
                multipleChoice(1, myPc,  MenuPrinter.GAMING_SETS, sc, "TOOL_PROFICIENCY");
                myPc.setBackground(new Criminal());
            }
            else if (choice.equalsIgnoreCase("Entertainer")) {
                multipleChoice(1, myPc, MenuPrinter.MUSICAL_INSTRUMENTS, sc, "TOOL_PROFICIENCY");
                multipleChoice(1, myPc, MenuPrinter.MUSICAL_INSTRUMENTS, sc, "EQUIPMENT");
                myPc.setBackground(new Entertainer());
            }
            else if (choice.equalsIgnoreCase("Folk Hero")) {
                multipleChoice(1, myPc, MenuPrinter.ARTISAN_TOOLS, sc, "TOOL_PROFICIENCY");
                multipleChoice(1, myPc, MenuPrinter.ARTISAN_TOOLS, sc, "EQUIPMENT");
                myPc.setBackground(new FolkHero());
            }
            else if (choice.equalsIgnoreCase("Guild Artisan")) {
                multipleChoice(1, myPc, MenuPrinter.ARTISAN_TOOLS, sc, "TOOL_PROFICIENCY");
                multipleChoice(1, myPc,  MenuPrinter.ARTISAN_TOOLS, sc, "EQUIPMENT");
                multipleChoice(1, myPc, MenuPrinter.LANGUAGES, sc, "LANGUAGE");
                myPc.setBackground(new GuildArtisan());
            }
            else if (choice.equalsIgnoreCase("Hermit")) {
                multipleChoice(1, myPc, MenuPrinter.LANGUAGES, sc, "LANGUAGE");
                myPc.setBackground(new Hermit());
            }
            else if (choice.equalsIgnoreCase("Noble")) {
                multipleChoice(1, myPc, MenuPrinter.GAMING_SETS, sc, "TOOL_PROFICIENCY");
                multipleChoice(1, myPc, MenuPrinter.LANGUAGES, sc, "LANGUAGE");
                myPc.setBackground(new Noble());
            }
            else if (choice.equalsIgnoreCase("Outlander")) {
                multipleChoice(1, myPc, MenuPrinter.MUSICAL_INSTRUMENTS, sc, "TOOL_PROFICIENCY");
                multipleChoice(1, myPc, MenuPrinter.LANGUAGES, sc, "LANGUAGE");
                myPc.setBackground(new Outlander());
            }
            else if (choice.equalsIgnoreCase("Sage")) {
                multipleChoice(2, myPc, MenuPrinter.LANGUAGES, sc, "LANGUAGE");
                myPc.setBackground(new Sage());
            }
            else if (choice.equalsIgnoreCase("Sailor")) {
                myPc.setBackground(new Sailor());
            }
            else if (choice.equalsIgnoreCase("Soldier")) {
                multipleChoice(1, myPc, MenuPrinter.GAMING_SETS, sc, "TOOL_PROFICIENCY");
                multipleChoice(1, myPc, new String[]{"A set of bone dice", "A deck of cards"}, sc, "EQUIPMENT");
                myPc.setBackground(new Soldier());
            }
            else if (choice.equalsIgnoreCase("Urchin")) {
                myPc.setBackground(new Urchin());
            }
            else {
                System.out.println("Invalid background. Please try again.");
            }
        }


        // --- CHARACTER BIO ---

        System.out.println("\nNow, let's define your character's details.");

        System.out.print("Character Name: ");
        String input = "";
        while(input.isEmpty()){
            input = sc.nextLine().trim();
        }
        myPc.setName(input);
        input = "";
        System.out.print("Gender: ");
        while(input.isEmpty()){
            input = sc.nextLine().trim();
        }
        myPc.setGender(input);
        input = "";
        while (myPc.getAge() <= 0) {
            System.out.print("Age (number): ");
            try {
                int age = Integer.parseInt(sc.nextLine().trim());
                if (age > 0) {
                    myPc.setAge(age);
                }
                else {
                    System.out.println("Age must be greater than 0.");
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid select. Please enter a numeric value for Age (e.g., 30).");
            }
        }
        while (myPc.getHeight() <= 0) {
            System.out.print("Height in cm (number): ");
            try {
                int height = Integer.parseInt(sc.nextLine().trim());
                if (height > 0) myPc.setHeight(height);
                else System.out.println("Height must be greater than 0.");
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid select. Please enter a numeric value for Height (e.g., 180).");
            }
        }
        while (myPc.getWeight() <= 0) {
            System.out.print("Weight in kg (number): ");
            try {
                double weight = Double.parseDouble(sc.nextLine().replace(",", ".").trim());
                if (weight > 0) myPc.setWeight(weight);
                else System.out.println("Weight must be greater than 0.");
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid select. Please enter a numeric value for Weight (e.g., 80.5).");
            }
        }
        System.out.print("Eyes: ");
        while(input.isEmpty()){
            input = sc.nextLine().trim();
        }
        myPc.setEyes(input);
        input = "";
        System.out.print("Skin: ");
        while(input.isEmpty()){
            input = sc.nextLine().trim();
        }
        myPc.setSkin(input);
        input = "";
        System.out.print("Hair: ");
        while(input.isEmpty()){
            input = sc.nextLine().trim();
        }
        myPc.setHair(input);
        System.out.println("Choose your Alignment:");
        MenuPrinter.printAlignmentsList();
        while (myPc.getAlignment() == null) {
            System.out.print("Alignment: ");
            String alChoice = sc.nextLine().trim();

            if (MenuPrinter.contains(MenuPrinter.ALIGNMENTS, alChoice)) {
                myPc.setAlignment(alChoice);
            } else {
                System.out.println("Invalid alignment. Please type it exactly as shown.");
            }
        }


        // --- CHARACTER STATS GENERATION ---

        System.out.println("\nHello there " + myPc.getName() + ". It's now the time for you to set your abilities.");

        boolean statsGenerated = false;
        while (!statsGenerated) {
            System.out.println("\nChoose a generation method:");
            System.out.println("[1] Standard Array (15, 14, 13, 12, 10, 8)");
            System.out.println("[2] Roll Dice (4d6 drop lowest)");
            System.out.println("[3] Manual Input");
            System.out.print("Method: ");

            String statChoice = sc.nextLine().trim();

            switch (statChoice) {
                case "1":   //Standard Array
                    generateStandardArray(myPc, sc);
                    statsGenerated = true;
                    break;
                case "2":   //Roll Dice
                    generateRolledScores(myPc, sc);
                    statsGenerated = true;
                    break;
                case "3":   //Manual Input
                    generateManualScores(myPc, sc);
                    statsGenerated = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                    break;
            }
        }

        String ownedArmor = null;
        boolean ownsShield = false;
        for (String armor : myPc.getArmors()) {
            if (armor.equalsIgnoreCase("Shield") || armor.equalsIgnoreCase("Shields")) {
                ownsShield = true;
            }
            else {
                ownedArmor = armor;
            }
        }
        if (ownedArmor != null) {
            System.out.print("\nYou own a " + ownedArmor + ". Do you want to equip it? (Y/N): ");
            if (yesNoChoice(sc) == 'y') {
                myPc.setEquippedArmor(ownedArmor);
            }
        }
        if (ownsShield) {
            System.out.print("\nYou own a Shield. Do you want to equip it? (Y/N): ");
            if (yesNoChoice(sc) == 'y') {
                myPc.setShieldEquipped(true);
            }
        }

        myPc.applyFinalNumericalBonuses();

        MenuPrinter.printCharacter(myPc);

        System.out.print("Do you want to save this character? (Y/N): ");
        if (yesNoChoice(sc) == 'y') {
            String safeName = myPc.getName().replaceAll("[^a-zA-Z0-9.-]", "_");
            String fileName = safeName + ".dat";
            myPc.saveCharacter(fileName);
        }

        System.out.println("\nThe sun rises outside, and " + myPc.getName() + " wakes up to a strange sound...");
        sc.close();
    }

    /**
     * Prompts the user to select a specified number of items from a predefined pool of choices.
     * It handles input validation, ensures choices strictly match the available pool, and
     * delegates the addition of the selected items to the appropriate PlayerCharacter method
     * based on the provided choice type.
     *
     * @param numberOfChoices The number of distinct selections the user must make.
     * @param pg              The PlayerCharacter instance to be updated.
     * @param choicesPool     An array of valid strings representing the available options.
     * @param sc              The Scanner object used to read standard input.
     * @param type            A string indicating the category of the choice (e.g., "SKILL", "WEAPON", "SPELL").
     * This dictates which specific logic is applied to the character.
     */
    private static void multipleChoice(int numberOfChoices, PlayerCharacter pg, String[] choicesPool, Scanner sc, String type) {
        int counter = 0;
        System.out.println("\nChoose " + type.toLowerCase().replace("_", " ") + " between:");
        MenuPrinter.printInColumns(choicesPool);

        while (counter < numberOfChoices) {
            System.out.print("Choice " + (counter + 1) + "/" + numberOfChoices + ": ");
            String input = sc.nextLine().trim();

            if (!MenuPrinter.contains(choicesPool, input)) {
                System.out.println("Invalid choice. Please ensure you typed it correctly.");
                continue;
            }

            switch (type.toUpperCase()) {
                case "SKILL":
                    try {
                        String enumName = input.toUpperCase().replace(" ", "_");
                        if (pg.addSkillProficiency(attributes.Skill.valueOf(enumName))) {
                            counter++;
                        } else {
                            System.out.println("You already have this proficiency! Pick a different one.");
                        }
                    }
                    catch (IllegalArgumentException e) {
                        System.out.println("Error parsing skill. Try again.");
                    }
                    break;
                case "SKILL_EXPERTISE":
                    try {
                        String enumName = input.toUpperCase().replace(" ", "_");
                        if (pg.addSkillExpertise(attributes.Skill.valueOf(enumName))) {
                            counter++;
                        } else {
                            System.out.println("You already have this expertise! Pick a different one.");
                        }
                    }
                    catch (IllegalArgumentException e) {
                        System.out.println("Error parsing skill. Try again.");
                    }
                    break;
                case "LANGUAGE":
                    if (pg.addLanguage(input)) {
                        counter++;
                    } else {
                        System.out.println("You already know this language! Pick a different one.");
                    }
                    break;
                case "WEAPON":
                    pg.addWeapon(input);
                    counter++;
                    break;
                case "TOOL_PROFICIENCY":
                    if (pg.addToolProficiency(input)) {
                        counter++;
                    } else {
                        System.out.println("You already have this tool proficiency! Pick a different one.");
                    }
                    break;
                case "EQUIPMENT":
                    pg.addEquipment(input);
                    counter++;
                    break;
                case "ARMOR":
                    pg.addArmor(input);
                    counter++;
                    break;
                case "SPELL":
                    if (pg.addSpell(input)) {
                        counter++;
                    } else {
                        System.out.println("You already know this spell! Pick a different one.");
                    }
                    break;
                case "ABILITY_SCORE":
                    try {
                        String enumName = input.toUpperCase();
                        pg.addAbilityScorePoint(attributes.Ability.valueOf(enumName));
                        counter++;
                    }
                    catch (IllegalArgumentException e) {
                        System.out.println("Error parsing ability score. Try again.");
                    }
                    break;
                default:
                    System.out.println("Internal error: type '" + type + "' not recognized.");
                    return;
            }
        }
    }

    /**
     * Prompts the user to select an option from a dynamically generated letter-based menu
     * (e.g., 'a', 'b', 'c') and guarantees a valid response. It loops continuously until
     * the user provides an input that matches one of the valid alphabetical options.
     *
     * @param sc              The Scanner object used to read standard input.
     * @param numberOfOptions The total number of alphabetical options available in the menu.
     * @return A valid, lowercase string representing the user's validated choice.
     */
    private static String getValidMenuChoice(Scanner sc, int numberOfOptions) {
        String[] validOptions = new String[numberOfOptions];
        for (int i = 0; i < numberOfOptions; i++) {
            validOptions[i] = String.valueOf((char) ('a' + i));
        }

        System.out.print("What do you pick? ");
        String input = sc.nextLine().trim().toLowerCase();
        boolean isValid = false;
        while (!isValid) {
            for (String option : validOptions) {
                if (input.equals(option)) {
                    isValid = true;
                    break;
                }
            }
            if (!isValid) {
                System.out.print("Invalid value. Try again (" + String.join("/", validOptions) + "): ");
                input = sc.nextLine().trim().toLowerCase();
            }
        }
        return input;
    }

    /**
     * Prompts the user to input Y/y or N/n in binary choices.
     * @param sc The Scanner object used to read standard input.
     * @return y if the input was Y/y, n if the input was N/n.
     */
    private static char yesNoChoice(Scanner sc) {
        String input = sc.nextLine().toLowerCase();
        boolean isValid = false;
        while(!isValid) {
            if(input.trim().equalsIgnoreCase("y")) {
                return 'y';
            }
            else if(input.trim().equalsIgnoreCase("n")) {
                return 'n';
            }
            System.out.println("Invalid value");
        }
        return ' ';
    }

    private static void assignScoresFromList(PlayerCharacter pg, Scanner sc, List<Integer> availableScores) {
        for (attributes.Ability ability : attributes.Ability.values()) {
            boolean validScore = false;
            while (!validScore) {
                System.out.println("Available scores: " + availableScores);
                System.out.print("Assign a score to " + ability.name() + ": ");
                try {
                    int score = Integer.parseInt(sc.nextLine().trim());

                    if (availableScores.contains(score)) {
                        pg.setAbilityScore(ability, score);
                        availableScores.remove(Integer.valueOf(score));
                        validScore = true;
                    }
                    else {
                        System.out.println("Invalid choice. Please pick a score from the available list.");
                    }
                }
                catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number.");
                }
            }
            System.out.println();
        }
    }

    /**
     * Guides the user through assigning the standard array of D&D 5e ability scores
     * (15, 14, 13, 12, 10, 8) to the character's attributes.
     *
     * @param pg The PlayerCharacter instance to be updated.
     * @param sc The Scanner object used to read standard input.
     */
    private static void generateStandardArray(PlayerCharacter pg, Scanner sc) {
        System.out.println("\n--- Standard Array ---");
        List<Integer> availableScores = new ArrayList<>(Arrays.asList(15, 14, 13, 12, 10, 8));
        assignScoresFromList(pg, sc, availableScores);
    }

    /**
     * Generates six random ability scores by simulating the standard "roll 4d6 and drop the lowest" rule.
     * It then prompts the user to assign these randomly generated values to their character's attributes.
     *
     * @param pg The PlayerCharacter instance to be updated.
     * @param sc The Scanner object used to read standard input.
     */
    private static void generateRolledScores(PlayerCharacter pg, Scanner sc) {
        System.out.println("\n--- Roll Dice (4d6 drop lowest) ---");
        List<Integer> availableScores = new ArrayList<>();
        Random rand = new Random();
        final int MAX_ROLLABLE = 6;

        for (int i = 0; i < 6; i++) {
            int min = 6;
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                int roll = rand.nextInt(MAX_ROLLABLE) + 1;
                sum += roll;
                if (roll < min) {
                    min = roll;
                }
            }
            availableScores.add(sum - min);
        }

        System.out.println("The dice gods have spoken! Your rolled scores are: " + availableScores + "\n");

        assignScoresFromList(pg, sc, availableScores);
    }

    /**
     * Allows the user to manually input a custom integer value for each of the character's
     * six ability scores. Enforces a valid range of 1 to 20 for each input.
     *
     * @param pg The PlayerCharacter instance to be updated.
     * @param sc The Scanner object used to read standard input.
     */
    private static void generateManualScores(PlayerCharacter pg, Scanner sc) {
        System.out.println("\n--- Manual Input ---");
        for (attributes.Ability ability : attributes.Ability.values()) {
            boolean validScore = false;
            while (!validScore) {
                System.out.print("Enter base score for " + ability.name() + ": ");
                try {
                    int score = Integer.parseInt(sc.nextLine().trim());
                    if (score > 0 && score <= 20) {
                        pg.setAbilityScore(ability, score);
                        validScore = true;
                    }
                    else {
                        System.out.println("Score must be between 1 and 20.");
                    }
                }
                catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a numeric value.");
                }
            }
        }
    }

    private static int[] diceRoller(int diceNumber, int diceValue) {
        int[] rolls = new int[diceNumber];
        Random rand = new Random();
        for(int i = 0; i < diceNumber; i++){
            rolls[i] = rand.nextInt(diceValue) + 1;
        }
        Arrays.sort(rolls);
        System.out.println("The rolled values are: " + Arrays.toString(rolls));
        return rolls;
    }

    private static int[] diceRoller(String dice){
        String[] diceSplitted = dice.split("d");
        int diceNumber = 0;
        int diceValue = 0;
        try{
            diceNumber = Integer.parseInt(diceSplitted[0]);
            diceValue = Integer.parseInt(diceSplitted[1]);
        }catch (NumberFormatException e){
            System.out.println("Invalid input. Please enter a numeric value.");
        }
        System.out.println("I'll roll " + diceNumber + "d" + diceValue);
        return diceRoller(diceNumber, diceValue);
    }

    private static int sumDices(int[] rolls){
        int sum = 0;
        for (int roll : rolls) {
            sum += roll;
        }
        return sum;
    }

    private static int sumDicesDropLowest(int[] sortedRolls){
        int sum = 0;
        for (int i = 1; i < sortedRolls.length; i++) {
            sum += sortedRolls[i];
        }
        return sum;
    }
}