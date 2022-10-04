package codeTree.noviceMid.function.팰린드롬;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (isPalindrome(s)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    public static boolean isPalindrome(String s) {
        int n;
        if (s.length()%2==0) {
            n = s.length()/2;
        } else {
            n = (s.length()+1)/2;
        }
        for (int i=0; i<n; i++) {
            if (s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
