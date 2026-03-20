package array;

//8강-6
public class HelloJava8_6 {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};
        //일반 for문
        for(int i =0; i<numbers.length; i++){
            int number = numbers[i];
            System.out.println(number);
        }
        //향상된 for문
        for(int numebr : numbers){ //(단축기 iter작성 후 엔터)
            System.out.println(numebr);
        }
    }
}