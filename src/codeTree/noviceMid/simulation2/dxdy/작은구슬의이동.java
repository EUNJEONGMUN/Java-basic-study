package codeTree.noviceMid.simulation2.dxdy;

import java.util.Scanner;

public class 작은구슬의이동 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dx = {-1, 0, 0, 1};
        int[] dy = {0, -1, 1, 0};
        int n = sc.nextInt();
        int t = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        char c = sc.next().charAt(0);
        int dir = getDir(c);
        for (int i=0; i<t; i++) {
            int tempX = X+dx[dir];
            int tempY = Y+dy[dir];
            if (!checkRange(tempX, tempY, n)){
                dir = 3-dir;
                continue;
            }
            X = tempX;
            Y = tempY;
        }
        System.out.println(X + " " + Y);

    }

    private static int getDir(char direction) {
        if (direction =='U'){
            return 0;
        } else if (direction =='L') {
            return 1;
        } else if (direction =='R') {
            return 2;
        } else {
            return 3;
        }
    }
    private static boolean checkRange(int x, int y, int n) {
        if (x>0 && y>0 && x<=n && y<=n) {
            return true;
        }
        return false;

    }
}
