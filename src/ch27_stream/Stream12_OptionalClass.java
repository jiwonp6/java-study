package ch27_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Stream12_OptionalClass {
    // Optional 클래스
    // 자바 8부터 도입, 값이 있거나, 없을 수 있는 컨테이너 객체
    // NPE 방지, 메소드가 결과를 반환할 수 없을 때 null 대신 사용
    // 집계값이 존재하지 않을 경우 디폴트 값을 설정하거나 람다식을 등록할 수 있음
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        // * 평균을 가져오는데 NoSuchElementException 이 발생
//        double asDouble = list.stream()
//                              .mapToInt(Integer::intValue)
//                              .average()
//                              .getAsDouble();
        OptionalDouble optional = list.stream()
                .mapToInt(Integer::intValue)
                .average();               // first = OptionalInt[11]

        // 1) isPresent : Optional 이 값을 포함하는 여부를 확인
        boolean present = optional.isPresent();
        System.out.println("present = " + present);           // present = false

        // 존재하지 않을 결우 (null 일 경우, isPersent == false) 를 처리
        if (present) {
            System.out.println("평균값 : " + optional.getAsDouble());
        } else {
            System.out.println("평균값 : " + 0);
        }

        // 2) orElse : 값이 없을 경우 (null) 기본 값을 정해 놓음
        // 존재하면 값 반환, 존재하지 않으면 other (디폴트 값) 반환
        double avg = optional.orElse(0);
        System.out.println("avg = " + avg);

        // 3-1) ifPresent : 값이 존재할 경우에만 실행되는 람다식
        // 값이 있을 경우 Consumer 람다식
        optional.ifPresent(n -> System.out.println("n = " + n));

        // 3-2) ifPresentOrElse : 값이 존재할 경우, 존재하지 않을 경우 지정해서 사용
        optional.ifPresentOrElse(
                // 값이 있을 경우 Consumer 람다식
                n -> System.out.println("n = " + n),
                // 값이 없을 경우 Runnable 람다식
                () -> System.out.println("요소가 존재하지 않습니다.")
        );

        // 4) orElseThrow : 예외 발생 시키기
        // double avg2 = optional.orElseThrow();       // => NoSuchElementException
        // 원하는 예외로 지정 처리 (사용자 지정 예외)
        double avg2 = optional.orElseThrow(() -> new IllegalArgumentException("배열에 아무 요소가 없습니다."));
    }
}
