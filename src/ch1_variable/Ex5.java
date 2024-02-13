package ch1_variable;
//#2-17 연습문제 5 - print & read(2024-02-07)

public class Ex5 {
    public static void main(String[] args) {
        /*
            아래와 같이 출력되도록 코드를 작성해주세요.
            이름 : 홍길동
            나이 : 25
            전화 : 010-1234-5678
         */
        String name = "홍길동";
        int age = 25;
        String tel1 = "010", tel2 = "1234", tel3 = "5678";

        //println으로 출력
        System.out.println("<println으로 출력>");
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("전화 : " + tel1 + "-" + tel2 + "-" + tel3);

        System.out.println(" ");

        //printf로 출력
        System.out.printf("<printf로 출력>" + "\n");
        System.out.printf("이름 : %s\n", name);
        System.out.printf("나이 : %s\n", age);
        System.out.printf("전화 : %s-%s-%s\n" ,tel1, tel2, tel3);

        System.out.println(" ");

        //printf로 출력
        System.out.printf("<printf로 출력>" + "\n");
        System.out.printf("이름 : " + name + "\n");
        System.out.printf("나이 : " + age + "\n");
        System.out.printf("전화 : " + tel1 + "-" + tel2 + "-" + tel3);


    }
}
