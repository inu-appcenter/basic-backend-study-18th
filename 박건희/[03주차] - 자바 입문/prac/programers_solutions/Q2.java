package programers_solutions;

public class Q2 {

    class Solution {
        public int solution(int[] num_list) {
            int answer = 0;

            int sum_odd_num = 0;
            int sum_even_num = 0;

            for ( int i = 0; i < num_list.length; i++ ){
                if ( ( i % 2 ) == 1 ){

                    sum_odd_num += num_list[i];

                }
                else {

                    sum_even_num += num_list[i];

                }

                if ( sum_odd_num > sum_even_num ){
                    answer = sum_odd_num;
                }
                else{
                    answer = sum_even_num;
                }

            }

            return answer;
        }
    }
}
