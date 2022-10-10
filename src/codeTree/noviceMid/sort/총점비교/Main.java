package codeTree.noviceMid.sort.총점비교;

import java.util.Arrays;
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
            int d = sc.nextInt();
            arr[i] = new Student(a, b, c, d);
        }

        Arrays.sort(arr);

        for (int i=0; i<n; i++) {
            arr[i].show();
        }
    }
}

class Student implements Comparable<Student>{
    String name;
    int one;
    int two;
    int three;

    public Student() {

    }

    public Student(String name, int one, int two, int three) {
        this.name = name;
        this.one = one;
        this.two = two;
        this.three = three;
    }

    @Override
    public int compareTo(Student student) {
        return (this.one+this.two+this.three)-(student.one+student.two+student.three);
    }

    public void show() {
        System.out.println(this.name + " " + this.one + " " + this.two + " " + this.three);
    }
}