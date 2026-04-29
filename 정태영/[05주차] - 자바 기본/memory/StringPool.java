package memory;

public class StringPool {
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "java";

        if(s1 == s2){
            System.out.println("s1 == s2");
        }else{
            System.out.println("s1 != s2");
        }

        String s3 = new String("java");
        String s4 = new String("java");

        if(s3 == s4){
            System.out.println("s3 == s4");
        }else{
            System.out.println("s3 != s4");
        }
    }
    
}
