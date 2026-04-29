package scope;

public class Scope3_2 {

    public static void main(String[] args) {

        int m = 10;
        if( m > 0){
            int temp = 2 * m;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);;
    }
}
