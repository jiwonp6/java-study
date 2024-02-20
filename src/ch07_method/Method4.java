package ch07_method;
// #8-4 메소드 (2024-02-15)
public class Method4 {
    public static void main(String[] args) {
        checkingAge(10);
    }
    public static void checkingAge(int age){
        // 미성년자
        if (age < 18){
            System.out.println("미성년자입니다. 주류 및 담배 판매가 불가합니다.");
            return;     // return 문을 만나면 그 즉시 메소드가 종료
        }
        // 성인       -> if문을 따로 사용하지 않고 return을 이용해 출력 여부 결정
        System.out.println("성인입니다. 주류 및 담배 판매가 가능합니다.");
    }

}
