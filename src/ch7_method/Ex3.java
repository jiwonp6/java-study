package ch7_method;
// #8-12 연습문제 (2024-02-15)
public class Ex3 {
    public static void main(String[] args) {
        /*
            정수 배열의 평균 구하기
         */
        int[] numbers = {5, 15, 10};
        double avg = calculateAverage(numbers);
        System.out.println("평균 : " + avg);
    }
    public static double calculateAverage(int[] numbers) {
        int sum = 0;
        double avg = 0;

        // sum 구하기
        for (int num : numbers){
            sum += num;
        }
        // avg 구하기
        avg = (double) sum/numbers.length;

        // avg 반환
        return avg;
    }


}
