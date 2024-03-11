package ch24_generic.ex4;

public class Movie implements Media{
    // 필드
    private String title;
    private String director;

    // 생성자
    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
