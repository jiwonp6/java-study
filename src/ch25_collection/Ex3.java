package ch25_collection;

import java.util.EmptyStackException;
import java.util.Stack;

public class Ex3 {
    /*
        <웹 브라우저 방문 기록 (Stack 활용)>
        웹 브라우저에서 사용자가 방문한 페이지의 이력을 스택을 사용하여 관리하는 프로그램을 작성하세요.
        사용자가 새로운 페이지로 이동할 때마다 해당 페이지의 URL을 스택에 push하고,
        사용자가 뒤로 가기 버튼을 클릭할 때마다 스택에서 최근 페이지 URL을 pop하여 이전 페이지로 이동할 수 있게 합니다.

        요구사항:
        사용자가 방문한 페이지 URL을 순서대로 스택에 추가(push)합니다.
        사용자가 뒤로 가기를 선택하면, 현재 페이지를 스택에서 제거(pop)하고, 이전 페이지를 조회(peek)합니다.
        입력 예시:

        데이터
        www.example.com
        www.example.com/about
        www.example.com/contact

        출력 예시:
        현재 페이지: www.example.com/contact
        이전 페이지로 돌아갑니다: www.example.com/about
     */

    public static void main(String[] args) {
        Stack<String> page = new Stack<>();

        page.push("www.example.com");
        page.push("www.example.com/about");
        page.push("www.example.com/contact");

        goBack(page);
        goBack(page);
        goBack(page);

    }
    private static void goBack(Stack<String> page) {
        try {
            System.out.println("현재 페이지 : " + page.peek());
            // 뒤로가기
            page.pop();
            System.out.println("이전 페이지로 돌아갑니다. : " + page.peek());
        } catch (EmptyStackException e) {
            System.out.println("마지막 페이지입니다.");
        }
    }

}
