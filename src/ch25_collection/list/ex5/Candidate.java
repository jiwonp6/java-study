package ch25_collection.list.ex5;

public class Candidate {
    /*
        <Candidate 클래스 구현하기>
         - 후보(Candidate)의 이름(name)과 투표 수(votes)를 필드로 가집니다.
         - 생성자(Constructor)를 통해 이름을 초기화하고, 투표 수는 0으로 설정합니다.
         - receiveVote() 메서드를 구현하여 호출될 때마다 해당 후보의 투표 수를 1 증가시킵니다.
         - getName() 메서드와 getVotes() 메서드를 구현하여 이름과 투표 수를 반환할 수 있게 합니다.
         - toString() 메서드를 오버라이드하여 후보의 이름과 투표 수를 문자열로 반환합니다.
     */
    // 필드
    private String name;
    private int votes;

    // 생성자
    public Candidate(String name) {
        this.name = name;
        votes = 0;
    }

    // 메소드
    void receiveVote(){
        votes++;
    }

    // 게터
    public String getName() {
        return name;
    }

    public int getVotes() {
        return votes;
    }

    // toString
    @Override
    public String toString() {
        return name + " : " + votes + "\n";
    }
}
