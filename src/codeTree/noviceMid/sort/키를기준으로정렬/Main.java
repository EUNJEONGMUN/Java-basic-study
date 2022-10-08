package codeTree.noviceMid.sort.키를기준으로정렬;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] arr = new Student[n];
        for (int i=0; i<n; i++) {
            String a = sc.next();
            int b = sc.nextInt();
            int c = sc.nextInt();
            arr[i] = new Student(a, b, c);
        }
        Arrays.sort(arr, Comparator.comparingInt(x -> x.height));
        // Arrays.sort(arr, (x,y) -> x.height-y.height);
        for (int i=0; i<n; i++) {
            arr[i].show();
        }

    }
}

class Student {
    String name;
    int height;
    int weight;

    public Student(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public void show() {
        System.out.println(name + " " + height + " " + weight);
    }
}