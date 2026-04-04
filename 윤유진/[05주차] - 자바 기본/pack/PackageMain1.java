package pack;

public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data(); // 현재 클래스와 같은 패키지일 때 호출
        pack.a.User user = new pack.a.User(); // 현재 클래스와 다른 패키지일 때 호출
    }
}
