package codeTree.noviceMid.simulation2.dxdy;

import java.util.Scanner;

public class 방향에맞춰이동 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // W←, S↓, N↑, E→
        int[] dx = {-1, 0, 0, 1};
        int[] dy = {0, -1, 1, 0};
        int n = sc.nextInt();
        int X = 0;
        int Y = 0;
        int idx = -1;
        for (int i=0; i<n; i++) {

            char direction = sc.next().charAt(0);
            int move = sc.nextInt();

            if (direction=='W'){
                idx = 0;
            } else if (direction=='S') {
                idx = 1;
            } else if (direction=='N') {
                idx = 2;
            } else {
                idx = 3;
            }
            X+=(dx[idx]*move);
            Y+=(dy[idx]*move);
        }
        System.out.println(X + " " + Y);

    }
}
