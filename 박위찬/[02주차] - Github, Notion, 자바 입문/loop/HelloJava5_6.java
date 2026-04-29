package loop;

//5강_6
public class HelloJava5_6 {
    public static void main(String[] args){
        /*int sum=0;
        int i=1;
        for(;;){ //while (true)와 같음
            if (sum > 10){
                System.out.println(sum);
                break;
            }
            sum+=i;
            i++;
        }// 위 코드를 아래와 같이 표현할 수 있음*/
        int sum=0;
        for (int i=1; ; i++){
            if (sum > 10){
                System.out.println(sum);
                break;
            }
            sum+=i;
        }

    }
}
