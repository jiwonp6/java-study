package ch17_polymorphism.ex2;

public class Bicycle extends Transport {
    @Override
    public void move() {
        System.out.println("자전거가 길을 따라 pedaling합니다.");
    }
}
