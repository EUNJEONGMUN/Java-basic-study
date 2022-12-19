package javaTest.ch12;

public class AnnotationEx1 {
    public static void main(String[] args) {
        Parent p = new Child();
    }
}
class Parent {
    void parentMethod() {}
}
class Child extends Parent {
    @Override
    void parentMethod() {}
}
