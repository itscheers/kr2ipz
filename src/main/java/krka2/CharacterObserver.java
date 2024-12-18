package krka2;

public class CharacterObserver implements Observer {
    @Override
    public void update(Character character) {
        System.out.println("Спостерігач: Додано нового персонажа - " + character.getName());
    }
}

