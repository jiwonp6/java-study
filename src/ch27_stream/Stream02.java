package ch27_stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream02 {
    // 리소스(자원)으로부터 스트림 얻기 (생성하기)
    public static void main(String[] args) {
        // 1. 스트림 생성 : 컬렉션 프레임워크로부터 얻기
        List<String> fruitList = new ArrayList<>(
                List.of("사과", "오렌지", "포도", "바나나")
        );
        // 1) Collection 인터페이스의 stream() 메소드
        Stream<String> stream = fruitList.stream();

        // 2) Stream.of 메소드 활용 : 요소를 직접 나열하여 생성 가능
        Stream<String> colorStream = Stream.of("빨강", "주황", "노랑");

        // 3) Arrays.stream 메소드를 활용
        String[] array = {"냉장고", "세탁기", "건조기"};
        Stream<String> arrayStream = Arrays.stream(array);

        // 4) Stream.builder() 메소드 활용
        Stream.Builder<String> builder = Stream.builder();
        Stream<String> builderStream = builder
                                            .add("옷")
                                            .add("신발")
                                            .add("바지")
                                            .build();

        // 5) Map 에서 생성
        Map<String, Integer> scoreMap = new HashMap<>();
        scoreMap.put("홍길동", 80);
        scoreMap.put("임꺽정", 70);
        scoreMap.put("이몽룡", 90);
        // scoreMap.stream();   <- X, Map 은 Collection 인터페이스가 아니라서 직접 스트림 생성 불가
        Stream<Map.Entry<String, Integer>> entryStream = scoreMap.entrySet().stream();
        Stream<String> keySetStream = scoreMap.keySet().stream();
        Stream<Integer> valueStream = scoreMap.values().stream();

        // 6) 반복자를 통한 생성 (무한 스트림)
        /*
            크기가 정해지지 않고, 계속해서 요소를 생성하는 스트림
            seed : 0, UnaryOperator (람다식, 동일한 타입 리턴)
            무한 스트림은 특정한 제한이 필요함.
         */

        // 0부터 무한하게 1씩 증가하는 요소를 생성하는 스트림
        Stream<Integer> infiniteStream = Stream.iterate(0, n -> n + 1);
        // 100개까지만 제한
        Stream<Integer> limit = Stream.iterate(0, n -> n + 1).limit(100);
        // 최종 연산시 수행
        Object[] limitArray = limit.toArray();
        // ※ 무한 스트림을 제한 없이 최종 연산 단계로 가지 않도록 주의
        // Object[] infiniteStreamArray = infiniteStream.toArray();

        // 7) 기본타입을 스트림으로 생성하기
        IntStream intStream = IntStream.range(0, 10);
        int[] intStreamArray = intStream.toArray();
        IntStream rangeStream = IntStream.rangeClosed(1, 10);   // 마지막 값 포함
        int[] rangeStreamArray = rangeStream.toArray();

        // 8) 기본타입을 포장타입으로 박싱
        Stream<Integer> boxedStream = IntStream.range(10, 20).boxed();

        // 9) Random 클래스에서 스트림 생성
        IntStream randomStream = new Random().ints(6, 1, 46);
        randomStream.forEach(System.out::println);

        DoubleStream doubleStream = new Random().doubles(5, 1, 10);
        double[] doubleStreamArray = doubleStream.toArray();

        // 10) 문자열을 char 의 정수 스트림으로
        IntStream charStream = "안녕하세요".chars();
        int[] charStreamArray = charStream.toArray();

        // 11) 빈 스트림 생성
        Stream<Integer> emptyStream = Stream.empty();

        // 12) 파일(Non block I/O)에서 스트림 생성하기
        Path path = Paths.get("src\\ch27_stream\\stream.txt");
        Stream<String> lines;
        try {
            lines = Files.lines(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        lines.forEach(System.out::println);

    }
}
