package loop.ex;

//5강
public class HelloJava5_ex3 {
    public static void main(String[] args){
        int sum=0;
        int max=10;
        int i=1;

        while (i<=max){
            sum+=i;
            i++;
        }
        System.out.println(sum);

        sum=0;

        for (int j=1; j<=max; j++ ){
            sum+=j;
        }
        System.out.println(sum);
    }
}
