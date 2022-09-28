package codeTree.noviceLow.oneDimensionalArray.오백근처의수;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        for (int i=0; i<10; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for (int i=0; i<9; i++) {
            if (arr[i]<=500 && arr[i+1]>500) {
                System.out.println(arr[i]+" "+arr[i+1]);
            }
        }
    }
}
