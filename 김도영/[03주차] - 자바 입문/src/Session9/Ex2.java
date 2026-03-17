package Session9;

import java.util.Scanner;

public class Ex2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[5];

        System.out.println("5개 정수 입력:");
        for (int i = 0;i<nums.length;i++){
            nums[i] = scanner.nextInt();
        }

        System.out.println("출력");
        for(int i= 0; i<nums.length;i++){
            System.out.print(nums[i]);
            if(i<nums.length-1){
                System.out.print(",");
            }
        }
    }
}
