package codeTree.noviceMid.function.특정구간의합;

import java.util.Scanner;

public class Main {
    public static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i]  = sc.nextInt();
        }

        for (int i=0; i<m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(sum(a, b));
        }


    }
    public static int sum(int a, int b) {
        int res = 0;
        for (int i=a-1; i<b; i++) {
            res += arr[i];
        }
        return res;

    }
}
