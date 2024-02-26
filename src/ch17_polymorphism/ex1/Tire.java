package ch17_polymorphism.ex1;

public class Tire {
    String location;
    int maxRotation;    // 최대 회전수
    int accumulatedRotation = 0;    // 누적 회전수

    // 생성자
    public Tire(String location, int maxRotation) {
        this.location = location;
        this.maxRotation = maxRotation;
    }

    // 메소드
    public boolean roll(){
        if (accumulatedRotation < maxRotation){
            accumulatedRotation++;
            return true;
        }else {
            System.out.println(location + "위치의 타이어 펑크!");
            return false;
        }
    }
}
