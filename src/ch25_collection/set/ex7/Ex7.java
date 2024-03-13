package ch25_collection.set.ex7;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.TreeSet;

public class Ex7 {
    /*
        <회의실 예약 시스템 (확장)>
        기존 온라인 회의실 예약 시스템에서 Comparator를 구현하여
        이름과 장소 기준으로 정렬하는 방법을 추가합니다.

        Comparator 구현:
        Reservation 객체들을 이름과 장소를 기준으로 정렬하는 Comparator 구현.

        새로운 TreeSet 생성:
        생성자에서 구현된 Comparator를 매개변수로 받는 TreeSet을 생성하고
        여러 Reservation 객체를 TreeSet에 추가합니다.
        이름과 장소 기준으로 정렬된 TreeSet의 요소들을 출력합니다.
    */
    public static void main(String[] args) {

        Comparator<Reservation> reservationComparator = new Comparator<Reservation>() {
            @Override
            public int compare(Reservation r1, Reservation r2) {
                r1.getName().compareTo(r2.getName());
                r1.getPlace().compareTo(r2.getPlace());
                return r1.getName().compareTo(r2.getName());
            }
        };

        TreeSet<Reservation> reservations = new TreeSet<>(reservationComparator);

        Reservation reservation1 = new Reservation(
                LocalDateTime.of(2023, 10, 10, 12, 00), "김길동", "회의실1");
        Reservation reservation2 = new Reservation(
                LocalDateTime.of(2023, 10, 10, 10, 00), "홍길동", "회의실2");
        Reservation reservation3 = new Reservation(
                LocalDateTime.of(2023, 10, 11, 12, 00), "임꺽정", "회의실3");
        Reservation reservation4 = new Reservation(
                LocalDateTime.of(2023, 10, 12, 11, 00), "박길동", "회의실1");

        reservations.add(reservation1);
        reservations.add(reservation2);
        reservations.add(reservation3);
        reservations.add(reservation4);

        for (Reservation reservation : reservations) {
            System.out.println(reservation.toString());
        }

    }
}
