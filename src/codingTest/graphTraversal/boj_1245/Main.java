package codingTest.graphTraversal.boj_1245;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[][] area;
    static boolean[][] visited;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static boolean flag;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        area = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                area[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (area[i][j] > 0 && visited[i][j] == false) {
                    flag = true;
                    dfs(i, j);
                    if (flag) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
        br.close();
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;
        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (checkRange(nx, ny)) {
                if (area[x][y] < area[nx][ny]) {
                    flag = false;
                }
                if (area[x][y] == area[nx][ny] && visited[nx][ny] == false) {
                    dfs(nx, ny);
                }
            }
        }
    }

    private static boolean checkRange(int x, int y) {
        return x >= 0 && y >= 0 && x < N && y < M;
    }
}
