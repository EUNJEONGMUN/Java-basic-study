package 이코테.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q15_boj18352_특정거리의도시찾기 {
    static int N, M, K, X; // 도시의 개수 N, 도로의 개수 M, 거리 정보 K, 출발 도시의 번호 X
    static List[] graph;
    static int[] distance;
    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());

        graph = new List[N + 1];
        distance = new int[N + 1];
        for (int i = 1; i < N + 1; i++) {
            graph[i] = new ArrayList();
            distance[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(bf.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            graph[A].add(B);
        }

        queue.offer(X);
        distance[X] = 0;

        while (!queue.isEmpty()) {
            int now = queue.poll();
            for (int i = 0; i < graph[now].size(); i++) {
                int nextCost = distance[now] + 1;
                int nextNode = (int) graph[now].get(i);
                if (nextCost < distance[nextNode]) {
                    distance[nextNode] = nextCost;
                    queue.offer(nextNode);
                }
            }
        }

        boolean flag = true;
        for (int i = 1; i < distance.length; i++) {
            if (distance[i] == K) {
                flag = false;
                System.out.println(i);
            }
        }
        if (flag) {
            System.out.println(-1);
        }
    }
}
