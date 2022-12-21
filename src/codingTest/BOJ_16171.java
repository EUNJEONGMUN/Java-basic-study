package codingTest;

import java.util.Scanner;

public class BOJ_16171 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String k = sc.next();
        String new_s = "";
        sc.close();

        int left = 0;
        int right = 0;
        int idx = 0;

        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i)>='A' && s.charAt(i)<='z') {
                new_s+=s.charAt(i);
            }
        }

        while (right<new_s.length()) {
            if (new_s.charAt(right) == k.charAt(idx)) {
                idx++;
                right++;
            } else {
                left++;
                while(left<new_s.length() && new_s.charAt(left) != k.charAt(0)) {
                    left++;
                }
                right = left;
                idx=0;
            }

        }

        if (idx==k.length()) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
