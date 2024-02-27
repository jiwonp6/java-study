package ch18_interface.interface5;

public class Penguin extends Animal implements Swimable, Flyable{
    @Override
    public void sound() {
        System.out.println("펭펭");
    }

    @Override
    public void swim() {
        System.out.println("펭귄이 수영합니다.");
    }

    @Override
    public void fly() {
        System.out.println("펭귄이 날개짓을 합니다.");
    }
}
