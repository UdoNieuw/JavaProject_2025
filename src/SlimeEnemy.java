//Udo Nieuwmeijer - PT.2022.F0G0G7
//Java Project 2025 - Math RPG game
//2025/08/29
public class SlimeEnemy extends Enemy{
    public SlimeEnemy() {
        super("Slime", 9);
    }

    //Slime weakeness
    @Override
    public boolean Weakness() {
        return health % 3 == 0;
    }
}
