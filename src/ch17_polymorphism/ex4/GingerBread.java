package ch17_polymorphism.ex4;

public class GingerBread extends Cookie {

    @Override
    public void run() {
        System.out.println("진저브레드맨이 달립니다!");
    }

    @Override
    public void jump() {
        System.out.println("진저브레드맨이 작게 점프합니다!");
    }

}
