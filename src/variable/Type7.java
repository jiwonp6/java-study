package variable;
//#2-15 문자열 강제 타입 변환(2024-02-07)
public class Type7 {
    public static void main(String[] args) {
        // 문자열 -> 기본타입으로 강제 변환
        String s1 = "600000";
        int i = Integer.parseInt(s1);
        double d1 = Double.parseDouble("3.14");
        boolean b = Boolean.parseBoolean(true);
        
        // 기본타입 => 문자열 강제 변환
        String s = String.valueOf(100);
        String s2 = String.valueOf(3.14);
        String s3 = String.valueOf(false);

    }
}
