package codeTree.noviceLow.string.두문자열이어붙였을때;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s2 = sc.nextLine();

        String a = s+s2;
        String b = s2+s;

        if (a.equals(b)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
