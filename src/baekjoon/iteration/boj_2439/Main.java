package baekjoon.iteration.boj_2439;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();

        for (int i=1; i<=n; i++) {
            int cnt = n-i;
            for (int j=0; j<cnt; j++) {
                System.out.print(" ");
            }
            for (int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
