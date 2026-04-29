package class6;

public class MaxCounter {
    private int count = 0;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        // 검증 로직
        if(count >= max) {
            System.out.println("최댓값 초과 못함.");
            return;
        }

        // 실행 로직
        count++;
    }

    public int getMax() {
        return max;
    }
}
