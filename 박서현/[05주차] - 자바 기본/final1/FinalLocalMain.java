package final1;

public class FinalLocalMain {

    public static void main(String[] args){
        final int data1;
        data1 = 10;

        final int data2 = 10;

        methon(1);
    }

    static void methon(final int paramerter){
        //parameter = 20; 컴파일 오류
    }
}
