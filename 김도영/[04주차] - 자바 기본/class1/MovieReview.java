package class1;

public class MovieReview {
    String title;
    String review;
    static void main(String[] args) {
       MovieReview inception = new MovieReview();
       inception.title = "인셉션";
       inception.review = "gooodd";

       MovieReview aboutTime = new MovieReview();
       aboutTime.title = "어바웃 타임";
       aboutTime.review = "goawef";

        System.out.println(inception.title + " " + inception.review);
        System.out.println(aboutTime.title + " " + aboutTime.review);
    }
}
