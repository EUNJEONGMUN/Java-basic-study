package codeTree.noviceLow.oneDimensionalArray.두숫자차최소;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[sc.nextInt()];

        for (int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int min_val = 100;

        for (int i=0; i<arr.length-1; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if (arr[j]-arr[i]<min_val) {
                    min_val = arr[j]-arr[i];
                }
            }
        }
        System.out.println(min_val);
    }
}
