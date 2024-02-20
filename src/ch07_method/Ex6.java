package ch07_method;

import java.util.Scanner;

// #8-15 연습문제 (2024-02-15)
public class Ex6 {
    public static void main(String[] args) {
        /*
            <성적 관리 프로그램>
            1. 새로운 성적을 배열에 추가
            2. 성적의 평균을 계산
            3. 최고 성적을 조회
            4. 성적 분포를 출력 (A, B, C, D, F) (90, 80, 70, 60, 60이하)
         */
        int scores[] = new int[0];  // 비어있는 배열
        int score = 0;

        // 성적 입력받기
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("성적을 입력하세요.(성적 입력을 그만두려면 '1004'을 입력하세요.)");
            score = scanner.nextInt();
            if (score != 1004) {
                scores = addScore(scores, score);
            }
        }while (score != 1004);

        System.out.println("<성적분포 출력>");
        for (int s : scores) {
            System.out.print(s + "\t");
        }

        // 성적 평균 출력
        double avg = calculateAvg(scores);
        System.out.println("\n성적 평균 : " + avg);

        // 최고 성적 출력
        int max = findMaxGrade(scores);
        System.out.println("성적 최고점 : " + max);

        // 성적 분포 출력
        printScoreDistribution(scores);

    }

    // 성적 추가하는 메소드
    public static int[] addScore(int[] scores, int score){
        int[] newScores = new int[scores.length + 1];   // 이전 배열보다 길이가 1만큼 긴 배열
        for (int i = 0; i < scores.length; i++) {       // 기존의 배열을 순회하며 새로운 배열에 내용 복사
            newScores[i] = scores[i];
        }
        newScores[newScores.length - 1] = score;    // 배열의 마지막 인덱스에 새 값을 추가
        scores = newScores;     // 기존 배열을 새로운 배열로 대체
        return scores;
    }

    // 성적 평균 구하는 메소드
    public static double calculateAvg(int[] scores){
        int sum = 0;
        double avg = 0;
        for (int score : scores) {
            sum += score;
        }
        avg = (double) sum/ scores.length;
        return avg;
    }

    // 성적 최고점을 구하는 메소드
    public static int findMaxGrade(int[] scores){
        int max = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (max < scores[i]){
                max = scores[i];
            }
        }
        return max;
    }

    // 성적 분포 출력하는 메소드
    public static void printScoreDistribution(int[] scores) {
        int[] grade = new int[5];
        for (int score : scores){
            if (score >= 90){
                grade[0]++;      // A
            }else if (score < 90 && score >= 80){
                grade[1]++;      // B :
            }else if (score < 80 && score >= 70){
                grade[2]++;      // C
            }else if (score < 70 && score >= 60){
                grade[3]++;      // D
            }else if (score < 60){
                grade[4]++;      // F
            }
        }
        System.out.printf("A : %d\t B : %d\t C : %d\t D : %d\t F : %d\t",
                grade[0]++, grade[1]++, grade[2]++, grade[3]++, grade[4]++);
    }

}
