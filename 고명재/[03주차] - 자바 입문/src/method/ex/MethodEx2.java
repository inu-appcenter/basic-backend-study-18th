package method.ex;

public class MethodEx2 {
    public static void main(String[] args){
        printMessage("HELLO WORLD",3);
    }
    public static void printMessage(String message, int a){
        for(int i=0 ; i<a; i++){
            System.out.println(message);
        }
    }
}
