package scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("string:");
            String str = sc.nextLine();
            if(str.equals("exit")){
                break;
            }
            System.out.println(str);
        }
    }
}
