package array.ex;

import java.util.Scanner;

//8강
public class HelloJava8_ex1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //1번
        int[] students = {90,80,70,60,50};
        int total = 0;
        for (int i : students) {
            total+=i;
        }
        double average = (double) total / students.length;
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);

        //2번
        int[] nums = new int[5];
        for (int i=0; i<nums.length; i++){
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

    }
}
