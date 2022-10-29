package javaTest.arraylistTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열을List로변환 {
    public static void main(String[] args) {
        List list1 = Arrays.asList(new Integer[]{1,2,3,4,5});
        List list2 = Arrays.asList(1,2,3,4,5);

        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);

        /**
         * list1 = [1, 2, 3, 4, 5]
         * list2 = [1, 2, 3, 4, 5]
         */

        // list1.add(100); UnsupportedOperationException 예외 발생!

        List list3 = new ArrayList(Arrays.asList(1,2,3,4,5));
        list3.add(100);

        System.out.println("list3 = " + list3);
        /**
         * list3 = [1, 2, 3, 4, 5, 100]
         */

        List list4 = Arrays.asList("홍길동", "김철수", "김영희", null);
        System.out.println("list4 = " + list4);

        /**
         * list4 = [홍길동, 김철수, 김영희, null]
         */

        list4.set(1, "가나다");

        System.out.println("list4 = " + list4);
    }
}
