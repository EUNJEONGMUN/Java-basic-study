package baekjoon.array.boj_1546;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(arr);
        int maxValue = arr[n-1];
        double avg = 0;
        for (int i=0; i<n; i++) {
            avg += (double) arr[i]/maxValue*100;
        }
        System.out.println(avg/n);

    }
}
