package ch17_polymorphism.ex1;

public class KumhoTire extends Tire{
    // 생성자
    public KumhoTire(String location, int maxRotation) {
        super(location, maxRotation);
    }

    // 메소드
    public boolean roll(){
        if (accumulatedRotation < maxRotation){
            accumulatedRotation++;
            int lifeTime = maxRotation - accumulatedRotation;
            System.out.println("금호 타이어 회전가능, 수명 : " + lifeTime);
            return true;
        }else {
            System.out.println("금호 타이어 회전회전 불가능 " + accumulatedRotation);
            return false;
        }
    }
}
