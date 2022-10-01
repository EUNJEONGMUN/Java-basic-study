package codeTree.noviceLow.string.runLength인코딩;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String res = "";
        int cnt = 1;
        for (int i=1; i<s.length()+1; i++) {
            if (i==s.length() || s.charAt(i-1)!=s.charAt(i)) {
                res+=Character.toString(s.charAt(i-1))+String.valueOf(cnt);
                cnt=1;
            } else if (s.charAt(i-1)==s.charAt(i)) {
                cnt++;
            }
        }
        System.out.println(res.length());
        System.out.println(res);
    }
}
