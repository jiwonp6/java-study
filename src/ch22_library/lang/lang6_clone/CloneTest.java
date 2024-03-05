package ch22_library.lang.lang6_clone;

public class CloneTest {
    // 얕은 복사
    public static void main(String[] args) throws CloneNotSupportedException {
        int[] array = {1, 2, 3, 4};
        ShallowCopy original = new ShallowCopy(array);
        ShallowCopy clone = (ShallowCopy) original.clone();

        // 변경 전
        for (int i : original.array) {
            System.out.print(i + "\t");
        }
        System.out.println(" ");
        for (int i : clone.array) {
            System.out.print(i + "\t");
        }
        System.out.println(" ");

        // 복제한 객체의 배열(참조 필드)의 일부 요소를 변경
        clone.array[3] = 10;

        // 변경 후 => 클론의 값만 변경해도 원 값까지 변경됨 : 얕은 복사!
        for (int i : original.array) {
            System.out.print(i + "\t");
        }
        System.out.println(" ");
        for (int i : clone.array) {
            System.out.print(i + "\t");
        }
    }
}
