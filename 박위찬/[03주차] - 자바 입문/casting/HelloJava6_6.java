package casting;

//6강_6
public class HelloJava6_6 {
    public static void main(String[] args){
        long maxIntValue = 2147483647; //int 최고값
        long maxIntOver = 2147483648L; //int 최고값 넘으면 숫자 뒤에 L 적어줌
        int intValue = 0;

        intValue = (int) maxIntValue; //형변환
        System.out.println("intValue = " + intValue);

        intValue = (int) maxIntOver; //형변환
        System.out.println("intValue = " + intValue);
        // int 범위가 넘어가면 오버플로우 발생
        // 오버플로우 발생시 int의 가장 낮은 값인-2147483648부터 다시 시작
    }
}
