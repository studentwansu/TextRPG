package regame;

public class Staff extends Weapon{

    public Staff() {
        super("지팡이", 8);
    }

    @Override
    public void specialEffect() {
        System.out.println("🔥파이어볼!");
    }
}
