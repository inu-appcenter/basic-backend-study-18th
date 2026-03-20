package method.ex;

//9강
public class HelloJava9_ex2 {
    public static void main(String[] args){

        message(3);
        System.out.println("=========");
        message(5);
        System.out.println("=========");
        message(7);
    }
    public static void message(int a){
        for (int i = 0; i < a; i++){
            System.out.println("Hello, world");
        }
    }
}
