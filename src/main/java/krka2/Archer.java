package krka2;

public class Archer implements Character {
    private int health = 120;
    private int attackPower = 30;
    private int x, y;

    @Override
    public String getName() { return "Лучник"; }
    @Override
    public int getHealth() { return 70; }
    @Override
    public int getAttackPower() { return 400; }
    @Override
    public void setPosition(int x, int y) { this.x = x; this.y = y; }
    @Override
    public int[] getPosition() { return new int[]{x, y}; }
}
