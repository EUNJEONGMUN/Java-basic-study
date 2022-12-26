package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class BOJ_1446 {
    static int N, D;
    static int[] distance;
    static Path[] shortPath;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        N = Integer.parseInt(st.nextToken());
        D = Integer.parseInt(st.nextToken());

        distance = new int[D+1];
        for (int i=0; i<D+1; i++) {
            distance[i] = i;
        }
        shortPath = new Path[N];

        for (int i=0; i<N; i++) {
            st = new StringTokenizer(bf.readLine());
            shortPath[i] = new Path(
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken())
            );
        }
        for (int i=0; i<D+1; i++) {
            distance[i] = Math.min(distance[i], distance[i-1]+1);

            for (int j=0; j<shortPath.length; j++) {
                int s = shortPath[j].start;
                int e = shortPath[j].end;
                int d = shortPath[j].distance;
                if ((i == s) && (e<=D) && (distance[s]+d < distance[e])) {
                    distance[e] = distance[s]+d;
                }
            }
            Arrays.stream(distance).forEach(System.out::print);
            System.out.println();
        }
        System.out.println(distance[D]);
    }

    static class Path {
        int start;
        int end;
        int distance;

        public Path(int start, int end, int distance) {
            this.start = start;
            this.end = end;
            this.distance = distance;
        }
    }
}
