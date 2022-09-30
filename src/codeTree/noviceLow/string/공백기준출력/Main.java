package codeTree.noviceLow.string.공백기준출력;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s2 = sc.nextLine();
        String[] arr = s.split(" ");
        String[] arr2 = s2.split(" ");

        for (String ss : arr) {
            System.out.print(ss);
        }
        for (String ss : arr2) {
            System.out.print(ss);
        }

    }
}
