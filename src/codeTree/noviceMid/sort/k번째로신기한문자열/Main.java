package codeTree.noviceMid.sort.k번째로신기한문자열;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();

        String[] arr = new String[n];


        for (int i=0; i<n; i++){
            arr[i]  = sc.next();
        }
        Arrays.sort(arr);

        int cnt = 0;
        for (int i=0; i<n; i++){
            if (arr[i].length()>=t.length() && arr[i].substring(0, t.length()).equals(t)) {
                cnt++;
            }
            if (cnt==k) {
                System.out.println(arr[i]);
                break;
            }
        }


    }
}
