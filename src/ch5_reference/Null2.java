package ch5_reference;
// #9 NullPointerException(NPE) (2024-02-16)
public class Null2 {
    public static void main(String[] args) {
        // Data data = null;
        // data.value1 = 100;
        // null.value1 = 100;   <- 참조할 주소가 존재하지 않는다.
        // NullPointerException 이 발생하며 프로그램이 종료

        Data data = new Data();
        data.value1 = 100;

        System.out.println(data.value1);
    }
}
