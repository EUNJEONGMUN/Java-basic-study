package codeTree.noviceMid.bruthForce1.자리수단위로완전탐색;

import java.util.Scanner;

public class 체크판위에서2 {
    public static int N;
    public static int M;
    public static char[][] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        arr = new char[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = sc.next().charAt(0);
            }
        }

        System.out.println(solution());
    }

    private static int solution() {
        char start = arr[0][0];
        char end = arr[N - 1][M - 1];
        if (start == end) {
            return 0;
        }

        int answer = 0;
        for (int i = 1; i < N-1; i++) {
            for (int j = 1; j < M-1; j++) {
                if (arr[i][j] == end) {
                    answer += calculateCount(i, j, start);
                }
            }
        }
        return answer;
    }

    private static int calculateCount(int x, int y, char color) {
        int count = 0;
        for (int i = x + 1; i < N - 1; i++) {
            for (int j = y + 1; j < M - 1; j++) {
                if (arr[i][j] == color) {
                    count++;
                }
            }
        }
        return count;
    }
}
