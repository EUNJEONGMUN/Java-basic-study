package codeTree.noviceMid.sort.개인정보;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] arr = new Student[5];
        for (int i=0; i<5; i++) {
            String n = sc.next();
            int h = sc.nextInt();
            double w = sc.nextDouble();
            arr[i] = new Student(n, h, w);
        }

        Arrays.sort(arr, (a, b) -> a.getName().compareTo(b.getName()));
        System.out.println("name");
        for (int i=0; i<5; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("\nheight");

        Arrays.sort(arr);
        for (int i=0; i<5; i++) {
            System.out.println(arr[i]);
        }
    }
}

class Student implements Comparable<Student>{
    String name;
    int height;
    double weight;

    public Student(String n, int h, double w) {
        this.name = n;
        this.height = h;
        this.weight = w;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return name +" "+ height + " " + weight;
    }

    @Override
    public int compareTo(Student o) {
        return o.getHeight()-this.getHeight();
    }
}