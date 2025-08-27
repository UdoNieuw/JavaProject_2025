public abstract class Enemy { //Method that will be override by Enemy types classes
    protected String enemyType;
    protected int health;
    
    public Enemy(String enemyType, int health){
        this.enemyType = enemyType;
        this.health = health;
    }

    public String getType(){
        return enemyType;
    }

    public int getHeatlh(){
        return health;
    }

    public void takeDamage(int damage){
        health -= damage;
    }

    public void kill(){ //kill command - development
        health = 0;
    }
    public boolean isAlive(){
        return health > 0;
    }
    //Weakness
    public abstract boolean Weakness(); 
}