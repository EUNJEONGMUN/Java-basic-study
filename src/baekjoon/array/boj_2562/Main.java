package baekjoon.array.boj_2562;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int INT_MIN = Integer.MIN_VALUE;

        Scanner sc  = new Scanner(System.in);
        int[] arr = new int[9];

        for (int i=0; i<9; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int maxValue = INT_MIN;
        int maxIdx = 0;

        for (int i=0; i<9; i++) {
            if (arr[i]>maxValue) {
                maxValue = arr[i];
                maxIdx = i+1;
            }
        }
        System.out.println(maxValue);
        System.out.println(maxIdx);
    }
}
