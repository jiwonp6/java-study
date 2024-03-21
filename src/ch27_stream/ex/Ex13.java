package ch27_stream.ex;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex13 {
    /*
        <도시별 인구수 집계하기>
        여러 도시의 인구 정보가 다음과 같이 주어져 있습니다.
        각 도시의 평균 인구수를 계산하세요.

        출력예시
        ===
        New York 평균 인구: 7750000명
        Chicago 평균 인구: 2650000명
        Los Angeles 평균 인구: 3900000명
     */
    public static void main(String[] args) {
        List<CityPopulation> cityPopulations = Arrays.asList(
            new CityPopulation("New York", 8000000),
            new CityPopulation("Los Angeles", 4000000),
            new CityPopulation("Chicago", 2700000),
            new CityPopulation("New York", 7500000),
            new CityPopulation("Los Angeles", 3800000),
            new CityPopulation("Chicago", 2600000)
        );

        // 각 도시의 평균 인구수를 계산하세요.
        Map<String, Double> eachCityAvgPopulation = cityPopulations.stream()
                .collect(Collectors.groupingBy(CityPopulation::city,
                        Collectors.averagingDouble(CityPopulation::population)));

        // 출력 방법 1
        for (Map.Entry<String, Double> entry : eachCityAvgPopulation.entrySet()) {
            System.out.printf("%s 평균 인구: %.0f명\n", entry.getKey(), entry.getValue());
        }

        // 출력 방법 2
        eachCityAvgPopulation.forEach(
                (city, populationAvg) ->
                        System.out.printf("%s 평균 인구: %.0f명\n", city, populationAvg)
        );

    }
}
record CityPopulation(String city, int population) {}
