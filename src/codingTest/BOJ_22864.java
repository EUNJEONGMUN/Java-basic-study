package codingTest;

import java.util.Scanner;

public class BOJ_22864 {
    public static void main(String[] args) {
        int HOUR = 24;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int m = sc.nextInt();

        int power = 0;
        int work = 0;
        int i = 0;

        if (a>m) {
            System.out.println(0);
        } else {
            while (i<24) {
                if (power==0) {
                    power += ((int)m/a)*a;
                    work += ((int)m/a)*b;
                    i += (int)m/a;
                } else {
                    power -= c;
                    if (power<0) {
                        power = 0;
                    }
                    i++;
                }
            }
            System.out.println(work);
        }
    }
}
