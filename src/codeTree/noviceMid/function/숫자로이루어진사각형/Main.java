package codeTree.noviceMid.function.숫자로이루어진사각형;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start_num = 1;
        for (int i=0; i<n; i++){
            printNumber(start_num);
            start_num+=n;
        }

    }

    public static void printNumber(int start) {
        for (int i=start; i<start+4; i++) {
            System.out.print(i%10+" ");
        }
        System.out.println();
    }
}
