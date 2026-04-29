package loop;

//5강_2
public class HelloJava5_2 {
    public static void main(String[] args){
        int count=0;
        int sum=0;

        while (count<100){
            count+=1;
            sum +=count;
            
        }
        System.out.println("sum = " + sum);

    }
}
