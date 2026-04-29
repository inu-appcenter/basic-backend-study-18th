package array;

//8강-4
public class HelloJava8_4 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };  //2행(세로, row), 3열(가로, column)

        for (int row = 0; row < arr.length; row++) { //arr.length : 행의 길이
            for (int column = 0; column < arr[row].length; column++) { //arr[row].length : 열의 길이
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}