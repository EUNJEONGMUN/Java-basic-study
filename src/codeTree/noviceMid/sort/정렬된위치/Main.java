package codeTree.noviceMid.sort.정렬된위치;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Element[] arr = new Element[n];
        for (int i=0; i<n; i++) {
            int x = sc.nextInt();
            arr[i] = new Element(x, i);
        }
        Arrays.sort(arr, (a, b) -> a.getX()- b.getX());
        int[] res = new int[n];
        for (int i=0; i<n; i++) {
            res[arr[i].getIdx()] = i+1;
        }

        for (int i=0; i<n; i++) {
            System.out.print(res[i] + " ");
        }

    }
}

class Element {
    int x;
    int idx;

    public Element(int x, int idx) {
        this.x = x;
        this.idx = idx;
    }

    public int getX() {
        return x;
    }


    public int getIdx() {
        return idx;
    }
}
