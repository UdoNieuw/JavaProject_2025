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

        scanner.close();
    }
}
