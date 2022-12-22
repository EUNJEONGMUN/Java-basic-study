package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_3078 {
    static final int NAME_LENGTH_MAX = 20;
    static int N, K;
    static int[] students;
    static int[] nameLength = new int[NAME_LENGTH_MAX + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        students = new int[N];

        long answer = 0; // 쌍의 개수가 int 범위를 벗어날 수 있으므로 long으로 설정해야 함.
        for (int i = 0; i < N; i++) {
            students[i] = br.readLine().length();
            if (i > K) {
                nameLength[students[i - K - 1]] -= 1;
            }
            answer += nameLength[students[i]];
            nameLength[students[i]] += 1;
        }
        System.out.println(answer);
    }
}