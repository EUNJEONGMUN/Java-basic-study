package baekjoon.array.boj_2577;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        String sum = Integer.toString(a*b*c);

        int[] arr = {0,0,0,0,0,0,0,0,0,0};

        for (int i=0; i<sum.length(); i++) {
            int idx = sum.charAt(i)-'0';
            arr[idx]++;
        }

        for (int i=0; i<10; i++) {
            System.out.println(arr[i]);
        }
    }
}
