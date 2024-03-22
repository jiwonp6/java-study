package quiz.quiz5.q4;

import java.util.*;

public class Quiz04 {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>(
                List.of("지갑", "여권", "선글라스", "책", "삼각대", "충전기", "지도", "겨울옷")
        );

        // 원본
        System.out.print("원본 물품 리스트 : ");
        for (String item : items) {
            System.out.print(item + " ");
        }
        System.out.println("");

        // 물품 알파벳 정렬
        Collections.sort(items);
        System.out.print("정렬 후 물품 리스트 : ");
        for (String item : items) {
            System.out.print(item + " ");
        }
        System.out.println("");

        // 물품 순서 뒤집기
        Collections.reverse(items);
        System.out.print("뒤집은 후 물품 리스트 : ");
        for (String item : items) {
            System.out.print(item + " ");
        }
        System.out.println("");

        // 물품 셔플
        Collections.shuffle(items);
        System.out.print("셔플 후 물품 리스트 : ");
        for (String item : items) {
            System.out.print(item + " ");
        }
        System.out.println("");

        // 물품 추가
        items.add("휴대폰");
        items.add("카메라");
        items.add("책");
        System.out.print("물품 추가 후 물품 리스트 : ");
        for (String item : items) {
            System.out.print(item + " ");
        }
        System.out.println("");

        // 책 빈도수
        int bookFrequency = Collections.frequency(items, "책");
        System.out.println("'책' 의 빈도수 : " + bookFrequency);

        // 중복물품 제거
        Set<String> itemsSet = new HashSet<>();
        for (String item : items) {
            itemsSet.add(item);
        }
        System.out.print("중복 제거 후 리스트 : ");
        for (String item : itemsSet) {
            System.out.print(item + " ");
        }
        System.out.println("");

        // 물품 찾기
        String min = Collections.min(items);
        System.out.print("가장 중요한 물품(최솟값) : " + min);

    }
}
