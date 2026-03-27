package class1.ex;

public class class_start_ex2 {
    public static void main(String[] args){
        MovieReview review1 = new MovieReview();
        review1.title ="인셉션";
        review1.review="인생은 무한 루프";

        MovieReview review2 = new MovieReview();
        review2.title ="어바웃 타임";
        review2.review="인생 시간 영화";

        MovieReview[] movies = new MovieReview[2];
        movies[0] = review1;
        movies[1] = review2;

        for (MovieReview s : movies) {
            System.out.println("영화 제목: " + s.title + ", 리뷰: " + s.review);
        }


    }
}
