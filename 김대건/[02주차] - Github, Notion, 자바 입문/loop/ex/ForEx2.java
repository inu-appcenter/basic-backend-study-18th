package loop.ex;

public class ForEx2 {

    public static void main(String[] args) {

        int num = 1;
        for(int  even = 0; even < 10; num++){
            if(num % 2 == 0){
                System.out.println(num);
                even++;
            }
        }
    }
}
