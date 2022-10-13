package codeTree.noviceMid.simulation1.section;

import java.util.Scanner;

public class Move {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[2001];
        int now = 1000;
        for (int i=0; i<n; i++) {
            int x = sc.nextInt();
            char direction = sc.next().charAt(0);

            if (direction=='R'){
                for (int k=now; k<now+x; k++) {
                    arr[k]+=1;
                }
                now+=x;
            } else {
                for (int k=now-1; k>=now-x; k--){
                    arr[k]+=1;
                }
                now -= x;
            }
        }
        int res = 0;
        for (int i=0; i<2001; i++) {
            if (arr[i]>1){
                res += 1;
            }
        }
        System.out.println(res);
    }
}
