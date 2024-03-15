package ch25_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class N2_ArrayUtil {
    public static void main(String[] args) {
        // Arrays : 배열을 다루기 위한 메소드를 제공하는 유틸리티 클래스
        int[] numbers = {9, 4, 6, 2, 8, 3, 5, 1, 7};

        // Arrays.sort() : 정렬
        Arrays.sort(numbers);

        // Arrays.toString() : 배열을 문자열로 변환
        System.out.println("numbers = " + Arrays.toString(numbers));

        // Arrays.binarySearch() : 이진 탐색으로 요소의 index 찾기, 정렬된 후에만 쓸 수 있음
        int index6 = Arrays.binarySearch(numbers, 6);
        System.out.println("6의 index = " + index6);

        // Arrays.fill(배열, 값) : 배열을 특정값으로 채움
        Arrays.fill(numbers, 10);
        System.out.println("10으로만 채워진 numbers = " + Arrays.toString(numbers));

        // Arrays.equals(배열1, 배열2) : 두 배열이 같은지 여부 반환
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 4};
        boolean equals = Arrays.equals(arr1, arr2);
        System.out.println("equals = " + equals);

        // Arrays.deepEquals() : 다차원 배열 비교
        String[][] data1 = {{"a", "b"}, {"c", "d"}};
        String[][] data2 = {{"a", "b"}, {"c", "e"}};
        boolean deepEquals = Arrays.deepEquals(data1, data2);
        System.out.println("deepEquals = " + deepEquals);

        // Arrays.copyOf(원본배열, 복사할 배열 길이) : 배열 복사본을 생성
        int[] originArr = {1, 2, 3, 4, 5};
        int[] copyArr = Arrays.copyOf(originArr, originArr.length);
        System.out.println("copyArr = " + Arrays.toString(copyArr));

        // Arrays.compare() : 배열의 요소 비교
        int compareSame = Arrays.compare(originArr, copyArr);
        int compareDiff1 = Arrays.compare(arr1, arr2);
        int compareDiff2 = Arrays.compare(arr2, arr1);
        System.out.println("compareSame = " + compareSame);     // 같을 때 : 0
        System.out.println("compareDiff1 = " + compareDiff1);     // 다를 때 : -1 (arr1 < arr2)
        System.out.println("compareDiff2 = " + compareDiff2);     // 다를 때 : 1 (arr1 > arr2)

        // Arrays.copyOfRange(배열, 시작 index, 끝 index) : 부분적으로 배열의 일부를 복사
        int[] copyOfRange = Arrays.copyOfRange(originArr, 1, 3);
        System.out.println("copyOfRange = " + Arrays.toString(copyOfRange));

        // Arrays.asList(요소, 요소, ...) : 배열을 고정크기의 리스트로 변환
        String[] strArr = {"a", "b", "c"};
        List<String> list = Arrays.asList(strArr);      // ArrayList 와 다름!
        System.out.println("list = " + list);

        // ArrayList 생성자의 매개변수로 사용될 수 있음.
        ArrayList<String> arrayList = new ArrayList<>(
                Arrays.asList(strArr)
        );
        arrayList.addAll(Arrays.asList("d", "e", "f"));
        System.out.println("arrayList = " + arrayList);

        // Arrays.stream(배열) : 배열을 소스로 하는 stream 생성 => 스트림 API 사용 가능
        Stream<String> stream = Arrays.stream(strArr);
        stream.forEach(System.out::println);

    }
}
