package codeTree.noviceMid.simulation1.dateAndTime;

import java.util.Scanner;

public class 요일맞추기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int start = 0;
        int end = 0;

        for (int i=1; i<m1; i++) {
            start+=arr[i];
        }
        for (int i=1; i<m2; i++) {
            end+=arr[i];
        }
        start+=d1;
        end+=d2;

        if (end-start<0) {
            System.out.println(days[7+((end-start)%7)]);
        } else {
            System.out.println(days[(end-start)%7]);
        }
    }
}
