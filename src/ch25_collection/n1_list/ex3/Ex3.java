package ch25_collection.n1_list.ex3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex3 {
    /*
        <요소 제거>
        문자열을 저장하는 ArrayList를 생성하고, 여러 개의 문자열을 추가하세요.
        그 후, 특정 조건(예: 길이가 5 이하인 문자열)을 만족하는 요소들을 모두 제거하세요.
        최종 리스트를 출력하는 프로그램을 작성하세요.

        > 예시 문자열
        "Hello", "World", "Java" "Programming"
        > 제거 후 리스트에 남은 요소
        "Programming"
     */
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("Hello");
        strList.add("World");
        strList.add("Java");
        strList.add("Programming");

        // 1. 역순으로 for문 접근
        for (int i = (strList.size() - 1); i >= 0; i--) {
            if (strList.get(i).length() <= 5){
                strList.remove(i);
            }
        }

        // 2. 제거할 때마다 인덱스 조정
        for (int i = 0; i < strList.size(); i++) {
            if (strList.get(i).length() <= 5){
                strList.remove(i);
                i--;    // 요소 제거할 때 인덱스 조정
            }
        }

        // 3. 반복자를 사용하여 제거하는 방법 (표준)
        strList.clear();

        strList.addAll(List.of("Hello", "World", "Java", "Programming"));
        Iterator<String> iterator = strList.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            if (next.length() <= 5){
                iterator.remove();
            }
        }
        
        // 결과 출력
        System.out.println(strList);
    }
}
