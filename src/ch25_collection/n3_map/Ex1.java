package ch25_collection.n3_map;

import java.util.HashMap;
import java.util.Map;

public class Ex1 {
    /*
        <학생 점수 관리>
        [문제 설명]
        학생들의 이름과 그에 해당하는 점수를 HashMap을 사용하여 관리하는 프로그램을 작성하세요.

        [수행]
        학생의 이름과 점수를 추가합니다.
        특정 학생의 점수를 조회합니다.
        모든 학생의 이름과 점수를 출력합니다.

        [예시 데이터]
        학생 "Alice"의 점수는 85점입니다.
        학생 "Bob"의 점수는 92점입니다.
        학생 "Charlie"의 점수는 88점입니다.
     */
    public static void main(String[] args) {
        Map<String, Integer> studentScore = new HashMap<>();

        // 학생 이름, 점수 추가
        studentScore.put("홍길동", 95);
        studentScore.put("김길동", 90);
        studentScore.put("박길동", 75);
        studentScore.put("이길동", 80);

        // 특정 학생의 점수 조회
        Integer getScore1 = studentScore.get("홍길동");
        System.out.println("홍길동 점수 : " + getScore1);

        // 모든 학생의 이름과 점수 출력
        System.out.println("< 모든 학생의 이름과 점수 출력 >");
        for (Map.Entry<String, Integer> entry : studentScore.entrySet()) {
            System.out.println("학생 \"" + entry.getKey() + "\"의 점수는" + entry.getValue() + "점 입니다.");
        }

    }
}
