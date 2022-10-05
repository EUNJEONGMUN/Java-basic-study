package codeTree.noviceMid.recursion.이상한수열;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));

    }

    public static int solution(int n) {
        if (n<=2) {
            return n;
        }

        return solution(n-1)+solution(n/3);
    }
}
