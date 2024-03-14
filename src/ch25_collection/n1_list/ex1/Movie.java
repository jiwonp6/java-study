package ch25_collection.n1_list.ex1;

public class Movie implements Media{
    // 필드
    private String title;
    private String director;

    // 생성자
    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
    }

    // 오버라이드
    @Override
    public String getTitle() {
        return title;
    }
    @Override
    public String getDetail() {
        return "Director : " + director;
    }
}
