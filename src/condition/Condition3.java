package condition;
// #4-3  조건문3(2024-02-08)
public class Condition3 {
    public static void main(String[] args) {
        // 변수 설정
        int age = 10;

        // 조건문
        if (age >= 8 && age <= 13){

            System.out.println("초등학생입니다.");

        }
        if (age >= 14 && age <= 16){

            System.out.println("중학생입니다.");

        }
        if (age >= 16 && age <= 19){

            System.out.println("고등학생입니다.");

        }
        if (age >= 20){

            System.out.println("성인입니다.");

        }
    }
}

