package codeTree.noviceMid.recursion.숫자차례로출력;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printNumberAsc(n);
        System.out.println();
        printNumberDesc(n);
    }

    private static void printNumberDesc(int n) {
        if (n==0) {
            return;
        }
        System.out.print(n+" ");
        printNumberDesc(n-1);
    }

    private static void printNumberAsc(int n) {
        if (n==0) {
            return;
        }
        printNumberAsc(n-1);
        System.out.print(n+" ");
    }
}

