package ch5_reference;
// #9 Data 메인 클래스 (2024-02-16)
public class Null3 {
    public static void main(String[] args) {
        DataWrapper dataWrapper = new DataWrapper();

        System.out.println(dataWrapper.count);      // count에 값을 초기화하지 않고 선언만 했음
            // -> int : 0                           // 초기화 하지않은 필드에 접근 시 초기값이 대입된다.
        System.out.println(dataWrapper.data);
            // 참조타입(Data) : null

        /* 참조 필드 생성 X하고 출력 -> NPE 발생 */
        // System.out.println(dataWrapper.data.value1);    // = null.value1 -> NPE 발생

        /* 참조 필드 초기화 생성 후 출력 */
        dataWrapper.data = new Data();      // 인스턴스 내부의 참조필드를 초기화 생성

        System.out.println(dataWrapper.data.value1);
            // dataWrapper의 date필드를 생성하고 값 불러오면 NPE 발생 X
              // 즉, dataWrapper의 date필드를 생성 => int 타입인 value1, value2 가 0으로 설정됨
    }
}
