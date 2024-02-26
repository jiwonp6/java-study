package ch17_polymorphism.ex4;

public class ChocoCookie extends Cookie {

    @Override
    public void run() {
        System.out.println("초코쿠키가 달립니다!");
    }

    @Override
    public void jump() {
        System.out.println("초코쿠키가 높이 점프합니다!");
    }
    public void specialSkill(){
        System.out.println("초코쿠키가 초콜릿 폭발을 일으킵니다!");
    }
}
