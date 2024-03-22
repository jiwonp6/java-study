package quiz.quiz5.q1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz01 {
    public static void main(String[] args) {
        ArrayList<Candidate> candidateList = new ArrayList<>(
                List.of(new Candidate("고길동", 0),
                        new Candidate("둘리", 0),
                        new Candidate("마이콜", 0),
                        new Candidate("희동이", 0))
        );
        Scanner scanner = new Scanner(System.in);

        System.out.println("후보목록 :\n" +
                            "1. 고길동\n" +
                            "2. 둘리\n" +
                            "3. 마이콜\n" +
                            "4. 희동이");
        while (true){
            System.out.println("투표하고 싶은 후보의 번호를 입력하세요 (종료하려면 0을 입력): ");
            int num = scanner.nextInt();
            switch (num){
                case 1:
                    candidateList.get(num-1).vote++;
                    break;
                case 2:
                    candidateList.get(num-1).vote++;
                    break;
                case 3:
                    candidateList.get(num-1).vote++;
                    break;
                case 4:
                    candidateList.get(num-1).vote++;
                    break;
                case 0:
                    System.out.println("투표결과 : ");
                    for (Candidate candidate : candidateList) {
                        System.out.println(candidate.name + ": " + candidate.vote);
                    }
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
        }

    }
    static class Candidate {
        private String name;
        private int vote;

        public Candidate(String name, int vote) {
            this.name = name;
            this.vote = vote;
        }

        public String getName() {
            return name;
        }

        public int getVote() {
            return vote;
        }
    }
}
