package array.ex;

import java.util.Scanner;

//8강
public class HelloJava8_ex2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //3번
        int[] nums = new int[5];
        for (int i=nums.length-1; i>=0; i--){
            System.out.println("정수 입력");
            nums[i] = input.nextInt();
        }
        System.out.println("출력");
        for (int i=0; i<nums.length; i++){
            System.out.print(nums[i]);
            if (i < nums.length-1){
                System.out.print(", ");
            }
        }
        //4번
        int sum=0;
        double avr =0;
        int[] nums2 = new int[5];
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
