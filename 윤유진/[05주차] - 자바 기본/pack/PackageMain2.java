package pack;

import pack.a.User;

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data(); // 현재 클래스와 같은 패키지일 때 호출
        User user = new User(); // 현재 클래스와 다른 패키지일 때 호출
    }
}
