package java의정석.listTest;

import java.util.*;
import java.util.stream.Collectors;

public class 중복제거 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 1, 1, 1);
        System.out.println("list = " + list);

        Set<Integer> set = new HashSet<>(list);

        List<Integer> list2 = new ArrayList<>(set);
        System.out.println("list2 = " + list2);

        /**
         * list = [1, 2, 3, 4, 5, 1, 1, 1]
         * list2 = [1, 2, 3, 4, 5]
         */

        List<Integer> collect = list.stream().distinct().collect(Collectors.toList());
        System.out.println("collect = " + collect);
        /**
         * collect = [1, 2, 3, 4, 5]
         */

    }
}
