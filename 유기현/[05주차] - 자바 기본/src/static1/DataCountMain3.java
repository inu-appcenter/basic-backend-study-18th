package static1;

public class DataCountMain3 {
    public static void main(String [] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count = " + Data3.count); //Data3.count 클래스에 직접 접근

        Data3 data2 = new Data3("B");
        System.out.println("B count = " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count = " + Data3.count);

        //추가
        //인스턴스를 통한 접근
        Data3 data4 = new Data3("D");
        System.out.println(data4.count); //권장하지 않는다.
        //기져다 쓰는 입장에서 인스턴스 변수로 착각한다.

        //클래스를 통한 접근
        System.out.println(Data3.count);
    }
}
