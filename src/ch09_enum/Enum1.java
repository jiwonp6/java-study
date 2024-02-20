package ch09_enum;
// #9 열거형 - Week (2024-02-16)
public class Enum1 {
    public static void main(String[] args) {
        // 필드를 통해 열거형에 접근하여 변수 선언
        Week today = Week.MONDAY;

        // 조건문을 통해 열거형에 접근
        switch (today){
            case SUNDAY :
                System.out.println("일요일");
                break;
            case MONDAY :
                System.out.println("월요일");
                break;
            case TUESDAY :
                System.out.println("화요일");
                break;
            case WEDNESDAY :
                System.out.println("수요일");
                break;
            case THURSDAY :
                System.out.println("목요일");
                break;
            case FRIDAY :
                System.out.println("금요일");
                break;
            case SATURDAY :
                System.out.println("토요일");
                break;
        }

        // 반복문을 통해 열거형의 종류 확인
        for (Week day : Week.values()){     // 열거형을 배열로 반환
            System.out.println(day);
        }

    }
}
