package javaTest.ch11;

import java.util.Comparator;
import java.util.TreeSet;
class MyCompare implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return s1.compareTo(s2)*(-1);
    }
}

public class ComparatorTest {
    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<>(new MyCompare());
        tree.add("aaa");
        tree.add("bbb");
        tree.add("ccc");

        System.out.println("tree = " + tree);
    }
}
