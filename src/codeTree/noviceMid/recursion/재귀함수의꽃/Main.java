package codeTree.noviceMid.recursion.재귀함수의꽃;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recursion(n);
    }

    public static void recursion(int n) {
        if (n==0){
            return;
        }
        System.out.print(n+" ");
        recursion(n-1);
        System.out.print(n+" ");

    }
}
