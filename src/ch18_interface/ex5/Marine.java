package ch18_interface.ex5;

public class Marine implements Attackable, Movable{
    @Override
    public void attack() {
        System.out.println("마린이 총을 쏩니다.");
    }

    @Override
    public void move() {
        System.out.println("마린이 이동합니다.");
    }
}
