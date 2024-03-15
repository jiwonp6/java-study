package quiz.quiz4.q2;

import java.util.Arrays;

public class Quiz02 {
    public static void main(String[] args) {
        // 필드
        int maxAge = 0;
        int kimNum = 0;
        String information = "김철수,30,kimcs@gmail.com;이영희,25,younghee@naver.com;박보검,22,bogum@daum.net;김민아,35,mina@gmail.com";

        // 정보 배열에 담기 & 출력
        String[] informations = information.split(";");
        String[][] elements = new String[informations.length][3];

        System.out.println("<사용자 정보>");
        for (int i = 0; i < informations.length; i++) {
            String[] element = informations[i].split(",");
            for (int j = 0; j < 3; j++) {
                elements[i][j] = element[j];
                switch (j) {
                    case 0:
                        System.out.print("이름 : ");
                        break;
                    case 1:
                        System.out.print(", 나이 : ");
                        break;
                    case 2:
                        System.out.print(", 이메일 : ");
                }
                System.out.print(elements[i][j]);
            }
            System.out.println();
        }

        System.out.println("\"gmail.com\" 도메인 사용자: ");
        for (int i = 0; i < informations.length; i++) {
            // "gmail.com" 도메인 사용자 구하고 출력
            if (elements[i][2].contains("gmail.com")){
                System.out.println("- " + elements[i][0]);
            }
            // 가장 나이가 많은 사용자 구하기
            if (maxAge < Integer.parseInt(elements[i][1])){
                maxAge = i;
            }
            // 이름에 "김"이 포함된 사용자 수 구하기
            if (elements[i][0].contains("김")){
                ++kimNum;
            }


        }

        // 가장 나이가 많은 사용자 출력
        System.out.println("가장 나이가 많은 사용자:");
        System.out.println("- 이름: " + elements[maxAge][0] + ", 나이: " + elements[maxAge][1]);

        // 이름에 "김"이 포함된 사용자 수 출력
        System.out.println("이름에 \"김\"이 포함된 사용자 수: " + kimNum);

    }

}

