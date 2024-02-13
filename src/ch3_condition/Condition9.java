package ch3_condition;
// #4-9  switch 문2(2024-02-08)
public class Condition9 {
    public static void main(String[] args) {

        // break 문 없이 switch 문을 사용하게 될 경우 ~ 해당 case문 이후 모든 case를 수행
        int time = 10;

        switch (time){
            case 8:
                System.out.println("출근 시간입니다.");
            case 9:
                System.out.println("입실 시간입니다.");
            case 10:
                System.out.println("수업 시간입니다.");
            case 13:
                System.out.println("점심 시간입니다.");
            default:
                System.out.println("집에 갈 시간입니다.");
        }
    }
}
