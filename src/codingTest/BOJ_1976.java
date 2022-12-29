package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1976 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, M;
    static int[][] grid;
    static int[] parent;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        initParent();
        initGrid();

        unionAndFind();

        st = new StringTokenizer(br.readLine());
        int startParent = parent[Integer.parseInt(st.nextToken()) - 1];
        boolean canTrip = true;
        for (int loop = 1; loop < M; loop++) {
            if (parent[Integer.parseInt(st.nextToken()) - 1] != startParent) {
                canTrip = false;
                break;
            }
        }

        if (canTrip) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static void initGrid() throws IOException {
        grid = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    private static void initParent() {
        parent = new int[N];
        for (int i = 0; i < N; i++) {
            parent[i] = i;
        }
    }

    private static void unionAndFind() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (grid[i][j] != 0) {
                    int a = find(i);
                    int b = find(j);
                    union(a, b);
                }
            }
        }
    }

    private static int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    private static void union(int x, int y) {
        if (x < y) {
            parent[y] = x;
        } else {
            parent[x] = y;
        }
    }
}