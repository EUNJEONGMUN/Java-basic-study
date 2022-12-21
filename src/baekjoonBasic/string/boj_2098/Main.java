package baekjoonBasic.string.boj_2098;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        sc.close();

        String newA = "";
        String newB = "";
        for (int i=a.length()-1; i>=0; i--) {
            newA += a.charAt(i);
            newB += b.charAt(i);
        }

        if (Integer.parseInt(newA)<Integer.parseInt(newB)) {
            System.out.println(newB);
        } else {
            System.out.println(newA);
        }

    }
}
