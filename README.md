IMPORTANT:
Project was done in Visual Studio Code with a Java Extention since NetBean couldn't run on my desktop ~UN

📖 Story
You are a brave adventurer wandering into the land of enchanted numbers.
Every enemy you meet has a hidden mathematical weakness. Use the right strike at the right time, defeat your enemies, and climb the score ladder!

🎮 Features
Random enemy encounters (Slimes & Goblins).

Different attack types with unique conditions:

Basic Strike → always works.

Prime Strike → works if enemy HP is prime.

Modulus Strike → works if enemy HP is divisible by 3.

Score system (points for every successful hit).

Enemy counter-attacks with random damage.

Game ends when either player or enemy is defeated.

Scores are saved to a file for persistence.

📂 Project Structure
src/
│
├── Game.java         # Main game loop
├── Player.java       # Player class
├── Enemy.java        # Abstract base class for enemies
├── SlimeEnemy.java   # Slime enemy with modulus weakness
├── GoblinEnemy.java  # Goblin enemy with prime weakness
├── Attack.java       # Attack option constants
└── StoreScore.java   # Handles saving score to file

👨‍💻 Author
Created by Udo Nieumweijer as a project in Java.
