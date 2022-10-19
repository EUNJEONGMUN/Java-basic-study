package codeTree.noviceMid.simulation2.sequence;

import java.util.Scanner;

public class 연속되는수4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = sc.nextInt();
        int cnt = 1;
        int max_cnt = 1;
        for (int i=0; i<n-1; i++) {
            int temp = sc.nextInt();
            if (num<temp) {
                cnt++;
            } else {
                if (max_cnt<cnt) {
                    max_cnt = cnt;
                }
                cnt = 1;
            }
            num = temp;
        }

        System.out.println(Math.max(max_cnt, cnt));

    }
}
