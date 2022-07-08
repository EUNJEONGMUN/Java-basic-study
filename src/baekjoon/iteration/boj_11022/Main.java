package baekjoon.iteration.boj_11022;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        for (int i=1; i<=tc; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Case #"+i+": "+a+" + "+b+" = "+(a+b));
        }

        sc.close();
    }
}
