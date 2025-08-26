public class GoblinEnemy extends Enemy{
    public GoblinEnemy(){
        super("Goblin", 10);
    }

    //Goblin weakeness
    @Override
    public boolean Weakness() {
        return isPrime(health);
    }

    private boolean isPrime(int h){
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
