package ch07_method;
// #8-13 연습문제 (2024-02-15)
public class Ex4 {
    public static void main(String[] args) {
        /*
            <배열에서 최소값과 최대값 찾기>
            배열 내의 최소값과 최대값을 찾아 출력하는 메소드 findMinAndMax를 작성하세요.
         */
        int[] array = {5, 15, 10, 7};
        int[] result = findMinAndMax(array);

        int max = result[0];
        int min = result[1];

        System.out.printf("max : %d, min : %d", max, min);
    }

    // 최대 최소 찾는 메서드
    public static int[] findMinAndMax(int[] array){
        // 변수 설정
        int max = array[0];
        int min = array[0];

        // 최대 최소 찾기
        for (int i = 0; i< array.length; i++){
            if (max <= array[i]){
                max = array[i];
            }
            if (min >= array[i]){
                min = array[i];
            }
        }

        // 리턴값 함수로 저장
        int[] result = new int[2];
        result[0] = max;
        result[1] = min;

        return result;
    }

}
