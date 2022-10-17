package codeTree.noviceMid.simulation1.square;

import java.util.Scanner;

public class 겹치지않는사각형넓이 {
    static int OFFSET = 1000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2001][2001];
        int minX = OFFSET;
        int maxX = -1;
        int minY = OFFSET;
        int maxY = -1;
        for (int i=0; i<2; i++) {
            int x1 = sc.nextInt()+OFFSET;
            int y1 = sc.nextInt()+OFFSET;
            int x2 = sc.nextInt()+OFFSET;
            int y2 = sc.nextInt()+OFFSET;

            for (int x=x1; x<x2; x++) {
                for (int y=y1; y<y2; y++) {
                    arr[x][y] = 1;
                }
            }

            if (minX>x1) {
                minX = x1;
            }
            if (maxX<x2) {
                maxX = x2;
            }
            if (minY>y1) {
                minY = y1;
            }
            if (maxY<y2) {
                maxY = y2;
            }
        }


        int x1 = sc.nextInt()+OFFSET;
        int y1 = sc.nextInt()+OFFSET;
        int x2 = sc.nextInt()+OFFSET;
        int y2 = sc.nextInt()+OFFSET;

        for (int x=x1; x<x2; x++) {
            for (int y=y1; y<y2; y++) {
                arr[x][y] = 0;
            }
        }

        if (minX>x1) {
            minX = x1;
        }
        if (maxX<x2) {
            maxX = x2;
        }
        if (minY>y1) {
            minY = y1;
        }
        if (maxY<y2) {
            maxY = y2;
        }
        int res = 0;
        for (int i=minX; i<maxX+1; i++) {
            for (int j=minY; j<maxY; j++) {
                if (arr[i][j]==1){
                    res++;
                }
            }
        }

        System.out.println(res);
    }
}
