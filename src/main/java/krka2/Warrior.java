package krka2;

public class Warrior implements Character {
    private int health = 150;
    private int attackPower = 20;
    private int x, y;

    @Override
    public String getName() { return "Воїн"; }
    @Override
    public int getHealth() { return 200; }
    @Override
    public int getAttackPower() { return 150; }
    @Override
    public void setPosition(int x, int y) { this.x = x; this.y = y; }
    @Override
    public int[] getPosition() { return new int[]{x, y}; }
}

