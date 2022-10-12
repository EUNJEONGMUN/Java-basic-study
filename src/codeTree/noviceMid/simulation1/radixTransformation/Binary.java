package codeTree.noviceMid.simulation1.radixTransformation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List arr = new ArrayList();
        if (n==0) {
            System.out.println(n);
        } else {
            while (n>0) {
                arr.add(n%2);
                n /= 2;
            }
            for (int i=arr.size()-1; i>=0; i--) {
                System.out.print(arr.get(i));
            }
        }

    }
}
