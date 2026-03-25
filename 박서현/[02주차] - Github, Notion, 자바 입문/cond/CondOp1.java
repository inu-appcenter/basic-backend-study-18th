package cond;

public class CondOp1 {
    public static void main(String[] args){
        int age = 18;
        String  status;
        if(age >=18){
            status = "adult";
        }else{
            status = "kid";
        }
        System.out.println("age = " +age + " Status = " + status);
    }
}
