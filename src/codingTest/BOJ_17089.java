package codingTest;

import java.util.*;
import java.util.stream.Collectors;

public class BOJ_17089 {
    public static int n, m;
    public static List<Set<Integer>> tree = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for (int i = 0; i < n + 1; i++) {
            tree.add(new HashSet<>());
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            tree.get(a).add(b);
            tree.get(b).add(a);
        }

        int answer = Integer.MAX_VALUE;
        int a, b, c;
        for (int i = 1; i < n; i++) {
            List<Integer> friends = tree.get(i).stream().collect(Collectors.toList());
            a = i;
            for (int j = 0; j < friends.size(); j++) {
                b = friends.get(j);
                for (int k = j + 1; k < friends.size(); k++) {
                    c = friends.get(k);
                    if (tree.get(b).contains(c)) {
                        answer = Math.min(answer, calculateCount(a, b, c));
                    }
                }
            }
        }
        if (answer == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(answer);
        }
    }

    private static int calculateCount(int i, int j, int k) {
        return (tree.get(i).size()-2)+(tree.get(j).size()-2)+(tree.get(k).size()-2);
    }
}
