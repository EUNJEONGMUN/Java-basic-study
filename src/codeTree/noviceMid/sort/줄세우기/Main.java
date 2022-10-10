package codeTree.noviceMid.sort.줄세우기;

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
            arr[i].show();
        }
    }
}

class Student implements Comparable<Student>{
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
        if (this.height==s.height) {
            if (this.weight==s.weight) {
                return this.idx-s.idx;
            }
            return s.weight-this.weight;
        }
        return s.height-this.height;
    }

    public void show() {
        System.out.println(this.height + " " + this.weight + " " + this.idx);
    }
}