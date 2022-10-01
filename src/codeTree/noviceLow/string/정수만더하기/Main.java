package codeTree.noviceLow.string.정수만더하기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt = 0;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i)>='0'&&s.charAt(i)<='9') {
                cnt += s.charAt(i)-'0';
            }
        }
        System.out.println(cnt);
    }
}
