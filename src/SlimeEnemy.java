public class SlimeEnemy extends Enemy{
    public SlimeEnemy() {
        super("Slime", 20);
    }

    //Slime weakeness
    @Override
    public boolean Weakness() {
        return health % 3 == 0;
    }
}
