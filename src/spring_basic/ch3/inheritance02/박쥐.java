package spring_basic.ch3.inheritance02;

public class 박쥐 extends 포유류 implements 날수있는{
    박쥐() {
        myClass="박쥐";
    }
    @Override
    public void fly() {
        System.out.println(myClass+" 날고 있음. 슈웅!!! 슈웅!!!");
    }
}
