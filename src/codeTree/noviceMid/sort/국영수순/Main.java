package codeTree.noviceMid.sort.국영수순;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Subject[] arr = new Subject[n];
        for (int i=0; i<n; i++) {
            String a = sc.next();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            arr[i] = new Subject(a, b, c, d);
        }

        Arrays.sort(arr);


        for (int i=0; i<n; i++) {
            arr[i].show();
        }
    }
}
class Subject implements Comparable<Subject>{
    String name;
    int kor;
    int eng;
    int math;

    public Subject(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public void show() {
        System.out.println(name + " " + kor + " " + eng + " " + math);
    }

    @Override
    public int compareTo(Subject subject) {
        if (this.kor == subject.kor) {
            if (this.eng == subject.eng) {
                return this.math-subject.math;
            }
            return this.eng-subject.eng;
        }
        return this.kor-subject.kor;
    }
}