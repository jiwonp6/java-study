package ch21_exception;

public class Try4 {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());   // NullPointerException
        } catch (NullPointerException e){
            System.out.println("NullPointerException 에러 발생 (" + e.getMessage() + " )");
        }

    }
}
