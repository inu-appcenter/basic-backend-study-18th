package array.ex;

import java.util.Scanner;

//8강
public class HelloJava8_ex4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //1번(2)
        System.out.println("입력받을 숫자 개수");
        int count = input.nextInt();
        int[] nums = new int[count];
        int max, min;
        for (int i =0; i< nums.length; i++) {
            System.out.println("정수 입력");
            nums[i] = input.nextInt();
        }
        min = max = nums[0];
        for (int i =0; i< nums.length; i++){
            if (nums[i] < min){
                min=nums[i];
            }
            if (nums[i] > max){
                max=nums[i];
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
}
