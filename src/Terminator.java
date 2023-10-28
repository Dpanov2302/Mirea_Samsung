public class Terminator extends Unit{

    private int bullets  = 25;

    public Terminator(String name) {
        super(name);
        health = 150;
        power = 30;
    }

    @Override
    public void attack(Unit unit) {
        if (bullets > 0) {
            super.attack(unit);
            bullets -= 1;
        }
        else
            System.out.println("I need more bullets!");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
