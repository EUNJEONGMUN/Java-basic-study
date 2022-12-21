package baekjoonBasic.array.boj_18018;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 방법1
        // min_value, max_value 이용하기
        final int INT_MIN = Integer.MIN_VALUE;
        final int INT_MAX = Integer.MAX_VALUE;

        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int maxValue = INT_MIN;
        int minValue = INT_MAX;

        for (int i=0; i<n; i++) {
            if (arr[i]>maxValue) {
                maxValue = arr[i];
            }
            if (arr[i]<minValue) {
                minValue = arr[i];
            }
        }
        System.out.printf("%d %d\n", minValue, maxValue);

        // 방법2
        // 정렬 이용하기

        Arrays.sort(arr);
        System.out.printf("%d %d", arr[0], arr[n-1]);

    }
}
