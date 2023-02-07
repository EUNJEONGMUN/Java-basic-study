package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_20207 {
    static List<Pair> pairs = new ArrayList<>();
    static int[] arr = new int[367];

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(bf.readLine());
            int S = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            pairs.add(new Pair(S, E));
        }
        Collections.sort(pairs);

        pairs.stream().forEach(elem -> fillCalendar(elem));
        System.out.println(calculateArea());
    }


    private static void fillCalendar(Pair pair) {
        for (int i=pair.s; i<=pair.e; i++) {
            arr[i]++;
        }
    }
    private static int calculateArea() {
        int answer = 0;
        int length = 0;
        int maxDepth = 0;

        for (int i=1; i<367; i++) {
            if (arr[i]==0) {
                answer += (maxDepth*length);
                length = 0;
                maxDepth = 0;
            } else {
                length++;
                maxDepth = Math.max(maxDepth, arr[i]);
            }
        }
        return answer;

    }

    static class Pair implements Comparable<Pair> {
        int s;
        int e;

        public Pair(int s, int e) {
            this.s = s;
            this.e = e;
        }

        // 굳이 정렬 하지 않아도 됨.
        @Override
        public int compareTo(Pair o) {
            if (o.s == this.s) {
                return (o.e - o.s) - (this.e - this.s);
            }
            return this.s - o.s;
        }
    }
}