package cond.ex;

public class ScoreEx {

    public static void main(String[] args) {

        int score = 85;
        String rate;
        
        if(score >= 90){
            rate = "A";
        } else if (score >= 80) {
            rate = "B";
        } else if (score >= 70) {
            rate = "C";
        } else if (score >= 60) {
            rate = "D";
        } else{
            rate = "F";
        }

        System.out.println("학점 = " + rate);

    }
}
