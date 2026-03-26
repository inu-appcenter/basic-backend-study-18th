package Session9;

import java.util.Scanner;

public class Ex3 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요:");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        int min, max;

        System.out.println(n+"개의 정수를 입력하세요:");
        for(int i=0;i<n;i++){
            nums[i] = scanner.nextInt();
        }

        min = nums[0];
        max = nums[0];

        for(int i=0;i<n;i++){
            if(nums[i]<min){
                min = nums[i];
            }
            if (nums[i]>max){
                max = nums[i];
            }
        }
        System.out.println("가장 작은 정수"+min);
        System.out.println("가장 큰 정수"+max);
    }
}
