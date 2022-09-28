package codeTree.noviceLow.oneDimensionalArray.거래이익최대;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[sc.nextInt()];

        for (int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max_val = 0;

        for (int i=0; i<arr.length-1; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if (arr[j]-arr[i]>max_val) {
                    max_val = arr[j]-arr[i];
                }
            }
        }
        System.out.println(max_val);
    }
}
