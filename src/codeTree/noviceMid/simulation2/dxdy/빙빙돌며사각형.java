package codeTree.noviceMid.simulation2.dxdy;

import java.util.Scanner;

public class 빙빙돌며사각형 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];

        int num = 1;
        int dir = 0;

        int X=0;
        int Y=-1;
        for (int i=0; i<n*m; i++) {
            int nx = X+dx[dir];
            int ny = Y+dy[dir];
            if (checkRange(nx, ny, n, m) && arr[nx][ny]==0){
                arr[nx][ny] = num++;
                continue;
            }

        }
        System.out.println(X + " " + Y);

    }

    private static boolean checkRange(int x, int y, int n, int m) {
        if (x>=0 && y>=0 && x<n && y<m) {
            return true;
        }
        return false;

    }
}
