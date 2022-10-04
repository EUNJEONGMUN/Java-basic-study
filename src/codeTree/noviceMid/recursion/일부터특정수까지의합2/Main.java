package codeTree.noviceMid.recursion.일부터특정수까지의합2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
    public static int solution(int n) {
        if (n==1) {
            return 1;
        }
        return n+solution(n-1);
    }
}
