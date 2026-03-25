package loop.ex;

public class WhileEx2 {
    public static void main(String[] args){
        int i=0;
        int num=2;
        while(i<10){
            System.out.println(num);
            i++;
            num+=2;
        }

        //for 버전
        for(int j=1, num_ =2; j<11; num_+=2, j++){
            System.out.println(num_);
        }
    }
}
