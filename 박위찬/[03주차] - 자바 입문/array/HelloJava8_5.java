package array;

//8강-5
public class HelloJava8_5 {
    public static void main(String[] args) {
        int[][] arr= new int[4][5];
        int s=1;
        for(int i=0; i< arr.length; i++){
            for (int j=0; j< arr[i].length; j++){
                arr[i][j] = s++;
            }
        }

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}