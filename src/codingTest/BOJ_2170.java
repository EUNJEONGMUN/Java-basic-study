package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_2170 {
    static int N;
    static List<Line> lines = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        int count = 0;
        int start = 0;
        int end = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            lines.add(new Line(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }
        Collections.sort(lines);
        for (int i = 0; i < N; i++) {
            int x = lines.get(i).start;
            int y = lines.get(i).end;

            if (start <= x && x <= end) {
                end = Math.max(end, y);
            } else {
                count += (end - start);
                start = x;
                end = y;
            }
            if (i == N - 1) {
                count += (end - start);
            }
        }

        System.out.println(count);
    }

    static class Line implements Comparable<Line> {
        static final int BASE_NUM = 1_000_000_000;
        final int start;
        final int end;

        public Line(int start, int end) {
            this.start = start + BASE_NUM;
            this.end = end + BASE_NUM;
        }

        @Override
        public int compareTo(Line o) {
            return this.start - o.start;
        }
    }
}
