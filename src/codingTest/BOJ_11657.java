package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_11657 {
    static int N, M;
    static ArrayList<Node> graph;
    static long[] distance;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new ArrayList<>();
        distance = new long[N + 1];
        Arrays.fill(distance, Integer.MAX_VALUE);

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            graph.add(new Node(A, B, C));
        }

        boolean isINF = bellmanFord(1);
        if (!isINF) {
            for (int i = 2; i < distance.length; i++) {
                if (distance[i] == Integer.MAX_VALUE) {
                    System.out.println(-1);
                } else {
                    System.out.println(distance[i]);
                }
            }
        } else {
            System.out.println(-1);
        }


    }

    private static boolean bellmanFord(int start) {
        distance[start] = 0;

        for (int loop = 0; loop < N; loop++) {
            for (int j = 0; j < M; j++) {
                Node node = graph.get(j);

                if (distance[node.now] != Integer.MAX_VALUE && distance[node.now] + node.cost < distance[node.next]) {
                    distance[node.next] = distance[node.now] + node.cost;
                    if (loop == N - 1) {
                        return true;
                    }
                }

            }
        }
        return false;
    }

    static class Node {
        int now;
        int next;
        int cost;

        public Node(int now, int next, int cost) {
            this.now = now;
            this.next = next;
            this.cost = cost;
        }
    }
}
