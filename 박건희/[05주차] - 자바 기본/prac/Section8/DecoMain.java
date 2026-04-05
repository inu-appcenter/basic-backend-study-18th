package Section8;

public class DecoMain {

    static void main() {

        String s = "hello java";

        DecoUtil1 utils = new DecoUtil1();
        String deco = utils.deco(s);

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }

}
