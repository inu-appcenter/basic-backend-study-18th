package oop1.ex;

public class Rectangle {
    int width = 5;
    int height = 8;
    int area;
    int parimeter;
    boolean square;

     void calculateArea() {
        area = width * height;
        System.out.println("넓이: " + area);
    }

    void calculaterPerimeter() {
        parimeter = 2 * (width + height);
        System.out.println("둘레 길이: " + parimeter);
    }

    void isSquare() {
         square = width == height;
        System.out.println("정사각형 여부: " + square);
    }
}
