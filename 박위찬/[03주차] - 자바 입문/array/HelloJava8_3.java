package array;

//8강-3
public class HelloJava8_3 {
    public static void main(String[] args) {
        //2*3 2차원 배열 만들기
        int[][] arr = new int[2][3]; //행(세로, row), 열(가로, column)

        arr[0][0] =1; // 0행 0열
        arr[0][1] =2; // 0행 1열
        arr[0][2] =3;
        arr[1][0] =4;
        arr[1][1] =5;
        arr[1][2] =6;

        //0행 출력
        System.out.print(arr[0][0] + " "); //0열 출력
        System.out.print(arr[0][1] + " "); //1열 출력
        System.out.print(arr[0][2] + " "); //2열 출력
        System.out.println(); //한 행이 끝나면 라인 변경
        //1행 출력
        System.out.print(arr[1][0] + " "); //0열 출력
        System.out.print(arr[1][1] + " "); //1열 출력
        System.out.print(arr[1][2] + " "); //2열 출력
        System.out.println(); //한 행이 끝나면 라인 변경

        //리팩토링
        int[][] arr2 = new int[2][3];
        for (int s=1; s<=6; s++) {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    arr2[i][j] = s;
                }
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j=0; j<3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}