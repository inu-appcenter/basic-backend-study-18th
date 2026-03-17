package loop.ex;

public class WhileEx3 {
    public static void main(String[] args) {
        int max=100, i=0;
        int sum=0;

        while(i<100){
            sum+=(++i);
            System.out.println(sum);
        }

        //for 버전
        sum = 0;
        for(i =0; i<max ;i++){
            sum += (i+1);
            System.out.println(sum);
        }
    }
}
