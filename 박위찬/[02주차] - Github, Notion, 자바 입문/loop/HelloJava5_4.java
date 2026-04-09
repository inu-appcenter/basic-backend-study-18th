package loop;

//5강_4
public class HelloJava5_4 {
    public static void main(String[] args){
        //break : 반복문 즉시 종료
        //continue : 반복문의 나머지 부분 건너뛰고 다음 반복으로 넘어가기
        //while, for문 전부 사용 가능
        int sum=0;
        int i=1;

        while(true) {
            sum +=i;
            if (sum>10){
                System.out.println("합이 10보다 크면 종료->"+sum);
                break; //반복문을 빠져나감
            }
            i++;
        }

        i=1;
        while (i<=5){
            if (i==3){
                i++;
                continue; //뒷 부분을 전부 무시하고 while 조건 비교로 돌아감
            }
            System.out.println(i);
            i++;
        }
    }
}
