package codeTree.noviceLow.string.부분문자열위치;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String sub = sc.nextLine();

        System.out.println(s.indexOf(sub));

    }
}
