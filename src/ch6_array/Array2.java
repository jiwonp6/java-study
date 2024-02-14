package ch6_array;
// #7-2 배열2 (2024-02-14)
public class Array2 {
    public static void main(String[] args) {
        /*
            배열 : 같은 타입의 변수를 반복적으로 선언할 때 동일한 타입을 연속된 메모리 공간에 저장하는 자료 구조
         */
        
        // 배열변수 선언
        int[] scores;            // int 타입의 배열 변수를 선언
        scores = new int[6];     // 6칸의 배열 생성 [__|__|__|__|__|__]

        // 배열의 값을 초기화
        scores[0] = 80;
        scores[1] = 50;
        scores[2] = 70;
        scores[3] = 90;
        scores[4] = 75;
        //scores[5] = 60;       // 배열의 초기값을 선언하지 않으면 자동으로 초기값이 초기값으로 초기화( <- int라서 0)
                                    // 기본 타입의 초기값 : 숫자는 0, 실수는 0.0, boolean은 false
                                    // 참조 타입의 초기값 : null
        //scores[6] = 100;

        // 출력
        System.out.println("학생1의 점수 : " + scores[0]);
        System.out.println("학생2의 점수 : " + scores[1]);
        System.out.println("학생3의 점수 : " + scores[2]);
        System.out.println("학생4의 점수 : " + scores[3]);
        System.out.println("학생5의 점수 : " + scores[4]);
        System.out.println("학생6의 점수 : " + scores[5]);
        //System.out.println("학생7의 점수 : " + scores[6]);
                // <- ArrayIndexOutOfBoundsException 에러 발생 : 배열 범위 초과

        // 반복문으로 출력 (배열을 사용하면 반복문으로 리팩토링 할 수 있다.)
        System.out.println("\n<반복문으로 출력>");
        for (int i = 0; i < scores.length; i++){    // scores.length : 배열의 길이
            System.out.println("학생" + (i + 1) + "의 점수 : " + scores[i]);
        }
    }
}
