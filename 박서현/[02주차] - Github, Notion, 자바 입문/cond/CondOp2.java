package cond;

public class CondOp2 {
    public static void main(String[] args){
        int age = 18;
        String status = (age >= 18) ? "adult" : "kid";
        System.out.println("age = " + age + " status = " + status);
    }
}
