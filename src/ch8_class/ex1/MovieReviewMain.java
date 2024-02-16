package ch8_class.ex1;
// #9 연습문제 (2024-02-16)
public class MovieReviewMain {
    public static void main(String[] args) {
        // 변수설정
        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "아이언맨 1";
        movieReview1.review = "로다주 멋있다.";

        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "토르";
        movieReview2.review = "햄식이 잘생겼다.";

        // 배열 생성하고 값 넣어주기
        MovieReview[] movieReviews = new MovieReview[2];
        movieReviews[0] = movieReview1;
        movieReviews[1] = movieReview2;

        // 정보 출력
        for (MovieReview mr : movieReviews) {
            System.out.println("[ 영화 제목 : " + mr.title + " ]");
            System.out.println(mr.review);
        }
    }
}
