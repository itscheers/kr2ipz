package krka2;

import java.util.*;

public class Arena {
    private List<Character> characters = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public void addCharacter(Character character) {
        characters.add(character);
        notifyObservers(character);
    }

    public void moveCharacter(Character character, int x, int y) {
        character.setPosition(x, y);
        System.out.println(character.getName() + " перемістився на позицію (" + x + ", " + y + ")");
    }

    public void notifyObservers(Character character) {
        for (Observer observer : observers) {
            observer.update(character);
        }
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }


    public void displayHealth(Character character) {
        System.out.println(character.getName() + " | Здоров'я: " + character.getHealth());
    }

    public void displayAttack(Character character) {
        System.out.println(character.getName() + " | Атака: " + character.getAttackPower());
    }

    public void displayCharacterInfo(Character character) {
        System.out.println(character.getName() + " | Здоров'я: " + character.getHealth() +
                " | Атака: " + character.getAttackPower() +
                " | Координати: (" + character.getPosition()[0] + ", " + character.getPosition()[1] + ")");
    }
}
