package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_1863 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        List<Integer> building = new ArrayList<>();
        int answer = 0;
        building.add(0);

        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if (building.get(building.size()-1) < y) {
                answer++;
                building.add(y);
            } else {
                while (building.get(building.size()-1) > y) {
                    building.remove(building.size()-1);
                }
                if (building.get(building.size()-1)<y) {
                    answer++;
                    building.add(y);
                }
            }
        }
        System.out.println(answer);
    }
}
