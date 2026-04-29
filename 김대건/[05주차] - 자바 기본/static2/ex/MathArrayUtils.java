package static2.ex;

public class MathArrayUtils {


    private MathArrayUtils() {
    }

    static int sum(int[] values){
        int sum=0;
        for (int i : values) {
            sum+=i;
        }
        return sum;
    }
    static double average(int[] values){
        return (double) sum(values) / values.length;
    }
    static int min(int[] values){
        int min = values[0];
        for (int i = 1; i < values.length; i++) {
            if(min > values[i]){
                min = values[i];
            }
        }
        return min;
    }
    static int max(int[] values){
        int max = values[0];
        for (int i = 1; i < values.length; i++) {
            if(max < values[i]){
                max = values[i];
            }
        }
        return max;
    }
}
