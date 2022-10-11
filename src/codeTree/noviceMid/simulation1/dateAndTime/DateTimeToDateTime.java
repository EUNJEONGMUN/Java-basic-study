package codeTree.noviceMid.simulation1.dateAndTime;

import java.util.Scanner;

public class DateTimeToDateTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int BASE_TIME = (11*24*60)+(11*60)+11;
        int d = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();
        int res = 0;
        res = ((d*24*60)+(h*60)+m)-BASE_TIME;
        if (res<0) {
            System.out.println(-1);
        } else {
            System.out.println(res);
        }
    }
}
