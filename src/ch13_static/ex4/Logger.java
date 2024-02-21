package ch13_static.ex4;
// #12 자바 메모리 영역 구조 (2024-02-21)
public class Logger {
    // 필드
    private static String logLevel = "INFO";

    // 생성자

    // 메소드
    public static void logInfo(String s) {
        System.out.println("[INFO] " + s);
    }
    public static void logError(String s) {
        if (!logLevel.equals("ERROR")){
            return;
        }
        System.out.println("[ERROR] " + s);
    }
    public static void setLogLevel(String error) {
        logLevel.equals("ERROR");
        return;
    }
}
