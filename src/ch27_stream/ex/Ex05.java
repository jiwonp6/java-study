package ch27_stream.ex;

import java.util.*;

public class Ex05 {
    /*
        <여행 일정 관리>
        여러분은 여행 일정을 계획하고 있습니다.
        각 여행지는 도시 이름과 방문하려는 관광지 리스트로 구성되어 있습니다.
        여러분의 목표는 중복되는 관광지를 제거하고, 모든 도시의 관광지 리스트를 합친 뒤, 알파벳 순으로 정렬하여 최종 여행지 리스트를 만드는 것입니다.

        요구사항:
        - 모든 도시의 관광지 리스트를 합칩니다.
        - 중복되는 관광지를 제거합니다.
        - 관광지 이름을 알파벳 순으로 정렬합니다.
        - 최종 여행지 리스트를 출력합니다.

        출력예시:
        최종 여행지 리스트:
        경복궁
        광안리
        남산타워
        만장굴
        북촌한옥마을
        성산일출봉
        태종대
        해운대
     */
    public static void main(String[] args) {
        List<City> itinerary = Arrays.asList(
                new City("서울", Arrays.asList("경복궁", "남산타워", "북촌한옥마을")),
                new City("부산", Arrays.asList("해운대", "광안리", "태종대", "남산타워")),
                new City("제주", Arrays.asList("성산일출봉", "만장굴", "북촌한옥마을"))
        );
        itinerary.stream()
                .flatMap(city -> city.getAttractions().stream())
                .distinct()
                .sorted()
                .forEach(System.out::println);

    }
}

    class City {
        String name;
        List<String> attractions;

        City(String name, List<String> attractions) {
            this.name = name;
            this.attractions = attractions;
        }

        String getName() {
            return name;
        }

        List<String> getAttractions() {
            return attractions;
        }

    }
