public abstract class Enemy { //Method that will be override by Enemy types classes
    protected String enemyType;
    protected int health;
    
    public Enemy(String enemyType, int health){
        this.enemyType = enemyType;
        this.health = health;
    }

    public String getEnemyType(){
        return enemyType;
    }

    public int getHeatlh(){
        return health;
    }

    public void takeDamage(){
        health -= health;
    }

    //Weakness
    public abstract boolean Weakness(); 
}