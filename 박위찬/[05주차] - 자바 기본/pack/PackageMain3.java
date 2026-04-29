package pack;

import pack.a.User;
// import pack.b.User; 이 import는 사용 불가

public class PackageMain3 {
    public static void main(String[] args) {
        User user = new User();
        pack.b.User userB = new pack.b.User(); // 내용은 다르지만 User라는 이름으로 이미 a가 import 진행함 -> b는 경로를 다 써줘야 함
    }
}
