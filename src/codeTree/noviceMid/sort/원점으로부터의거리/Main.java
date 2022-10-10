package codeTree.noviceMid.sort.원점으로부터의거리;

import java.util.Arrays;
        import java.util.Comparator;
        import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Circle[] arr = new Circle[n];
        for (int i=0; i<n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[i] = new Circle(x, y, i+1);
        }
//        Arrays.sort(arr, new Comparator<Circle>() {
//            @Override
//            public int compare(Circle o1, Circle o2) {
//                int o1_dist = Math.abs(o1.getX()-0)+Math.abs(o1.getY()-0);
//                int o2_dist = Math.abs(o2.getX()-0)+Math.abs(o2.getY()-0);
//                if (o1_dist>o2_dist){
//                    return 1;
//                } else if (o1_dist==o2_dist) {
//                    return 0;
//                } else {
//                    return -1;
//                }
//
//            }
//        });
        Arrays.sort(arr, new Comparator<Circle>() {
            @Override
            public int compare(Circle o1, Circle o2) {
                int o1_dist = Math.abs(o1.getX()-0)+Math.abs(o1.getY()-0);
                int o2_dist = Math.abs(o2.getX()-0)+Math.abs(o2.getY()-0);
                return o1_dist-o2_dist;
            }
        });
        for (int i=0; i<n; i++) {
            System.out.println(arr[i].getIdx());
        }

    }
}

class Circle {
    int x;
    int y;
    int idx;

    public Circle(int x, int y, int idx) {
        this.x = x;
        this.y = y;
        this.idx = idx;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getIdx() {
        return idx;
    }
}