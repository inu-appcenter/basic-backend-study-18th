package array.ex;

import java.util.Scanner;

//8강
public class HelloJava8_ex6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //2번(2)
        int sum =0;
        double aver =0;
        System.out.println("학생 수를 입력하세요");
        int number = input.nextInt();
        int[][] grade = new int[number][3];
        for(int i =0; i< grade.length; i++){
            System.out.println((i+1)+"번 학생의 성적");
            for(int j =0; j< grade[i].length; j++){
                if (j==0){
                    System.out.println((i+1)+"번 국어점수 입력");
                } else if (j==1) {
                    System.out.println((i+1)+"번 수학점수 입력");
                } else {
                    System.out.println((i+1)+"번 영어점수 입력");
                }
                grade[i][j] = input.nextInt();
            }
        }
        for(int i =0; i< grade.length; i++){
            for(int j =0; j< grade[i].length; j++){
                sum+=grade[i][j];
            }
            System.out.println((i+1)+"번 학생 합계"+sum);
            aver=(double)sum/ grade[i].length;
            System.out.println((i+1)+"번 학생 평균"+aver);
            sum = 0;
            aver = 0;
        }
    }
}
