package ch15_final.final4;
// #14 final (2024-02-22)
public class Final4 {
    public static void main(String[] args) {
        Member member = new Member("hong", "홍길동");

        member.modifyMember("hong7", "박길동");        // id는 안바뀜
        // 만약 id를 기준으로 다른 프로그램에서 참조하고 있는 로직이 있다면...
            // 변경 시 큰 문제 발생 -> 하지만 final 키워드를 사용하면 원천 차단 가능
        member.printMember();
    }
}
