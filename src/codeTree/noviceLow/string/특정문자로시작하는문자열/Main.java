package codeTree.noviceLow.string.특정문자로시작하는문자열;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.next();
        }

        char alpha = sc.next().charAt(0);
        int cnt = 0;
        double total = 0;
        for (int i=0; i<n; i++) {

            // alpha로 시작하는 문자열 찾기
            if (arr[i].charAt(0) == alpha) {
                cnt++;
                total+=arr[i].length(); // 문자열 길이 더하기
            }
        }

        System.out.println(cnt +" " + String.format("%.2f", total/cnt));
    }
}
