package ch25_collection;

import java.util.Arrays;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        /*
            <문제 1: 배열 정렬하기>
            정수 배열이 주어집니다.
            이 배열을 오름차순으로 정렬한 후 출력하세요.
         */
        int[] numbers = {4, 3, 5, 1, 2};
        Arrays.sort(numbers);
        System.out.println("numbers = " + Arrays.toString(numbers));

        /*
            <문제 2: 배열 검색하기>
            정렬된 정수 배열과 타겟 숫자가 주어집니다.
            타겟 숫자가 배열에 있으면 그 위치를, 없으면 -1을 출력하세요.
         */
        int[] sortedNumbers = {1, 2, 3, 4, 5};
        int target = 3;
        int indexOftarget = Arrays.binarySearch(sortedNumbers, target);
        System.out.println("indexOftarget = " + indexOftarget);

        /*
            <문제 3: 배열 비교하기>
            두 개의 정수 배열이 주어집니다.
            두 배열이 완전히 동일한지 확인하고, 결과를 출력하세요.
         */
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        boolean equals = Arrays.equals(array1, array2);
        System.out.println("equals = " + equals);

        /*
            <문제 4: 배열의 일부 복사하기>
            정수 배열과 시작 인덱스, 끝 인덱스가 주어집니다.
            주어진 범위의 배열 요소를 복사하여 새 배열을 생성하고, 그 배열을 출력하세요.
         */
        int[] original = {1, 2, 3, 4, 5};
        int start = 1;
        int end = 3;
        int[] copyOfRange = Arrays.copyOfRange(original, start, end);
        System.out.println("copyOfRange = " + Arrays.toString(copyOfRange));

        /*
            <문제 5: 배열을 리스트로 변환하기>
            문자열 배열이 주어집니다.
            이 배열을 리스트로 변환하고, 출력하세요.
         */
        String[] fruits = {"Apple", "Banana", "Cherry"};
        List<String> fruitsList = Arrays.asList(fruits);
        System.out.println("fruitsList = " + fruitsList);

    }
}
