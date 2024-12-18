package krka2;

public interface Character {
    String getName();
    int getHealth();
    int getAttackPower();
    void setPosition(int x, int y);
    int[] getPosition();
}
