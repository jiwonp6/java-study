package ch26_lambda.ex;

public class Student {
    // 필드
    private String name;
    private int eng;
    private int math;

    public Student(String name, int eng, int math) {
        this.name = name;
        this.eng = eng;
        this.math = math;
    }

    public int getEnglishScore(){
        return eng;
    }
    public int getMathScore(){
        return math;
    }

}
