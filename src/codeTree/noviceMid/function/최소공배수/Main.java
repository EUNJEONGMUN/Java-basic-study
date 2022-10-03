package codeTree.noviceMid.function.최소공배수;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = getGCD(a, b);
        int lcm = gcd*(a/gcd)*(b/gcd);
        System.out.println(lcm);

    }

    public static int getGCD (int num1, int num2){
        if (num1%num2 == 0) {
            return num2;
        }
        return getGCD(num2, num1%num2);

    }
}
