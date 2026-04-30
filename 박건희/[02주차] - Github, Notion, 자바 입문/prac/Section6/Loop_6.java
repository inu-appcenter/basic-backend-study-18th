package Section6;
//문제풀이
public class Loop_6 {
    static void main() {

        // Q1.
        //while
        int count_1 = 1;
        while (count_1 <= 10) {
            System.out.println(count_1);
            count_1++;
        }
        //for
        for (int i=1;i<11;i++){
            System.out.println(i);
        }

        // Q2.
        // while
        int num_2 = 2;
        int count_2 = 1;
        while (count_2 <= 10) {
            System.out.println(num_2);
            num_2 += 2;
            count_2++;
        }

        //for
        for (num_2 = 2, count_2 = 1; count_2 <= 10; num_2 += 2, count_2++) {
            System.out.println(num_2);
        }

        // Q3.
        //while
        int max_3 = 100;
        int sum_3 = 0;
        int i_3 = 1;

        while (i_3 <= max_3) {
            sum_3 += i_3;
            i_3++;
        }
        System.out.println(sum_3);

        //for
        max_3 = 100;
        sum_3 = 0;

        for (int i = 1; i <= max_3; i++) {
            sum_3 += i;
        }
        System.out.println(sum_3);

        // Q4.
        //while
        int i_4 = 1, j_4 = 1;

        while (i_4 < 9){
            while (j_4 < 9){
                System.out.println(i_4 + " * " + j_4 + " = " + i_4 * j_4);
                j_4++;
            }
            i_4++;
        }

        // for
        for(int i = 1; i <= 9; i++) {
            for(int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }

        // Q5.
        //while
        int rows_5 = 5; // 최대 행

        int i_5=0, j_5=1;

        while (i_5 <= rows_5){
            while (j_5 <= i_5){
                System.out.print("*");
                j_5++;
            }
            System.out.println();
            j_5=1;
            i_5++;
        }

        //for
        for(i_5 = 1; i_5 <= rows_5; i_5++) {

            for(j_5 = 1; j_5 <= i_5; j_5++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }
}
