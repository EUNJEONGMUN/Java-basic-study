package codeTree.noviceMid.simulation2.array;

import java.util.Scanner;

public class 선두를지켜라 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Move[] arrA = new Move[n];
        Move[] arrB = new Move[m];
        int total_time = 0;
        for (int i=0; i<n; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            arrA[i] = new Move(v, t);
            total_time+=t;
        }
        for (int i=0; i<m; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            arrB[i] = new Move(v, t);
        }

        double[] distanceA  = new double[total_time+1];
        double[] distanceB  = new double[total_time+1];
        int timeA = 1;
        for (int i=0; i<n; i++) {
            for (int j=0; j<arrA[i].getT(); j++) {
                double perSecond = arrA[i].getD()/arrA[i].getT();
                distanceA[timeA] = distanceA[timeA-1]+perSecond;
                timeA++;
            }
        }
        int timeB = 1;
        for (int i=0; i<m; i++) {
            double perSecond = arrB[i].getD()/arrB[i].getT();
            for (int j=0; j<arrB[i].getT(); j++) {
                distanceB[timeB] = distanceB[timeB-1]+perSecond;
                timeB++;
            }
        }

        System.out.println(calculate(distanceA, distanceB, total_time));



    }

    private static int calculate(double[] distanceA, double[] distanceB, int total_time) {
        char state = state(distanceA[1], distanceB[1]);
        int result = 1;
        for (int i=2; i<total_time+1; i++) {
            char next_state = state(distanceA[i], distanceB[i]);
            if (state != next_state) {
                result++;
                state = next_state;
            }
        }
        return result;


    }

    private static char state(double a, double b) {
        if (a>b) {
            return 'A';
        } else if (a<b) {
            return 'B';
        } else {
            return 'C';
        }
    }
}

class Move {
    private int v;
    private int t;
    private int d;

    public Move(int v, int t) {
        this.v = v;
        this.t = t;
        this.d = v*t;
    }


    public int getT() {
        return t;
    }

    public int getD() {
        return d;
    }
}