package baekjoon.array.boj_8958;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.next();
        }

        for (String s : arr) {
            System.out.println(calculate(s));
        }

    }

    private static int calculate(String s) {
        int cnt = 0;
        int res = 0;

        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == 'O') {
                cnt++;
                res+=cnt;
            } else {
                cnt = 0;
            }
        }
        return res;
    }
}
