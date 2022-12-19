package javaTest.ch8;

public class ExceptionEx13 {
    public static void main(String[] args) {
        method1();
    }
    static void method1() {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method1에서 예외처리");
            e.printStackTrace();
        }
    }
}
