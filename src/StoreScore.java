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
