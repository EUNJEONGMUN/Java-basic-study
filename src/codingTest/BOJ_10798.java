package codingTest;

import java.util.Scanner;

public class BOJ_10798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[5];

        for (int i=0; i<5; i++) {
            arr[i] = sc.next();
        }
        sc.close();

        int idx = 0;
        int num = 0;
        boolean[] finishArr = new boolean[5];
        int finish = 0;
        while (true) {
            if (arr[num].length()>idx) {
                System.out.print(arr[num].charAt(idx));
            } else {
                if (!finishArr[num]){
                    finishArr[num] = true;
                    finish++;
                }
            }

            if (finish==5) {
                break;
            }

            if (num==4) {
                idx++;
            }
            num = (num+1)%5;
        }
    }
}
