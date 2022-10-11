package codeTree.noviceMid.simulation1.dateAndTime;

import java.util.Scanner;

public class DateToDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        int res = 0;
        if (m1==m2) {
            System.out.println(d2-d1+1);
        } else {
            for (int i=m1+1; i<m2; i++){
                res+=arr[i];
            }
            System.out.println((arr[m1]-d1)+(res)+d2+1);
        }

    }
}
