//Udo Nieuwmeijer - PT.2022.F0G0G7
//Java Project 2025 - Math RPG game
//2025/08/29
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class StoreScore {
    //class to store score in text file
    public static void saveScore(String playerName, int score){
        try (PrintWriter out =new PrintWriter(new FileWriter("score.txt",true))){
            out.println(playerName + " " + score);
        } catch (IOException e){
            System.out.println("Err: " + e);
        }
    }
}
