package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1753 {
    static ArrayList<Tuple>[] graph;
    static int[] distance;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(bf.readLine());
        graph = new ArrayList[V+1];
        distance = new int[V+1];
        for (int i=1; i<V+1; i++) {
            graph[i] = new ArrayList<>();
        }
        Arrays.fill(distance, Integer.MAX_VALUE);

        for (int i=0; i<E; i++) {
            st = new StringTokenizer(bf.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            graph[u].add(new Tuple(v, w));
        }
        dijkstra(K);
        for (int i=1; i<V+1; i++) {
            if (distance[i]==Integer.MAX_VALUE) {
                System.out.println("INF");
            } else {
                System.out.println(distance[i]);
            }

        }

    }

    private static void dijkstra(int K) {
        PriorityQueue<Tuple> queue = new PriorityQueue<>();
        queue.add(new Tuple(K, 0));
        distance[K] = 0;
        while (!queue.isEmpty()) {
            Tuple now = queue.poll();
            if (distance[now.node]< now.weight) {
                continue;
            }

            for (Tuple tuple : graph[now.node]) {
                int nextNode = tuple.node;
                int nextWeight = distance[now.node]+tuple.weight;

                if (nextWeight<distance[nextNode]) {
                    queue.add(new Tuple(nextNode, nextWeight));
                    distance[nextNode] = nextWeight;
                }
            }
        }
    }

    static class Tuple implements Comparable<Tuple> {
        int node;
        int weight;

        public Tuple(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }

        @Override
        public int compareTo(Tuple o) {
            return this.weight - o.weight;
        }
    }
}