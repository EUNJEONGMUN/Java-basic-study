package baekjoon.array.boj_4344;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            int num = sc.nextInt();
            int[] arr = new int[num];
            int sum = 0;

            for (int j=0; j<num; j++) {
                arr[j] = sc.nextInt();
                sum += arr[j];
            }

            double avg = (double) sum/num;
            int cnt = 0;
            for (int elem : arr) {
                if (elem>avg) {
                    cnt++;
                }
            }
            System.out.printf("%.3f%%\n",(double) cnt/num*100);

        }


    }
}
