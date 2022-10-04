package codeTree.noviceMid.function.짝수만2로나누기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i]  = sc.nextInt();
        }

        div2(arr);

        for (int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void div2(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            if (arr[i]%2==0){
                arr[i]/=2;
            }
        }
    }
}
