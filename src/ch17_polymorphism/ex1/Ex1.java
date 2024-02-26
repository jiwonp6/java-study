package ch17_polymorphism.ex1;

public class Ex1 {
    /*
        <자동차의 타이어 관리 시스템을 구현하라.>

        <주어진 조건>
        자동차는 4개의 타이어
            : 앞왼쪽, 앞오른쪽, 뒤왼쪽, 뒤오른쪽
        모든 타이어의 최대 회전 수(maxRotation)
            : 타이어 수명 -> 타이어가 회전할 때마다 누적 회전 수(accumulatedRotation)가 증가
                           누적 회전 수가 최대 회전 수에 도달하면 타이어는 펑크
        타이어 펑크 -> 해당 타이어는 "HankookTire" 또는 "KumhoTire"로 교체
                     각 타이어 교체 시, 교체되는 타이어의 위치와 새로운 최대 회전 수 주어짐
        자동차가 달릴 때
            : 모든 타이어는 회전 기능(roll)을 호출,  회전 여부 확인
              -> 정상 회전 : true / 펑크 : false
        자동차가 달릴 때
            : 모든 타이어의 회전 여부를 체크, 펑크 난 타이어가 있으면 즉시 멈추고 해당 타이어를 교체
              이 과정은 자동차가 5번 달릴 때까지 반복

        구현해야 할 클래스:

        Tire 클래스: 타이어의 기본 정보(위치, 최대 회전 수, 누적 회전 수)와 기본 회전 기능을 구현한다.
        HankookTire 클래스: Tire 클래스를 상속받아 특정 브랜드("Hankook")의 타이어로 구현한다.
                           회전 기능을 오버라이드하여 특정 조건에서 펑크를 나타내는 메시지를 출력한다.
        KumhoTire 클래스: Tire 클래스를 상속받아 또 다른 브랜드("Kumho")의 타이어로 구현한다.
                         회전 기능을 오버라이드하여 특정 조건에서 펑크를 나타내는 메시지를 출력한다.
        Car 클래스: 4개의 타이어 객체를 관리, 회전 여부를 체크하여 필요에 따라 타이어를 교체하는 기능을 구현한다.
        CarExample 클래스: Car 객체를 생성, 달릴 때마다(5번)의 상황을 시뮬레이션한다.
        힌트:

        타이어의 roll 메서드는 타이어가 정상적으로 회전할 수 있으면 true를 반환하고,
        그렇지 않으면 false를 반환하여 타이어 교체가 필요함을 알린다.
        Car 클래스의 run 메서드는 자동차가 달릴 때마다 모든 타이어의 roll 메서드를 호출하고, 필요한 경우 타이어를 교체한다.
     */
    public static void main(String[] args) {
        Car car = new Car();
        for (int i = 0; i <= 5; i++) {
            int problemLocation = car.run();

            switch (problemLocation){
                case 1 :
                    System.out.println("frontRight 타이어 한국 타이어로 교체");
                    car.frontRight = new HankookTire("frontRight", 10);
                    break;
                case 2 :
                    System.out.println("frontLeft 타이어 금호 타이어로 교체");
                    car.frontRight = new KumhoTire("frontLeft", 15);
                    break;
                case 3 :
                    System.out.println("backRight 타이어 한국 타이어로 교체");
                    car.frontRight = new HankookTire("backRight", 7);
                    break;
                case 4 :
                    System.out.println("backLeft 타이어 한국 타이어로 교체");
                    car.frontRight = new HankookTire("backLeft", 12);
                    break;
            }
            System.out.println("===============다음 실행===============\n");
        }
    }
}
