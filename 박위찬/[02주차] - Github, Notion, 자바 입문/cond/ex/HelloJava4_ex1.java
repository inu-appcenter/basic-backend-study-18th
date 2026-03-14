package cond.ex;

//4강
public class HelloJava4_ex1 {
    public static void main(String[] args){
        int score=65;

        if (score>=90){
            System.out.println("학점 A");
        }
        else if (score>=80){
            System.out.println("학점 B");
        }
        else if (score>=70){
            System.out.println("학점 C");
        }
        else if (score>=60){
            System.out.println("학점 D");
        }
        else{
            System.out.println("학점 F");
        }
    }
}
