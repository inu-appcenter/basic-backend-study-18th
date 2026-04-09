package class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {

        MovieReview num1 = new MovieReview();
        num1.title="인셉션";
        num1.review="인생은 무한 루프";

        MovieReview num2 = new MovieReview();
        num2.title = "어바웃 타임";
        num2.review = "인생 시간 영화!";

        MovieReview movieReviews[] = new MovieReview[]{num1,num2};

        for(int i =0; i< movieReviews.length; i++){
            System.out.println("영화 제목: "+movieReviews[i].title+", 리뷰: "+movieReviews[i].review);
        }

    }
}
