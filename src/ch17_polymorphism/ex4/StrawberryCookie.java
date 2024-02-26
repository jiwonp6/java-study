package ch17_polymorphism.ex4;

public class StrawberryCookie extends Cookie {

    @Override
    public void run() {
        System.out.println("스트로베리쿠키가 달립니다!");
    }

    @Override
    public void jump() {
        System.out.println("스트로베리쿠키가 높이 점프합니다!");
    }
    public void specialSkill(){
        System.out.println("스트로베리쿠키가 베리 베리 보호막을 형성합니다!");
    }
}
