class GameCharacter {

    String characterName;

    GameCharacter(String characterName) {
        this.characterName = characterName;
    }

    String performAttack() {
        return characterName + " attacks.";
    }
}



class Warrior extends GameCharacter {

    Warrior(String characterName) {
        super(characterName);
    }

    @Override
    String performAttack() {
        return characterName + " attacks with a Sword!";
    }
}


class Mage extends GameCharacter {

    Mage(String characterName) {
        super(characterName);
    }

    @Override
    String performAttack() {
        return characterName + " casts a Fireball!";
    }
}


class Archer extends GameCharacter {

    Archer(String characterName) {
        super(characterName);
    }

    @Override
    String performAttack() {
        return characterName + " shoots an Arrow!";
    }
}


public class AdventureGame {

    static void startBattle(GameCharacter[] characters) {

        int warriorCount = 0;
        int mageCount = 0;
        int archerCount = 0;

        System.out.println("===== Battle Starts =====");

        for (GameCharacter character : characters) {

            // Runtime Polymorphism
            System.out.println(character.performAttack());

            if (character instanceof Warrior) {
                warriorCount++;
            }
            else if (character instanceof Mage) {
                mageCount++;
            }
            else if (character instanceof Archer) {
                archerCount++;
            }
        }

        System.out.println("\n===== Participants =====");
        System.out.println("Warriors : " + warriorCount);
        System.out.println("Mages    : " + mageCount);
        System.out.println("Archers  : " + archerCount);
    }

    public static void main(String[] args) {

        GameCharacter[] characters = {
                new Warrior("Arjun"),
                new Mage("Merlin"),
                new Archer("Robin"),
                new Warrior("Bhima"),
                new Archer("Legolas")
        };

        startBattle(characters);
    }
}