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
        System.out.println("Welcome Adventure, " + player.getName() + " !");

        //Encounter from a Random enemy
        Random random = new Random();
        Enemy enemy;
        if (random.nextBoolean()) {
            enemy = new SlimeEnemy();
        } else {
            enemy = new GoblinEnemy();
        }
        
        //Enemy appears
        System.out.println("A wild encounter with a " + enemy.getEnemyType() + " appeared with HP: " + enemy.getHeatlh());

        scanner.close();
    }
}
