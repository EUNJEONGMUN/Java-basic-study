package codeTree.noviceMid.simulation2.array;

import java.util.Scanner;

public class 만나는그순간 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arrA = new int[1000001];
        int[] arrB = new int[1000001];
        int secondA = 0;
        int position = 0;
        for (int i=0; i<n; i++) {
            char direction = sc.next().charAt(0);
            int s = sc.nextInt();
            if (direction=='R'){
                for (int j=0; j<s; j++) {
                    arrA[++secondA] = ++position;
                }
            } else {
                for (int j=0; j<s; j++) {
                    arrA[++secondA] = --position;
                }
            }
        }
        int secondB = 0;
        position = 0;
        for (int i=0; i<m; i++) {
            char direction = sc.next().charAt(0);
            int s = sc.nextInt();
            if (direction=='R'){
                for (int j=0; j<s; j++) {
                    arrB[++secondB] = ++position;
                }
            } else {
                for (int j=0; j<s; j++) {
                    arrB[++secondB] = --position;
                }
            }
        }
        boolean mark = false;
        for (int i=1; i<=Math.max(secondA, secondB); i++) {
            if (arrA[i]==arrB[i]) {
                System.out.println(i);
                mark = true;
                break;
            }

        }
        if (!mark) {
            System.out.println(-1);
        }


    }
}
