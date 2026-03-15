package operator.ex;

public class OperationEx1 {
    public static void main(String[] args) {
        int num1=10;
        int num2=20;
        int num3=30;

        int sum = num1+num2+num3;
        int average = sum/3;
        System.out.println("sum = "+sum +", average ="+ average);



        //ex2
        double val1 =1.5;
        double val2 =2.5;
        double val3 =3.5;

        double sum_double = val1+val2+val3;
        double arg_double = sum_double/3;
        System.out.println("sum double = "+sum_double +", average double="+ arg_double);


        //ex3
        int score =95;
        boolean result = score>=80 && score <=100;
        System.out.println("if score = 95: " +result);

        score-=20;
        result = score>=80 && score <=100;
        System.out.println("if score = 75: " +result);


    }
}
