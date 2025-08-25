public class Player {
    private String playerName;
    private int health;
    private int score;

    public Player(String name){
        this.playerName = playerName;
        this.health = 20;
        this.score = 0;
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
        health = health - damage;  
    }

    public void addScore(){
        score = score + points;
    }

    public boolean isAlive(){
        return health > 0;
    }
}
