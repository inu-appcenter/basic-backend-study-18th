package array.ex;
import java.util.Scanner;
public class ArrayEx2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("5개의 정수를 입력하세요:");
        int[] array = new int[5];


        for(int i=0 ; i<5 ; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println("출력");

        for(int j=0;j< array.length;j++){
            System.out.print(array[j]);
            if(j == 4){
                break;
            }
            System.out.print(",");
        }

    }
}
