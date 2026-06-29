package Polymorphism;

package Polymorphism;

class GameCharacter {

    String characterName;

    GameCharacter(String characterName) {
        this.characterName = characterName;
    }

    public void performAttack() {
        System.out.println("Character attacks");
    }
}

class Warrior extends GameCharacter {

    Warrior(String characterName) {
        super(characterName);
    }

    @Override
    public void performAttack() {
        System.out.println(characterName +
                " attacks with Sword");
    }
}

class Mage extends GameCharacter {

    Mage(String characterName) {
        super(characterName);
    }

    @Override
    public void performAttack() {
        System.out.println(characterName +
                " attacks with Magic");
    }
}

class Archer extends GameCharacter {

    Archer(String characterName) {
        super(characterName);
    }

    @Override
    public void performAttack() {
        System.out.println(characterName +
                " attacks with Arrow");
    }
}

public class AdventureGame {

    public static void startBattle(
            GameCharacter[] characters) {

        int warrior = 0;
        int mage = 0;
        int archer = 0;

        System.out.println("Battle Started:\n");

        for (GameCharacter ch : characters) {

            ch.performAttack();

            if (ch instanceof Warrior)
                warrior++;

            else if (ch instanceof Mage)
                mage++;

            else if (ch instanceof Archer)
                archer++;
        }

        System.out.println("\nParticipants Count");
        System.out.println("Warriors : " + warrior);
        System.out.println("Mages : " + mage);
        System.out.println("Archers : " + archer);
    }

    public static void main(String[] args) {

        GameCharacter[] characters = {
                new Warrior("Thor"),
                new Mage("Merlin"),
                new Archer("Robin"),
                new Warrior("Kratos")
        };

        startBattle(characters);
    }
}