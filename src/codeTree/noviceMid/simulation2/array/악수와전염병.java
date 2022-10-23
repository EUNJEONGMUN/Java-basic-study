package codeTree.noviceMid.simulation2.array;

import java.util.Arrays;
import java.util.Scanner;

public class 악수와전염병 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int P = sc.nextInt();
        int T = sc.nextInt();
        Shake[] arr = new Shake[T];

        int[] count = new int[N+1];
        boolean[] answer = new boolean[N+1];
        for (int i=0; i<T; i++) {
            int time = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[i] = new Shake(time, x, y);
        }

        Arrays.sort(arr);
        answer[P] = true;

        for (int i=0; i<T; i++) {
            if (answer[arr[i].x]==true){
                count[arr[i].x]++;
            }
            if (answer[arr[i].y]==true){
                count[arr[i].y]++;
            }
            if (answer[arr[i].x] && count[arr[i].x]<=K) {
                answer[arr[i].y] = true;
            }
            if (answer[arr[i].y] && count[arr[i].y]<=K) {
                answer[arr[i].x] = true;
            }

        }

        for(int i=1; i<answer.length; i++) {
            if (answer[i]) {
                System.out.print(1);
            } else {
                System.out.print(0);
            }

        }
    }
}

class Shake implements Comparable<Shake>{
    int time;
    int x;
    int y;

    public Shake(int time, int x, int y) {
        this.time = time;
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Shake o) {
        return time-o.time;
    }
}