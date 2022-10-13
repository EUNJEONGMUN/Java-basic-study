package codeTree.noviceMid.simulation1.section;

import java.util.Scanner;

public class Block {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n+1];

        for (int i=0; i<k; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            for (int j=start; j<end+1; j++) {
                arr[j] += 1;
            }
        }
        int max_val = 0;
        for (int i=0; i<n+1; i++) {
            if (arr[i]>max_val) {
                max_val = arr[i];
            }
        }
        System.out.println(max_val);
    }
}
