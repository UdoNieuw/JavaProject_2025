//Udo Nieuwmeijer - PT.2022.F0G0G7
//Java Project 2025 - Math RPG game
//2025/08/29
public class GoblinEnemy extends Enemy{
    public GoblinEnemy(){
        super("Goblin", 12);
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
