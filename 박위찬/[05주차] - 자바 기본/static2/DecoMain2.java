package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil2.deco(s);  //인스턴스 생성 없이 바로 함(객체변수가 없을때 사용/ 메서드만 존재하여 객체 생성이 의미 없을 때)
        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}
