package ch29_io_stream.ex_serializable;

import java.io.Serializable;

public class Career implements Serializable {
    String company;
    int year;

    public Career(String company, int year) {
        this.company = company;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Career{" +
                "company='" + company + '\'' +
                ", year=" + year +
                '}';
    }
}
