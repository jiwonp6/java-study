package ch17_polymorphism.ex1;

public class HankookTire extends Tire{
    // 생성자
    public HankookTire(String location, int maxRotation) {
        super(location, maxRotation);
    }

    // 메소드
    public boolean roll(){
        if (accumulatedRotation < maxRotation){
            accumulatedRotation++;
            int lifeTime = maxRotation - accumulatedRotation;
            System.out.println("한국 타이어 회전가능, 수명 : " + lifeTime);
            return true;
        }else {
            System.out.println("한국 타이어 펑크, 누적 회전수 : " + accumulatedRotation);
            return false;
        }
    }
}
