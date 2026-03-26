package casting;

public class Casting1 {
    public static void main(String[] args){
        int intValue = 10;
        long longV;
        double doubleV;

        longV = intValue;
        System.out.println(longV);
        doubleV = intValue;
        System.out.println(doubleV);

        //명시적 형변환
        double dv = 1.5;
        int iv;

        iv = (int)dv;
        System.out.println(iv);
    }
}
