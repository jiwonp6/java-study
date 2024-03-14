package ch25_collection.n2_set.ex7;

import java.time.LocalDateTime;

public class Reservation {
    private LocalDateTime start;
    private String name;
    private String place;

    public Reservation(LocalDateTime start, String name, String place) {
        this.start = start;
        this.name = name;
        this.place = place;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public String getName() {
        return name;
    }

    public String getPlace() {
        return place;
    }

    @Override
    public String toString() {
        return "예약시간 : " + start + ", " + place + ", " + name;
    }

}
