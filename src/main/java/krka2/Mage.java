package krka2;

public class Mage implements Character {
    private int health = 100;
    private int attackPower = 40;
    private int x, y;

    @Override
    public String getName() { return "Маг"; }
    @Override
    public int getHealth() { return 100; }
    @Override
    public int getAttackPower() { return 40; }
    @Override
    public void setPosition(int x, int y) { this.x = x; this.y = y; }
    @Override
    public int[] getPosition() { return new int[]{x, y}; }
}
