package ch24_generic.ex2;

public class Ex2 {
    /*
        <제네릭 메서드를 이용한 요소 검색>
        [문제 설명]
        어떤 배열에서 주어진 요소가 몇 번째 위치에 있는지를 찾는 제네릭 메서드 findIndex를 구현합니다.
        이 메서드는 배열과 찾고자 하는 요소를 매개변수로 받고, 요소가 배열 내에 있으면 해당 요소의 인덱스를, 없으면 -1을 반환해야 합니다.

        [요구 사항]
        메서드 시그니처 정의:
            findIndex 메서드는 제네릭 타입 T의 배열 T[]와 검색할 요소 T를 매개변수로 받습니다.
            리턴 타입은 int입니다.
        배열 내 요소 검색:
            주어진 요소가 배열 내에 존재하는지 검색하고, 있으면 해당 인덱스를, 없으면 -1을 반환합니다.
        제네릭 메서드 구현:
            findIndex 메서드는 제네릭 타입을 사용하여 어떤 타입의 배열에 대해서도 작동해야 합니다.

        [예상 출력 결과]
        intArray에서 3의 인덱스: 2
        stringArray에서 "generic"의 인덱스: 2
     */
        public static void main(String[] args) {
            Integer[] intArray = {1, 2, 3, 4, 5};
            String[] stringArray = {"hello", "world", "generic", "method"};

            int intIndex = findIndex(intArray, 2);
            System.out.println("intArray에서 3의 인덱스: " + intIndex);

            int stringIndex = findIndex(stringArray, "generic");
            System.out.println("stringArray에서 generic의 인덱스: " + stringIndex);
        }

        static <T> int findIndex(T[] array, T element){
            for (int i = 0; i < array.length; i++) {
                if (array[i].equals(element)){
                    return i;
                }
            }
            return -1;
        }
}
