package cond;

//4강_2
public class HelloJava4_2 {
    public static void main(String[] args){
        int age=10;

        if (age<=7) {
            System.out.println("미취학");
        }
        if (age>7 && age<14) {
            System.out.println("초등학생");
        }
        if (age>=14 && age<=16) {
            System.out.println("중학생");
        }
        if (age>=17 && age<=19) {
            System.out.println("고등학생");
        }
        if (age>= 20) {
            System.out.println("성인");
        }

        // else if -> if문의 조건이 거짓일 때 다음 조건을 검사
        if(age <= 7) {
            System.out.println("미취학");
        } else if(age <= 13) {
            System.out.println("초등학생");
        } else if(age <= 16) {
            System.out.println("중학생");
        } else if(age <= 19) {
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
        }
    }
}
