package loop.ex;

public class WhileEx2 {

    public static void main(String[] args) {

        int num = 1;
        int even = 0;
        while(even < 10){

            if(num % 2 == 0){
                System.out.println(num);
                even++;
            }
            num++;
        }
    }
}
