package baekjoon.iteration.boj_1110;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in  = new Scanner(System.in);
        int N = in.nextInt();
        int count = 0;
        int num = N;
        in.close();
        while (true) {

            int left = num%10;
            int right = ((num/10)+left)%10;
            num = left*10+right;
            count+=1;

            if (num == N) {
                System.out.println(count);
                break;
            }
        }
    }
}
