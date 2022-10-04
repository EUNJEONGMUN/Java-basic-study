package codeTree.noviceMid.recursion.최댓값;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i]  = sc.nextInt();
        }

        System.out.println(solution(arr, 0, 0));
    }
    public static int solution(int[] arr, int idx, int max_val) {

        if (idx>=arr.length) {
            return max_val;
        }

        if (arr[idx]>max_val){
            return solution(arr, idx+1, arr[idx]);
        } else {
            return solution(arr, idx+1, max_val);
        }

    }
}
