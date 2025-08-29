//Udo Nieuwmeijer - PT.2022.F0G0G7
//Java Project 2025 - Math RPG game
//2025/08/29
public class Player {
    private String playerName;
    private int health;
    private int score;

    public Player(String name){
        this.playerName = name;
        this.health = 20; //Starting life
        this.score = 0; //Starting score
    }

    public String getName() {
        return playerName;
    }

    public int getHealth() {
        return health;
    }

    public int getScore() {
        return score;
    }

    public void takeDamage(int damage) {
        health -= damage;  
    }

    public void addScore(int points){
        score += points;
    }

    public boolean isAlive(){
        return health > 0;
    }
}
