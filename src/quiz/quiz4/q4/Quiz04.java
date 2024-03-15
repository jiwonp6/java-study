package quiz.quiz4.q4;

public class Quiz04 {
    public static void main(String[] args) {
        // 생성자
        DataProcessor<String> strData = new StringDataProcessor();
        DataProcessor<Integer> intData = new NumberDataProcessor();

        // 메소드 수행
        String strUpper = strData.processData("hello generics");
        Integer intDouble = intData.processData(100);

        // 출력
        System.out.println("strUpper = " + strUpper);
        System.out.println("intDouble = " + intDouble);



    }
}
