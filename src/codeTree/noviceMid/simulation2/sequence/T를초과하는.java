package codeTree.noviceMid.simulation2.sequence;

import java.util.Scanner;

public class T를초과하는 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int cnt = 0;
        int max_cnt = 0;
        for (int i=0; i<n; i++) {
            int temp = sc.nextInt();
            if (temp>k) {
                cnt++;
            } else {
                if (max_cnt<cnt) {
                    max_cnt = cnt;
                }

                cnt = 0;

            }
        }

        System.out.println(Math.max(max_cnt, cnt));

    }
}
