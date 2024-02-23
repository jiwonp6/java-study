package test.Q6;

public class Q6 {
    public static void main(String[] args) {
        GameCharacter character1 = new GameCharacter("전사", 200);
        GameCharacter character2 = new GameCharacter("마법사", 100);

        character1.attack();
        character1.takeDamage(10);
        character2.attack();
        character2.takeDamage(20);

    }
}
