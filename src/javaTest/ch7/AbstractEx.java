package javaTest.ch7;

import java.io.InputStream;

class Shape {
    int x;
    int y;
}
class Circle extends Shape {

    void print() {
        System.out.println("circle");
    }
}

class Triangle extends Shape {
    void print() {
        System.out.println("print2");
    }
}
public class AbstractEx {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        Circle c = new Circle();
        Shape st = new Triangle();
    }
}
