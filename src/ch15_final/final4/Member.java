package ch15_final.final4;
// #14 final (2024-02-22)
public class Member {

    // 필드
    private final String id;    // 변경되지 않는 초기값
    private String name;

    // 생성자
    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void modifyMember(String id, String name){
        // this.id = id;   // final 키워드로 컴파일 에러 발생 -> 컴파일 오류로 더 중대한 오류들을 초기에 막을 수 있다.
        this.name = name;
    }
    public void printMember(){
        System.out.println(id);
        System.out.println(name);
    }
}
