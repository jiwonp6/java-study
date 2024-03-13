package ch25_collection.set.ex6;

import java.time.LocalDateTime;

public class Reservation implements Comparable<Reservation> {
    private LocalDateTime start;
    private String name;
    private String place;

    public Reservation(LocalDateTime start, String name, String place) {
        this.start = start;
        this.name = name;
        this.place = place;
    }

    @Override
    public int compareTo(Reservation reservation) {
        return start.compareTo(reservation.start);
    }

    @Override
    public String toString() {
        return "예약시간 : " + start + ", " + place + ", " + name;
    }

}
