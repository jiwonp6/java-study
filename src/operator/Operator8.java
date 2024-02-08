package operator;
// #3-8 문자열 비교 (2024-02-08)
public class Operator8 {
    public static void main(String[] args) {

        String str1 = "안녕";
        String str2 = "하세요";

        String str3 = "안녕";

        // 기존 비교 방식
        boolean bull1 = (str1 == str2);
        System.out.println("bull1 = " + bull1);     // false

        boolean bull2 = (str1 == str3);
        System.out.println("bull2 = " + bull2);     // true

        // 문자열에서는 equals() 메소드 사용 <- 더 안전!
        boolean bull3 = "안녕".equals("안녕");
        System.out.println("bull3 = " + bull3);     // true

        boolean bull4 = str1.equals(str2);
        System.out.println("bull4 = " + bull4);     // false

        boolean bull5 = str1.equals(str3);
        System.out.println("bull5 = " + bull5);     // true

    }
}
