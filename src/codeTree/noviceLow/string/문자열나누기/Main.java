package codeTree.noviceLow.string.문자열나누기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        String s = sc.nextLine();
        int cnt = 0;
        String temp = "";
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i)!=' ') {
                cnt++;
                temp+=String.valueOf(s.charAt(i));
            }
            if (cnt==5) {
                System.out.println(temp);
                temp = "";
                cnt = 0;
            }
        }
        if (cnt>0) {
            System.out.println(temp);
        }
    }
}
