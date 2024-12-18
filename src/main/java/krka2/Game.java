package krka2;

public class Game {
    public static void main(String[] args) {
        Arena arena = new Arena();
        CharacterObserver observer = new CharacterObserver();
        arena.addObserver(observer);

        Character warrior = CharacterFactory.createCharacter("воїн");
        Character mage = CharacterFactory.createCharacter("маг");
        Character archer = CharacterFactory.createCharacter("лучник");

        arena.addCharacter(warrior);
        arena.addCharacter(mage);
        arena.addCharacter(archer);

        System.out.println("\nІнформація про персонажів після додавання:");
        arena.displayCharacterInfo(warrior);
        arena.displayCharacterInfo(mage);
        arena.displayCharacterInfo(archer);

        arena.moveCharacter(warrior, 2020, 2021);
        arena.moveCharacter(mage, 2022, 2023);
        arena.moveCharacter(archer, 2024, 2025);

        System.out.println("\nІнформація про персонажів після переміщення:");
        arena.displayCharacterInfo(warrior);
        arena.displayCharacterInfo(mage);
        arena.displayCharacterInfo(archer);
    }
}
