package baekjoonBasic.array.boj_3052;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 방법1 : 배열 이용하기
        Scanner sc  = new Scanner(System.in);
        boolean[] arr = new boolean[42];
        final int FIX_NUM = 42;
        int num;
        int cnt = 0;
        for (int i=0; i<10; i++) {
            num = sc.nextInt();
            if (!arr[num%FIX_NUM]) {
                arr[num % FIX_NUM] = true;
                cnt++;
            }
        }

        System.out.println(cnt);

        // 방법2 : hashmap 이용하기
        HashSet<Integer> h = new HashSet<Integer>();
        for (int i = 0; i < 10; i++) {
            h.add(sc.nextInt()%42);
        }
        System.out.print(h.size());
    }
}
