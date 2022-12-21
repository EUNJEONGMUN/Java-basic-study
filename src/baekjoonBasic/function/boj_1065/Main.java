package baekjoonBasic.function.boj_1065;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        boolean[] arr = new boolean[n+1];

        for (int i=1; i<n+1; i++) {
            if (solution(i)) {
                arr[i] = true;
            }
        }
        int res = 0;
        for (int i=1; i<n+1; i++) {
            if (arr[i]) {
                res++;
            }
        }
        System.out.println(res);
    }

    private static boolean solution(int num) {
        String s = String.valueOf(num);

        if (s.length()>2) {
            int temp1 = s.charAt(0)-'0';
            int temp2 = s.charAt(1)-'0';
            int sub = temp2-temp1;
            for (int i=2; i<s.length(); i++) {
                temp1 = s.charAt(i-1)-'0';
                temp2 = s.charAt(i)-'0';
                if (temp2-temp1 != sub) {
                    return false;
                }
            }
            return true;
        } else {
            return true;
        }

    }
}
