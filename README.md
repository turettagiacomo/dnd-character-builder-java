# Project Nox: D&D 5e Character Creator

A fully functional, terminal-based Dungeons & Dragons 5th Edition Character Creator, written entirely in pure Java. 

## The "Zero to Hero" Engineering Journey
*Project Nox* is more than just a character generator; it is a testament to my technical growth. 

I initially wrote this software as a self-taught passion project during my first months at university. The original codebase was functional but relied heavily on procedural intricate code. After completing my first semester of Computer Engineering at the University of Padua and securing a **30/30 in Computer Science Fundamentals**, I decided to put my new skills to the test.

I completely tore down the old project and **refactored it from the ground up**, transitioning to a strict, scalable Object-Oriented architecture. 

### Transparency & The "Before"
I believe in the "Growth Mindset." If you want to see where I started and appreciate the architectural leap, you can view the original legacy code here: 
**[View v1.0 Legacy Code](https://github.com/turettagiacomo/dnd-character-builder-java/releases/tag/v1.0-legacy)**

## Technical Highlights (The "After")
The current `main` branch reflects clean code and advanced OOP principles:
* **Strict OOP Architecture:** Deep refactoring to ensure proper Encapsulation, Inheritance, and Polymorphism. Classes like `Race`, `CharacterClass`, and `Background` are now highly modular and easily scalable.
* **Polymorphic Rule Engine:** Leveraged method overriding to dynamically calculate complex D&D 5e stats (AC, HP, Initiative) based on the interaction between racial traits and class features.
* **Java Serialization:** Engineered persistent state management, allowing users to save their generated characters as serialized objects and load them in future sessions.
* **Robust CLI Controller:** Implemented an interactive terminal interface with strict input handling and validation loops to prevent crashes and ensure a seamless user experience.
* **Clean Code & Javadoc:** Fully localized the codebase to English, standardized naming conventions, and documented public interfaces using professional Javadoc standards.

## How to Run
To run Project Nox locally on your machine:

1. Clone the repository:
   ```bash
   git clone https://github.com/turettagiacomo/dnd-character-builder-java.git
   ```
2. Navigate to the source directory and compile the Java files:
   ```bash
   cd dnd-character-builder-java/src
   javac App.java
   ```
3. Run the application:
   ```bash
   java App
   ```

Developed by Giacomo Turetta - First-Year Computer Engineering Student.
