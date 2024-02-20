package ch04_loop;
// #5-19  연습문제 - flag (2024-02-13)
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        /*
            이름과 나이를 입력받고 출력하는 앱

            이름을 입력받을 때 'q'라고 입력 받으면 종료된다.
         */


        // 변수 입력
        String name;
        int age;

        // 변수 입력받기 - flag 사용 : while문의 실행 여부를 담고 있는 값
        boolean isRun = true;
        while (isRun){
            System.out.println("이름을 입력해주세요.(q 입력시 종료)");
            Scanner scanner1 = new Scanner(System.in);
            name = scanner1.nextLine();

            if (name.equals("q")){
                isRun = false;  // 반복조건 탈출
            }else {
                System.out.println("나이를 입력해주세요.");
                Scanner scanner2 = new Scanner(System.in);
                age = scanner2.nextInt();
                System.out.println("이름 : " + name);
                System.out.println("나이 : " + age);
                isRun = false;
            }
        }

        // 변수 입력받기 - if, break 사용
        while (true){
            System.out.println("이름을 입력해주세요.(q 입력시 종료)");
            Scanner scanner1 = new Scanner(System.in);
            name = scanner1.nextLine();
            if (name.equals("q")){
                break;
            }else {
                System.out.println("나이를 입력해주세요.");
                Scanner scanner2 = new Scanner(System.in);
                age = scanner2.nextInt();
                System.out.println("이름 : " + name);
                System.out.println("나이 : " + age);
                break;
            }
        }

    }
}
