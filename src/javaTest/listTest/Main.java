package javaTest.listTest;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        list1.add(0);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println(list1);

        list1.add(1, "AA");

        System.out.println(list1);

        list1.set(5, "BB");

        System.out.println(list1);

        list1.set(7, "CC");

        System.out.println(list1);

    }
}
