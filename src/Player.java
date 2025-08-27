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

    public void takeDamage() {
        health -= damage;  
    }

    public void addScore(int points){
        score += points;
    }

    public boolean isAlive(){
        return health > 0;
    }
}
