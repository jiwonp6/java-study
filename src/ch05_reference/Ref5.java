package ch05_reference;
// #9 참조 - 메소드있는 경우(2024-02-16)
public class Ref5 {
    /* 메인 */
    public static void main(String[] args) {
        Data data = new Data();
        data.value1 = 100;
        System.out.println("1. 메소드 호출 전 : " + data.value1);     // 100

        multiply2(data);    // 메소드 호출 : 값(참조값)을 복사해서 대입
        System.out.println("4. 메소드 호출 후 : " + data.value1);     // 100 => 200
    }

    /* 메소드 */
    public static void multiply2(Data dataArg){
        System.out.println("2. 메소드 내 값 변경 전 : " + dataArg.value1);     // 100
        dataArg.value1 *= 2;   // 주소 내 값 자체가 변경되었기 때문에 메소드 호출 후에도 값이 바뀐채로 나옴
        // 참조값을 복사해서 전달하여 data와 dataArg는 같은 참조값 0X100을 가지게 된다.
        // 메모리 공간을 참조한 객체의 주소지가 같기 때문에
        // data.value1, dataArg.value1은 같은 값을 가지게 된다.
        System.out.println("3. 메소드 내 값 변경 후 : " + dataArg.value1);     // 200
    }

}
