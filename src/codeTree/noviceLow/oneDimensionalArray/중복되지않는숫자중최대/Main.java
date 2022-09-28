package codeTree.noviceLow.oneDimensionalArray.중복되지않는숫자중최대;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int max_val = -1;
        for (int i=0; i<n; i++){
            int cnt = 0;
            for (int num : arr) {
                if (num==arr[i]){
                    cnt++;
                    if (cnt>1) {
                        break;
                    }
                }
            }

            if (cnt<2) {
                max_val = Math.max(max_val, arr[i]);
            }
        }

        System.out.println(max_val);
    }
}
