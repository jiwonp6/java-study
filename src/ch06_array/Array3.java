package ch06_array;
// #7-3 배열3 (2024-02-14)
public class Array3 {
    public static void main(String[] args) {

        int[] scores1;   // 배열 변수 선언
        scores1 = new int[]{80, 50, 70, 90, 75, 60};     // 배열 초기화 6개 길이

        int[] scores2 = {80, 50, 70};       // 선언과 초기화 동시에

        // 출력
        System.out.println("<반복문으로 출력1>");
        for (int i = 0; i < scores1.length; i++) {    // scores.length : 배열의 길이
            System.out.println("학생" + (i + 1) + "의 점수 : " + scores1[i]);
        }

        System.out.println("\n<반복문으로 출력2>");
        for (int i = 0; i < scores2.length; i++) {    // scores.length : 배열의 길이
            System.out.println("학생" + (i + 1) + "의 점수 : " + scores2[i]);
        }
        
        /*
            < 배열의 값을 읽는 순서 >
            1. 변수의 값을 읽는다. => 참조값
            2. 변수의 참조값을 통해 실제 배열에 접근한다.
            3. 인덱스를 통해 해당 위치 내용에 접근하고 내용을 읽어온다.
         */
        System.out.println(scores1);  // 배열에 직접 접근 : [I@506e1b77 <- 값이 아니라 주소가 저장됨, 따라서 참조값 반환
                                            // 배열의 내용에 접근하고 싶을 때는 배열[index]로 접근
        System.out.println(scores1[0]);     // ->  80 : 값 반환


    }
}
