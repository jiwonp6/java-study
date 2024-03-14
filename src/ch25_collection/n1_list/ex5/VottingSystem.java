package ch25_collection.n1_list.ex5;

import java.util.ArrayList;
import java.util.List;

public class VottingSystem {
    /*
        <VotingSystem 클래스 구현하기>
         - List<Candidate> 타입의 필드를 사용하여 후보 목록을 관리합니다.
         - 생성자에서 후보 목록을 초기화하고, 4명의 후보를 목록에 추가합니다.
         - startVoting() 메서드에서 투표 프로세스를 구현합니다.
             - 사용자로부터 투표할 후보의 번호를 입력받습니다.
             - 유효한 번호를 입력받으면 해당 후보의 receiveVote() 메서드를 호출합니다.
             - 잘못된 번호를 입력받으면 오류 메시지를 출력하고 다시 입력을 요청합니다.
         - printVotingResult() 메서드에서 최종 투표 결과를 출력합니다.
     */
    // 필드
    // 후보 정보 가지고 있는 List
    private List<Candidate> candidates = new ArrayList<>();

    // 생성자
    // 후보 삽입
    public void addCandidate(){
        candidates.add(new Candidate("고길동"));
        candidates.add(new Candidate("둘리"));
        candidates.add(new Candidate("마이콜"));
        candidates.add(new Candidate("희동이"));
    }

    // 메소드
    // 후보 목록 출력
    public void printAllCandidate(){
        System.out.println("<후보 목록>");
        for (int i = 0; i < candidates.size(); i++) {
            System.out.print((i+1) + ". " + candidates.get(i).getName() + "\t");
        }
        System.out.println(" ");
    }

    // 투표
    public void startVoting(int i){
        candidates.get(i).receiveVote();
    }

    // 투표 결과 출력
    public void printVotingResult(){
        System.out.println("<투표 결과>");
        for (Candidate candidate : candidates) {
            System.out.print(candidate.toString());
        }
    }
}
