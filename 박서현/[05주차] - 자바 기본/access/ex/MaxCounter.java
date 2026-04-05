package access.ex;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max){
        this.max = max;
    }

    public void increment(){
        if (count<=max)
            count +=1;
        else
            System.out.println("no");
    }
    public int getCount(){
        return count;
    }
}
