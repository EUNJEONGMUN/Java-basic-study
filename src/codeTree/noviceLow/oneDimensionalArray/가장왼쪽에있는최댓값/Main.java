package codeTree.noviceLow.oneDimensionalArray.가장왼쪽에있는최댓값;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[sc.nextInt()];

        for (int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int idx = arr.length;
        int max_val = 0;
        while (idx>0) {
            for (int i=idx-1; i>=0; i--) {
                if (max_val<=arr[i]) {
                    max_val = arr[i];
                    idx = i;
                }
            }
            System.out.print(idx+1+" ");
            max_val = 0;
        }


    }
}
