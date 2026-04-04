package loop.ex;

public class NestedEx2 {

    public static void main(String[] args) {


        int row = 6;
        for(int i = 1 ; i <= row ; i++){ //1234
            for ( int k = 1 ; k <= i ; k++){
                System.out.print(" ");
            }
            for( int j = row ; j >= i ; j--){ // 6543
                System.out.print("**");
            }
            for ( int k = 1 ; k <= i ; k++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
