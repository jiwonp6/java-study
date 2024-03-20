package ch27_stream;

public class Student implements Comparable<Student>{
    private String name;
    private String gender;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public Student(String name, String gender, int score) {
        this.name = name;
        this.gender = gender;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return name + " : " + score;
    }

    @Override
    public int compareTo(Student student) {
        return name.compareTo(student.getName());
    }
}
