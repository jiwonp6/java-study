package ch18_interface.ex3;

public class Mage extends Character implements Attackable{
    // 생성자
    public Mage(String name) {
        super(name);
    }
    @Override
    public void attack(Character character) {
        System.out.println(name + " 이(가) " + character.name + " 을(를) 공격");
    }
}
