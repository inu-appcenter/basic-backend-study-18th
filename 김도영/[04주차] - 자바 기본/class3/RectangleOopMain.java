package class3;

public class RectangleOopMain {
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle();
        rectangle.width = 2;
        rectangle.height = 2;

        int area = rectangle.calculateArea();
        System.out.println("넓이: "+area);

        int perimeter = rectangle.calculatePerimeter();
        System.out.println("둘레길이: "+perimeter);

        boolean squre = rectangle.isSquare();
        System.out.println("정사각형 여부: "+squre);
    }
}
