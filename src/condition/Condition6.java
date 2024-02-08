package condition;
// #4-6  조건문6(2024-02-08)
public class Condition6 {
    public static void main(String[] args) {
        // 가격이 10,000원 이상일 때, 1000원 할인
        // 나이가 10살 이하일 때 1000원 할인

        // 변수
        int price = 10000;
        int age = 10;
        int dc = 0;

        // 조건문
        if (price >= 10000){
            dc += 1000;
            System.out.println("만원 이상 구매로 1000원 할인이 적용되었습니다.");
        }
        if (age <= 10) {
            dc += 1000;
            System.out.println("10살 이하 고객으로 1000원 할인이 적용되었습니다.");
        }
        // 이때 else - if 를 사용하면 각각의 할인을 적용하지 못한다.
        // 각각의 조건이 독립 조건일 때 if 문을 개별적으로 사용한다
        // 모두 연관되는 조건일 때 else - if 문을 사용한다.

        // 출력
        System.out.println("모두 " + dc + "원 할인되었습니다.");

    }
}
