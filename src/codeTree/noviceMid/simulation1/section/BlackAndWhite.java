package codeTree.noviceMid.simulation1.section;

import java.util.Scanner;

public class BlackAndWhite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] black = new int[200001];
        int[] white = new int[200001];
        char[] color = new char[200001];
        int now = 100000;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char direction = sc.next().charAt(0);
            if (direction == 'R') {
                for (int k = now; k < now + x; k++) {
                    black[k] += 1;
                    color[k] = 'B';
                }
                now += x-1;
            } else {
                for (int k = now; k > now - x; k--) {
                    white[k] += 1;
                    color[k] = 'W';
                }
                now -= (x-1);
            }
        }

        int b_cnt = 0;
        int w_cnt = 0;
        int g_cnt = 0;
        for (int i=0; i<200001; i++) {
            if (black[i]>1 && white[i]>1) {
                g_cnt++;
            } else {
                if (color[i]=='B'){
                    b_cnt++;
                } else if(color[i]=='W') {
                    w_cnt++;
                }
            }
        }
        System.out.println(w_cnt+ " " + b_cnt + " " + g_cnt);

    }
}
