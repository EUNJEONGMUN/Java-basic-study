package javaTest.ch8;

public class ExceptionEx14 {
    public static void main(String[] args) {
//        try {
//            method1();
//        } catch (Exception e) {
//            System.out.println("main에서 예외처리");
//            e.printStackTrace();
//        }
        method1();
    }
    static void method1(){
        method2();

    }
    static void method2(){
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method2에서 예외처리");
//            e.printStackTrace();
            method3();
        }
    }
    static void method3(){
        System.out.println("3실행");
    }
}
