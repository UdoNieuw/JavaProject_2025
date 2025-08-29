//Udo Nieuwmeijer - PT.2022.F0G0G7
//Java Project 2025 - Math RPG game
//2025/08/29
import java.util.Random;
import java.util.Scanner;

//MAIN game class
public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Intro
        System.out.println("Welcome to Math quest: The Enchanted Numbers");

        //Get player's name
        System.out.println("Enter your legend's name: ");
        String playerName = scanner.nextLine();

        //Validate input
        if (!playerName.matches("[a-zA-Z]+")){
            System.out.println("Invalid input");
            scanner.close();
            return; //stop game if invalid
        }

        //Create player
        Player player = new Player(playerName);
        System.out.println("Welcome Adventure, " + player.getName() + "!");
        System.out.println(" "); ///n

        //Encounter from a Random enemy
        Random random = new Random();
        Enemy enemy;
        if (random.nextBoolean()) {
            enemy = new SlimeEnemy();
        } else {
            enemy = new GoblinEnemy();
        }
        
        //Enemy appears
        System.out.println("A wild encounter with a " + enemy.getType() + " appeared with HP: " + enemy.getHeatlh());
        System.out.println(" "); ///n

        //Combat loop
        while (player.isAlive() && enemy.isAlive()) {
            //Show attack options
            System.out.println("Choose your attack:");
            System.out.println(" "); ///n
            System.out.println("1.Basic Strike (always works)");
            System.out.println("2.Prime Strike (works if enemy HP is prime)");
            System.out.println("3.Modulus Strike (works if enemy HP divisible by 3)");
            System.out.println(" "); ///n
            System.out.println("Attack: ");

            int option = scanner.nextInt();

            boolean effective = false;
            
            //Check attack to see if effective
            if (option == 6) { //kill command - development
                effective = true;
                enemy.kill();
            } else if (option == 4) { 
                effective = false;  //attack miss - development
            } else if (option == Attack.BASIC) {
                effective = true;
            } else if (enemy.getType().equals("Slime")){ //Check if Slime
                if(option == Attack.MODULUS && enemy.Weakness() == true){ //Check if attack is correct and weakness is true
                    effective = true;
                }
                else{
                    effective = false;
                }
            } else if (enemy.getType().equals("Goblin")){ //Check if Goblin
                if(option == Attack.PRIME && enemy.Weakness() == true){ //Check if attack is correct and weakness is true
                    effective = true;
                }
                else{
                    effective = false;
                }
            }

            //Deal damage
            if (effective) {
                enemy.takeDamage(3); //Damage dealt
                player.addScore(10); //Add score
                System.out.println("Attack was effective! " + enemy.getType() + " has " + enemy.getHeatlh() + " HP left");

            } else { 
                System.out.println("Attack was ineffective!");
            }

            //Check enemy health - End success
            if (!enemy.isAlive()) {
                System.out.println("*You win*");
                System.out.println("You succesfully defeated the " + enemy.getType());
                System.out.println("Final score: " + (player.getScore()));
                break;
            }

            //Enemy counter attack
            int enemyDamage = random.nextInt(6 - 3 + 1) + 3;
            player.takeDamage(enemyDamage);
            System.out.println(enemy.getType() + " deals: " + enemyDamage + " damage!");
            System.out.println(" "); ///n
            System.out.println(player.getName() + " has " + player.getHealth() + " HP left");

            //Check player health - End failure
            if (!player.isAlive()) {
                System.out.println("!You died!");
                System.out.println("Final score: " + (player.getScore()));
                StoreScore.saveScore(player.getName(),player.getScore());
            }
        }

        scanner.close();
    }
}
