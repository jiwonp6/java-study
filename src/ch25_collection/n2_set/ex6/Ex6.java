package ch25_collection.n2_set.ex6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TreeSet;

public class Ex6 {
    /*
        <회의실 예약 시스템>
        온라인 회의실 예약 시스템을 구현해봅니다.
        이 시스템은 회의실 예약 요청들을 시간 순으로 관리하며, 중복된 시간에 대한 예약을 방지합니다.
        각 예약 요청은 시작 시간과 종료 시간으로 구성되며, TreeSet을 사용하여 예약들을 관리합니다.

        [요구사항]
        Reservation 클래스 정의
        - 필드: 예약 시간(LocalDateTime start), 예약자명(String name), 장소(String place)
        - 생성자: 시작 시간과 종료 시간을 매개변수로 받아 초기화
        - Comparable<Reservation> 인터페이스 구현: 시작 시간을 기준으로 오름차순 정렬

        [Main 함수에서 회의실 예약 관리]
        여러 Reservation 객체를 생성하고, TreeSet에 추가합니다.
        TreeSet에 저장된 모든 예약을 시작 시간 순으로 출력합니다.

        [입력예시]
        : 예약 요청 정보(정확한 시작 시간과 종료 시간)
        ===
        예약1: 2023년 10월 10일 12시 00분 시작
        예약2: 2023년 10월 10일 10시 00분 시작
        예약3: 2023년 10월 11일 10시 00분 시작
        예약4: 2023년 10월 10일 15시 00분 시작


        [출력예시]
        : 예약 목록 출력
        ===
        "예약 시간: 2023-10-10T10:00, 회의실, 김길동"
        "예약 시간: 2023-10-10T12:00, 회의실, 홍길동"
        "예약 시간: 2023-10-10T15:00, 회의실, 홍길서"
        "예약 시간: 2023-10-11T10:00, 회의실, 홍길남"
     */
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 시작");

        Reservation reservation1 = new Reservation(
                LocalDateTime.parse("2023년 10월 10일 12시 00분 시작", formatter), "홍길동", "회의실1");
        Reservation reservation2 = new Reservation(
                LocalDateTime.parse("2023년 10월 10일 10시 00분 시작", formatter), "김길동", "회의실2");
        Reservation reservation3 = new Reservation(
                LocalDateTime.parse("2023년 10월 11일 10시 00분 시작", formatter), "홍길남", "회의실3");
        Reservation reservation4 = new Reservation(
                LocalDateTime.parse("2023년 10월 10일 15시 00분 시작", formatter), "홍길서", "회의실1");

        TreeSet<Reservation> reservations = new TreeSet<>();
        reservations.add(reservation1);
        reservations.add(reservation2);
        reservations.add(reservation3);
        reservations.add(reservation4);

        for (Reservation reservation : reservations) {
            System.out.println(reservation.toString());
        }
    }
}
