package ch27_stream.ex;

import java.util.Map;

public class Ex4 {
    /*
        <영화 평점 요약>
        영화와 그에 대한 평점이 주어졌을 때, 평점이 8 이상인 영화의 이름을 추출하고,
        "영화명 - 평점" 형태로 변환한 후 결과를 출력하세요.

        출력 결과:
        The Shawshank Redemption - 9
        The Godfather - 9
        The Dark Knight - 8
        Pulp Fiction - 8
     */
    public static void main(String[] args) {
        Map<String, Integer> movieRatings
                = Map.of("The Shawshank Redemption", 9,
                         "The Godfather", 9,
                         "The Dark Knight", 8,
                         "Pulp Fiction", 8,
                         "Fight Club", 7);

        movieRatings.entrySet().stream()
                            .filter(entry -> entry.getValue()  >= 8)
                            .map(entry -> entry.getKey() + " - " + entry.getValue())
                            .forEach(System.out::println);

    }
}
