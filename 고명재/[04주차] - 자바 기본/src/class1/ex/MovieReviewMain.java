package class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview num1 = new MovieReview();
        num1.title="인셉션";
        num1.review="인생은 무한 루프";

        MovieReview num2 = new MovieReview();
        num2.title = "어바웃 타임";
        num2.review = "인생 시간 영화!";

        System.out.println("영화 제목:"+ num1.title+", 리뷰: "+num1.review);
        System.out.println("영화 제목:"+ num2.title+", 리뷰: "+num2.review);

    }
}
