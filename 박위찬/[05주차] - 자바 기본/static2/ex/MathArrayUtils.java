package static2.ex;

public class MathArrayUtils {
    private MathArrayUtils() {
        //private -> 인스턴스 생성을 막음
    }
    public static int sum(int[] array){
        int sum =0;
        for (int i : array) {
            sum+=i;
        }
        return sum;
    }
    public static double average(int[] array){
        return (double) sum(array) / array.length;
    }
    public static int min(int[] array){
        int min = array[0];
        for (int i=0; i<=array.length-1; i++)
            if (min > array[i]){
                min = array[i];
            }
        return min;
    }
    public static int max(int[] array){
        int max=array[0];
        for (int i=0; i<=array.length-1; i++)
            if (max < array[i]){
                max = array[i];
            }

        return max;
    }

}
