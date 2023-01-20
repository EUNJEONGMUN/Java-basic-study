package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4811 {
    static long[][] dp = new long[31][31];

    public static void main(String[] args) throws IOException {
        initDpTable();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int n = Integer.parseInt(bf.readLine());
            if (n == 0) {
                break;
            }
            System.out.println(dp[n - 1][1]);
        }

    }

    private static void initDpTable() {
        for (int h = 0; h < 31; h++) {
            dp[0][h] = 1;
        }

        for (int w = 1; w < 31; w++) {
            for (int h = 0; h < 30; h++) {
                if (h == 0) {
                    dp[w][h] = dp[w - 1][h + 1];
                } else {
                    dp[w][h] = dp[w][h - 1] + dp[w - 1][h + 1];
                }

            }
        }
    }
}
