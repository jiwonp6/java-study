package ch18_interface.ex3;

public class Healer extends Character implements Healable{
    public Healer(String name) {
        super(name);
    }

    @Override
    public void heal(Character character) {
        System.out.println(name + " 이(가) " + character.name + " 을(를) 치유");
    }
}
