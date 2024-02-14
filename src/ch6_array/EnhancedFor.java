package ch6_array;
// #7-7 향상된 for문 (2024-02-14)
public class EnhancedFor {
    public static void main(String[] args) {
        /*
            향상된 for 문 : java 5 버전부터 사용가능
            배열 등 반복 가능한 요소를 각각 탐색하는 for 문 (for - each)
         */
        
        // 기존 for 문
        System.out.println("<기존 for 문>");
        int[] nums = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < nums.length; i++){
            int num = nums[i];          // 배열의 구성요소
            System.out.print(num + "\t");    // 배열의 구성요소를 출력
        }

        // 향상된 for 문
        /*
            for( 타입변수명 : 배열변수명 ){
                반복을 수행할 코드(배열의 길이만큼 반복)
            }

            - 장점
            1. 기존 코드보다 가독성이 높고, 간결하다.
            2. 반복 횟수를 명시하거나 계산할 필요가 없다.
            3. 배열의 요소에 인덱스로 접근할 필요가 없다.

            - 단점
            1. 인덱스 값이 감춰져있어 인덱스를 사용해야 하는 경우 사용할 수 없다.

         */
        System.out.println("\n<향상된 for 문>");
        for (int num : nums) {      // nums 배열 안의 구성요소를 모두 순회
            System.out.print(num + "\t");    // 배열의 구성요소를 출력
        }
        
    }
}
