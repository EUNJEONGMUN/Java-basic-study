package codeTree.noviceMid.bruthForce1.자리수단위로완전탐색;

import java.util.Scanner;

public class 모이자 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min_value = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int distance = 0;
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                distance += Math.abs(i - j) * arr[j];
            }
            min_value = Math.min(min_value, distance);
        }

        System.out.println(min_value);
    }
}
