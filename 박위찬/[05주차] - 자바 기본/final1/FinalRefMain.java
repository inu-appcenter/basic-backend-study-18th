package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();
        //data = new Data(); //final 변경 불가 컴파일 오류

        //참조 대상의 값은 변경 가능 (공간 1개만 만든다는 것이므로 그 공간(객체)은 사용할 수 있음-> 이후 다른 공간(객체)을 만들 수 없음)
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
