package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_20055 {
    static int N, K;
    static int[] belt;
    static boolean[] robot;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(bf.readLine());
        belt = new int[N * 2];
        robot = new boolean[N * 2];

        for (int i = 0; i < N * 2; i++) {
            belt[i] = Integer.valueOf(st.nextToken());
            robot[i] = false;
        }

        int step = 1;

        while (true) {
            // 벨트 옮기기
            moveBelt();
            // 로봇 옮기기
            moveRobot();
            // 로봇 올리기
            loadRobot();

            long count = Arrays.stream(belt).filter(x -> x == 0).count();
            if (count >= K) {
                System.out.println(step);
                break;
            }
            step += 1;
        }
    }


    private static void moveBelt() {
        int last = belt[N * 2 - 1];
        boolean lastRobot = robot[N * 2 - 1];
        for (int i = 2 * N - 1; i > 0; i--) {
            belt[i] = belt[i - 1];
            robot[i] = robot[i - 1];
        }
        belt[0] = last;
        robot[0] = lastRobot;

        robot[N - 1] = false;
    }

    private static void moveRobot() {
        for (int i = N - 2; i > 0; i--) {
            if (robot[i] && belt[i + 1] > 0 && !robot[i + 1]) {
                belt[i + 1] -= 1;
                robot[i] = false;
                robot[i + 1] = true;
            }
        }
        robot[N - 1] = false;
    }

    private static void loadRobot() {
        if (!robot[0] && belt[0] > 0) {
            robot[0] = true;
            belt[0] -= 1;
        }
    }
}