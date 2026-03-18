package method;

//9강-4
public class HelloJava9_4 {
    public static void main(String[] args){
        cheakAge(10);
        cheakAge(20);

    }
    public static void cheakAge(int age){
        if (age < 18){
            System.out.println(age+"살 입장 불가");
            return; //return 만나면 그 뒤 코드 전부 무시하고 넘어감
        }

        System.out.println(age+"살 입장 가능");
    }
}
