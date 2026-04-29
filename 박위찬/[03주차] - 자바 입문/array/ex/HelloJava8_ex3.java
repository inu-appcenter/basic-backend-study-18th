package array.ex;

import java.util.Scanner;

//8강
public class HelloJava8_ex3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //5번
        int sum=0;
        double avr =0;
        System.out.println("입력받을 숫자 개수");
        int count = input.nextInt();
        int[] nums2 = new int[count];

        for (int i =0; i< nums2.length; i++) {
            System.out.println("정수 입력");
            nums2[i] = input.nextInt();
        }
        for (int i =0; i< nums2.length; i++) {
            sum+=nums2[i];
        }
        avr =(double) sum/nums2.length;
        System.out.println("합 = " + sum);
        System.out.println("평균 = " + avr);


    }
}
