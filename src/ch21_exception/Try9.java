package ch21_exception;

public class Try9 {
    public static void main(String[] args) {
        String[] array = {"100", "1oo", null, "300", "30o"};

        for (int i = 0; i <= array.length; i++) {
            try {
                int length = array[i].length();     // NullPointerException
                int value = Integer.parseInt(array[i]);     // NumberFormatException
                System.out.println(value);
            }
            // 두 개 이상의 예외를 하나의 catch 블록으로 처리하고 싶을 때 예외 클래스를 |로 연결
            catch (NumberFormatException | NullPointerException e){
                System.out.println("데이터에 문제가 있어 숫자로 변경 불가합니다.");
            }
            //catch (NullPointerException e2){
            //    System.out.println("데이터에 Null이 존재해서 길이 확인 불가");
            //}
            catch (ArrayIndexOutOfBoundsException e3){
                System.out.println("배열의 범위를 넘어섰습니다.");
            } catch (Exception e){
                System.out.println("예외가 발생했습니다. " + e.getMessage());
            }
        }
    }
}
