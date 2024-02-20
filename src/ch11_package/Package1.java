package ch11_package;
// #11 패키지 (2024-02-20)

import ch10_class2.ex3.Book;
import ch11_package.person1.Person;

import java.util.Scanner;

// import문
// 전체 경로를 적는 대신 클래스를 가져온다.
// 패키지 안에 여러가지 사용하는 경우 -> * 사용 (클래스명 생략 가능해짐)

// 패키지를 사용하는 경우, 항상 코드 첫 줄에 패키지 이름이 선언된다.
// 패키지 먼저 만들고, 클래스 생성 -> IDE에서 자종 선언
public class Package1 {
    /*
        패키지 : 클래스와 인터페이스 등을 묶어놓은 컨테이너
                (파일로 구성 디렉토리, 폴더)
        => 코드의 모듈화, 이름 충돌 방지, 재사용 등을 위해 사용함.
     */

    public static void main(String[] args) {
        Data data = new Data();
        // 서로 다른 패키지에서 사용하려면 'public' 키워드 필요
        // 패키지에 접근하려면, 패키지 전체 경로를 포함해 클래스를 적어줘야 한다.
        ch11_package.person1.Person person = new Person();
        Book book = new Book("0","0");

        // 다른 패키지 위치의 클래스를 import -> 패키지명 생략하고 클래스 이름으로만 사용 가능
        Person person1 = new Person();

        // 자바 기본 라이브러리와 다른 라이브러리 사용 시 -> 다른 패키지의 클래스를 import 해서 사용
        Scanner scanner = new Scanner(System.in);

        // 클래스 이름이 중복되는 경우 패키지 이름으로 구분하여 사용
        ch11_package.person2.Person person2 = new ch11_package.person2.Person();
    }

}
