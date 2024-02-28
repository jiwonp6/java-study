package ch18_interface.ex5;

public class Observer implements Movable{
    @Override
    public void move() {
        System.out.println("옵저버가 떠다닙니다.");
    }
}
