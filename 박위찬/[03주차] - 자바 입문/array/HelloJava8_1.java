package array;

//8강-1
public class HelloJava8_1 {
    public static void main(String[] args){
        //같은 타입의 변수를 반복해서 선언하고 반복해서 사용하는
        //문제를 해결하는 것이 배열이다.
        int[] students; //배열 변수 선언
        students =new int [5]; //배열 생성

        //뱐수 값 대입(배열은 0부터 시작함)
        students[0] = 90;
        students[1] = 70;
        students[2] = 80;
        students[3] = 40;
        students[4] = 50; // 변수에 있는 참조값을 통해 실제 배열에 접근. 인덱스를 사용해서 해당 위치의 요소에 접근, 값 대입

        System.out.println("학생1 점수 " + students[0]);
        System.out.println("학생2 점수 " + students[1]);
        System.out.println("학생3 점수 " + students[2]);
        System.out.println("학생4 점수 " + students[3]);
        System.out.println("학생5 점수 " + students[4]);
        System.out.println("students = " + students); //참조값

        //리펙토링:기존의 코드 기능은 유지하면서 내부 구조를 개선
        for (int i=0; i<5; i++){
            System.out.println("학생"+(i+1)+"점수 : "+ students[i]);
        }
    }
}
