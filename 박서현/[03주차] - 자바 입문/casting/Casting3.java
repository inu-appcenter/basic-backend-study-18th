package casting;

public class Casting3 {
    public static void main(String[] args){
        long mxi = 2147483647;
        long maxover =  2147483648L;
        int iv;

        iv = (int)mxi;
        System.out.println(iv);
        iv = (int)maxover;
        System.out.println(iv);

    }
}
