package array;

//8강-2
public class HelloJava8_2 {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};//배열 생성 및 초기화
        // 따로 쓰면 간략화 불가능 ex) 밑 코드
        int[] students2;
        students2 = new int[]{90, 80, 70, 60, 50}; // 여기서는 new int[]를 생략하면 안됨
        for (int i = 0; i < 5; i++) {
            System.out.println("학생" + (i + 1) + "점수 : " + students[i]);

            }
        }
    }