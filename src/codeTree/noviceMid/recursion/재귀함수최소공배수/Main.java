package codeTree.noviceMid.recursion.재귀함수최소공배수;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];


        for (int i=0; i<n; i++){
            arr[i]  = sc.nextInt();
        }
        int res = arr[0];
        for (int i=1; i<n; i++) {
            res = res*arr[i]/solution(res, arr[i]);
        }
        System.out.println(res);
    }

    public static int solution(int a, int b) {
        if (b == 0) {
            return a;
        }
        return solution(b,a % b);

    }
}
