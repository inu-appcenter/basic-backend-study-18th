package loop;

public class Continue1 {

    public static void main(String[] args) {

        int sum = 0;
        int i = 1;

        while(i < 6){
            if( i == 3){
                i++;
                continue;
            }
            sum += i;
            System.out.println("i = " + i + " sum = "+ sum);
            i++;
        }
    }
}
