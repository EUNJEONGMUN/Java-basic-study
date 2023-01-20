package 이코테.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q7_boj18460_럭키스트레이트 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String number = bf.readLine();
        int left = 0;
        int right = 0;

        for (int i=0; i<number.length()/2; i++) {
            left += number.charAt(i)-'0';
        }

        for (int i=number.length()/2; i<number.length(); i++) {
            right += number.charAt(i)-'0';
        }
        if (left==right) {
            System.out.println("LUCKY");
        } else {
            System.out.println("READY");
        }
    }
}
