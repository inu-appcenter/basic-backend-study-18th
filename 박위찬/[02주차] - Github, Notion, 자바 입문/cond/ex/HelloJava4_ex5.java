package cond.ex;

//4강
public class HelloJava4_ex5 {
    public static void main(String[] args){
       String grade = "A";

       switch (grade){
           case "A":
               System.out.println("아주 잘함");
               break;
           case "B":
               System.out.println("잘함");
               break;
           case "C":
               System.out.println("보통");
               break;
           case "D":
               System.out.println("못함");
               break;
           case "F":
               System.out.println("매우 못함");
               break;
       }
    }
}
