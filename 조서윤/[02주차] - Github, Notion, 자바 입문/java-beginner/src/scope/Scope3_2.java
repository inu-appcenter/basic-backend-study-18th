package scope;

public class Scope3_2 {

    static void main() {
        int m = 10;
        if (m > 0) {
            int temp = m * 2;
            System.out.println("temp = " + temp);
        }
        //System.out.println(temp);
        System.out.println("m = " + m);
    }
}
