package ch12_accessModifier;
// #11 접근제한자 (2024-02-20)
public class Car {
    /* 필드 : 데이터 */
    private int speed;          // 속도
    private boolean isStop;     // 정지여부

    /* 생성자 */


    /* 메소드 */
    // Getter Method : 안전하게 필드에 접근하여 데이터를 가져온다.
    public int getSpeed() {
        if (!isStop){       // 멈춰있지 않을 때 : 시동이 걸렸을 때
            return speed;
        }else {
            return -1;      // 시동이 꺼진 상태 : 속도 -1
        }
    }

    // Setter Method : 안전하게 필드에 값을 설정할 때 사용된다.
    public void setSpeed(int speed) {
        // 세터 메서드에 제약사항 추가
        if (speed >= 0 && speed <= 120){
            this.speed = speed;
        }
    }

    // 시동 유무
    public void setStop(boolean stop) {
        isStop = true;
    }

    // 속도 증감 메소드
    public void speedUp(){         // 제약사항 : 120 이상으로 올라가지 않을 것
        if (speed >= 120){
            this.speed = 120;
            System.out.println("최대 속력입니다.");
            return;
        }
        speed++;

    }
    public void speedDown(){       // 제약사항 : 0 이하로 내려가지 않을 것
        if (speed < 0){
            this.speed = 0;
            System.out.println("최저 속력입니다.");
            return;
        }
        speed--;
    }
    public void printSpeed(){
        System.out.println("속도 : " + speed);
    }

}
