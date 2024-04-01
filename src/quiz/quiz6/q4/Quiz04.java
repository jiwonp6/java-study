package quiz.quiz6.q4;

import java.util.Arrays;
import java.util.List;

public class Quiz04 {
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

    static class City {
        private String city;
        private List<String> attractions;

        public City(String city, List<String> attractions) {
            this.city = city;
            this.attractions = attractions;
        }

        public String getCity() {
            return city;
        }

        public List<String> getAttractions() {
            return attractions;
        }
    }
}
