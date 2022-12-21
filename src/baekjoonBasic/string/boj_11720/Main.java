package baekjoonBasic.string.boj_11720;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        sc.close();

        int res = 0;
        for (int i=0; i<n; i++) {
            res+=s.charAt(i)-'0';
        }
        System.out.println(res);
    }
}
