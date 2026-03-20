package array.ex;
import java.util.Scanner;
public class ArrayEx6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int amount = scanner.nextInt();
        int[] array = new int[amount];
        int minNumber , maxNumber;

        System.out.println(amount+ "개의 정수를 입력하세요:");
        for(int i = 0 ; i<amount; i++){
            array[i] = scanner.nextInt();
        }

        minNumber = maxNumber = array[0];
        for(int j=0 ; j<amount; j++){
            if(array[j] < minNumber){
                minNumber = array[j];
            }
            if(array[j]>maxNumber){
                maxNumber = array[j];
            }
        }
        System.out.println("가장 작은 정수: " + minNumber);
        System.out.println("가장 큰 정수: " + maxNumber);



    }
}
