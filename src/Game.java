import java.util.Random;
import java.util.Scanner;


//MAIN game class
public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Get player's name
        System.out.println("Enter your legend's name: ");
        String playerName = scanner.nextLine();

        //Validate input

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
            } else if (effective) { //attack miss - development
                
            } else if (option == Attack.BASIC) {
                effective = true;
            } else if (option == Attack.PRIME) {
                effective = isPrime(enemy.getHeatlh()); //fix
            } else if (option == Attack.MODULUS) {
                effective = (enemy.getHeatlh() % 3 == 0); //fix
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
            }
        }

        scanner.close();
    }

    public static boolean isPrime(int h){
        if (h <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(h); i++){
            if (h % i == 0) {
                return false;
            }
        }
        return true;
    }
}
