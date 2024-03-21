package ch27_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream14 {
    /*
       <병렬 스트림>
            : 멀티 코어 CPU 에서 전체 요소를 분할해서 각각의 코어가 병렬적으로 처리하는 것
       - 목적 : 작업 처리 시간을 줄이는 것
       - 동시성(Concurrency) : 여러 개의 스레드가 하나의 코어에서 번갈아가면서 실행
       - 병렬성(Parallelism) : 멀티 코어에서 각각의 작업을 병렬로 실행하는 것

       <자바 병렬 스트림에서는 Fork / Join Framework 사용>
       - Fork : 데이터의 스트림을 쪼개어서 멀티 코어에 나누어 줌 -> 병렬로 처리
       (각각의 포크에서 작업 결과를 가져와서)
       - Join : 나누어져 처리된 작업결과들을 부분 결합하고 최종 결합하여 결과 산출

       <병렬 처리에 영향을 미치는 요인>
            : 병렬이 순차보다 항상 빠른 것은 아니다. -> 요인 고려해야 함
       1. 데이터 요소(element)의 숫자와 요소당 처리 시간
            - pork 와 join 단계의 스레드 풀 생성에 추가 간접 비용 발생
       2. 스트림 소스 자료구조(collection)의 종류
            - ArrayList 는 병렬에 쉬운 편, Hash Tree Link 구조는 분리가 쉽지 않음.
       3. 하드웨어와 core 의 수
            - 코어 수가 많을 경우 병렬 스트림 성능이 더 좋음.
    */
    public static void main(String[] args) {
        // 병렬 스트림 생성하기
        List<String> strList = Arrays.asList(
                "a", "b", "c", "d", "e", "f", "g", "h"
        );

        Stream<String> strStream = strList.parallelStream();

        // 기존 스트림을 병렬 스트림으로 전환
        Stream<String> parallel = strList.stream().parallel();

        // 병렬 스트림 여부 확인
        boolean isParallel = parallel.isParallel();
        boolean notParallel = strList.stream().isParallel();

        System.out.println("isParallel = " + isParallel);
        System.out.println("notParallel = " + notParallel);

        int n = 100_000_000;    // 반복 횟수 (반복횟수 ↑ -> 병렬 ↓, 반복횟수 ↓ -> 병렬 ↑)

        List<Integer> list = new ArrayList<>();     // 랜덤한 숫자 List 생성
        for (int i = 0; i < n; i++) {
            list.add(new Random().nextInt());
        }

        // 1. 병렬 처리 시간
        long startTime1 = System.currentTimeMillis();
        list.parallelStream()
                .map(num -> num * num)
                .forEach(num -> {});
        long endTime1 = System.currentTimeMillis();
        System.out.println("1. 병렬 처리 시간 : " + (endTime1 - startTime1));

        // 2. 순차 처리 시간
        long startTime2 = System.currentTimeMillis();
        list.stream()
                .map(num -> num * num)
                .forEach(num -> {});
        long endTime2 = System.currentTimeMillis();
        System.out.println("2. 순차 처리 시간 : " + (endTime2 - startTime2));

    }

}
