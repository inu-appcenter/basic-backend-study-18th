package loop;

public class While2_2 {
    public static void main(String[] args) {
        int sum=0;
        int i=1;

        sum+=i;
        System.out.println("i="+1+" sum="+sum);
        i++;

        sum+=i;
        System.out.println("i="+2+" sum="+sum);
        i++;

        sum+=3;
        System.out.println("i="+3+" sum="+sum);
        i++;
    }
}
