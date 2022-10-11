package codeTree.noviceMid.simulation1.dateAndTime;

import java.util.Scanner;

public class 그요일은 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        int idx = find_idx(sc.next());

        int start = cal_days(m1, d1);
        int end = cal_days(m2, d2);

        if ((end-start-idx)<0){
            System.out.println(0);
        } else {
            System.out.println((end - start - idx) / 7 + 1);
        }
    }

    private static int find_idx(String day) {
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int idx = -1;
        for (int i = 0; i<7; i++) {
            if (day.equals(days[i])) {
                idx = i;
                break;
            }
        }
        return idx;
    }

    private static int cal_days(int m, int d) {
        int[] arr = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int day = 0;
        for (int i=1; i<m; i++) {
            day+=arr[i];
        }
        day += d;

        return day;
    }
}
