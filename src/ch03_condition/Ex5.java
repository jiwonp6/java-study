package ch03_condition;
// #4-12 연습문제5(2024-02-08)

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        /*
            사용자 로그인 시스템
            사용자로부터 아이디와 비밀번호를 입력받아,
            미리 설정된 아이디와 비밀번호와 일치하는지 검사하는
            간단한 로그인 시스템을 구현하세요.
            모든 조건이 만족할 때만 "로그인 성공!"을 출력하고,
            아이디 혹은 비밀번호가 일치하지 않으면
            "로그인 실패: 아이디 혹은 비밀번호가 잘못되었습니다."와 같은 메시지를 출력하세요.
         */

        // 변수 설정
        String id;
        String pw;

        String existId = "abc";
        String existPw = "def";

        // id 입력받기
        System.out.println("사용자 아이디를 입력해주세요.");
        Scanner scanner1 = new Scanner(System.in);
        id = scanner1.nextLine();

        // 조건부 출력
        if(id.equals(existId)){
            // pw
            System.out.println("사용자 비밀번호를 입력해주세요.");
            Scanner scanner2 = new Scanner(System.in);
            pw = scanner2.nextLine();
            if(pw.equals(existPw)){
                System.out.println("로그인 성공!");
            }else {
                System.out.println("비밀번호가 잘못되었습니다.");
                System.out.println("로그인 실패!");
            }
        }else{
            System.out.println("사용자 id가 존재하지 않습니다.");
            System.out.println("로그인 실패!");
        }
        
        
    }
}
