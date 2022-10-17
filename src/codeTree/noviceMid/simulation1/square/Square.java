package codeTree.noviceMid.simulation1.square;

import java.util.Scanner;

public class Square {
    static int OFFSET = 100;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[201][201];
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            int x1 = sc.nextInt()+OFFSET;
            int y1 = sc.nextInt()+OFFSET;
            int x2 = sc.nextInt()+OFFSET;
            int y2 = sc.nextInt()+OFFSET;

            for (int x=x1; x<x2; x++) {
                for (int y=y1; y<y2; y++) {
                    arr[x][y] = 1;
                }
            }
        }
        int cnt = 0;
        for (int i=0; i<201; i++) {
            for (int j=0; j<201; j++) {
                if (arr[i][j]>0) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);

    }

}
