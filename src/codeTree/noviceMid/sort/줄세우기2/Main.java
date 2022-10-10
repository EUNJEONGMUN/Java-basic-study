package codeTree.noviceMid.sort.줄세우기2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] arr = new Student[n];
        for (int i=0; i<n; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            arr[i] = new Student(h,w,i+1);
        }

        Arrays.sort(arr);

        for (int i=0; i<n; i++) {
            System.out.println(arr[i]);
        }
    }
}

class Student implements Comparable<Student> {
    int height;
    int weight;
    int idx;

    public Student(int h, int w, int idx) {
        this.height = h;
        this.weight = w;
        this.idx = idx;
    }

    @Override
    public int compareTo(Student s) {
        if (this.height == s.height) {
            return s.weight - this.weight;
        }
        return this.height-s.height;
    }

    @Override
    public String toString() {
        return height + " " + weight + " " + idx;
    }
}
