package test.Q6;

public class GameCharacter {
    // 필드
    String name;
    int level;
    int health;

    // 생성자
    public GameCharacter(String name, int health) {
        this.name = name;
        this.health = health;
    }

    // 메소드
    void attack(){
        System.out.println(name + "의 공격!");
    }

    void takeDamage(int damage){
        health -= damage;
        System.out.println(name + "는 " + damage + "의 피해를 입었습니다.");
        System.out.println("체력이 " + health + " 남았습니다.");
    }
}
