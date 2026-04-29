package static2;

public class DecoMain1 {

    public static void main(String[] args) {

        String s = "Hello Java";

        DecoUtll1 utils = new DecoUtll1();
        String deco = utils.deco(s);

        System.out.println("before : " + s);
        System.out.println("after : " + deco);

    }
}
