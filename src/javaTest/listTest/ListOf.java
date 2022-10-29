package javaTest.arraylistTest;

import java.util.List;
import java.util.Set;

public class ListOf {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3, 4);
        System.out.println(list1.getClass().getName());
        /**
         * java.util.ImmutableCollections$ListN
         */

        // list1.add(100); UnsupportedOperationException 예외 발생

        List list2 = List.of("홍길동", "김철수", "김영희");
        System.out.println("list2 = " + list2);

//        List list3 = List.of("홍길동", "김철수", "김영희", null); // NullPointerException
//        System.out.println("list3 = " + list3);

        list2.set(1, "가나다");

    }
}
