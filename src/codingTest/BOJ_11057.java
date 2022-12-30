package codingTest;

import java.util.Scanner;

public class BOJ_11057 {
    static int[][] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        dp = new int[N][10];
        for (int j = 0; j < 10; j++) {
            dp[0][j] = 1;
        }

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < 10; j++) {
                int sum = 0;
                for (int k = j; k < 10; k++) {
                    sum += dp[i - 1][k];
                }
                dp[i][j] = sum%10007;
            }
        }

        int answer = 0;
        for (int num : dp[N - 1]) {
            answer += num;
        }
        System.out.println(answer%10007);
    }
}

// 시간초과
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class BOJ_11057 {
//    static int count = 0;
//    static int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//    static int[] answer;
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        answer = new int[N];
//        Arrays.fill(answer, -1);
//        permutation(0, 0);
//        System.out.println(count%10007);
//    }
//
//    private static void permutation(int index, int depth) {
//        if (depth == answer.length) {
//            count++;
//            return;
//        }
//        for (int i=index; i<numbers.length; i++) {
//            if (depth==0 || answer[depth-1]<=numbers[i]) {
//                answer[depth] = numbers[i];
//                permutation(i, depth+1);
//                answer[depth] = -1;
//            }
//        }
//    }
//}