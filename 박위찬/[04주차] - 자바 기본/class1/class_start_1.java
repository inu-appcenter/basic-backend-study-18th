package class1;

public class class_start_1 {
    public static void main(String[] args){
        String[] studentNames= {"학생 1","학생 2"};
        int[] studentAges = {15, 16};
        int[] studentGrades = {90, 80};

        for (int i=0; i<studentNames.length; i++){
            System.out.println("이름:" + studentNames[i] + " 나이:" + studentAges[i] + " 성적:" + studentGrades[i]);
        }
    }
}

//한 학생의 데이터가 3개의 배열에 나누어져 있다. 따라서 데이터를 변경할 때 매우 조심해서 작업해야 한다.
// 예를 들어서 학생 2의 데이터를 제거하려면 각각의 배열마다 학생2의 요소를 정확하게 찾아서 제거해주어야 한다.