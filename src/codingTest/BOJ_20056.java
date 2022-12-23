package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_20056 {
    static int N, M, K;
    static List<Ball> balls;
    static ArrayList<Ball>[][] grid;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        balls = new ArrayList<>();
        grid = new ArrayList[N][N];
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                grid[r][c] = new ArrayList<>();
            }
        }

        // 질량m 속력s 방향d 방향으로 속력만큼이동
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken()) - 1;
            int c = Integer.parseInt(st.nextToken()) - 1;
            int m = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            balls.add(new Ball(r, c, m, s, d));
        }

        for (int loop = 0; loop < K; loop++) {
            moveEachBall();
            balls.clear();
            mergeAndDivide();
        }
        System.out.println(balls.stream().mapToInt(ball -> ball.m).sum());
    }

    private static void moveEachBall() {
        balls.stream().filter(ball -> ball.m > 0).forEach(ball -> {
            ball.move();
            grid[ball.r][ball.c].add(ball);
        });
    }

    private static void mergeAndDivide() {
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                if (grid[r][c].size() == 1) {
                    balls.add(grid[r][c].get(0));
                }

                if (grid[r][c].size() >= 2) {
                    List<Ball> merge = mergeAndDivideEachCell(r, c);
                    balls.addAll(merge);
                }
                grid[r][c].clear();
            }
        }
    }

    private static List<Ball> mergeAndDivideEachCell(int r, int c) {
        ArrayList<Ball> res = new ArrayList<>();
        List<Ball> gridBalls = grid[r][c];
        int totalM = gridBalls.stream().mapToInt(ball -> ball.m).sum() / 5;
        int totalS = gridBalls.stream().mapToInt(ball -> ball.s).sum() / gridBalls.size();
        int initDirection = getInitNumber(gridBalls);

        for (int i = 0; i < 4; i++) {
            res.add(new Ball(r, c, totalM, totalS, initDirection));
            initDirection += 2;
        }
        return res;
    }

    private static int getInitNumber(List<Ball> balls) {
        long count = balls.stream().map(ball -> ball.d % 2 == 0).distinct().count();
        return count == 1 ? 0 : 1;
    }

    static class Ball {
        int r;
        int c;
        final int m;
        final int s;
        final int d;

        public Ball(int r, int c, int m, int s, int d) {
            this.r = r;
            this.c = c;
            this.m = m;
            this.s = s;
            this.d = d;
        }

        public void move() {
            this.r = convertPosition(r + dx[d] * s);
            this.c = convertPosition(c + dy[d] * s);
        }

        private int convertPosition(int point) {
            if (point >= 0) {
                return point % N;
            }
            if (point % N == 0) {
                return 0;
            }
            return N + (point % N);
        }
    }
}