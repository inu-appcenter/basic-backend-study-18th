package scope;

//6강_3
public class HelloJava6_3_scope_end {
    public static void main(String[] args){
        // 불필요한 메모리 낭비를 줄이기 위해 scope가 필요하다.
        // 한 블럭에만 사용되는 변수를 계속 끌고가면 메모리 낭비.
        int sum = 0;
        int i = 1;
        int endNum = 3;
        while (i <= endNum) {
            sum = sum + i;
            System.out.println("i=" + i + " sum=" + sum);
            i++;
        }
        //... 아래에 더 많은 코드들이 있다고 가정
        //-> while문의 경우 변수 i의 스코프가 main()메서드 전체가 된다. 반면에 for문의 경우
        // 변수 i의 scope가 for문 안으로  한정되어 메모리 효율이 증가한다.
    }
}
