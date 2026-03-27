package loop.ex;

public class WhileEx2 {
    public static void main(String[] args){
       int num=1;
       int i=0;
       while(true){
           if(num%2==0){
               System.out.println(num);
               i++;
           }
           if(i==10){
               break;
           }
           num++;
       }
    }
}
