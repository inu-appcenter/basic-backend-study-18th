package array;

public class ArrayDi3 {
    public static void main(String[] args) {
        //2x3 2차원 배열 만들기
        int[][] arr = new int[4][4];

        int i = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = i++;
            }
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println(); //한 행이 끝나면 라인을 변경.
        }
    }
}
