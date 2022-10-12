package codeTree.noviceMid.simulation1.radixTransformation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Variety {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int radix = sc.nextInt();

        List arr = new ArrayList();
        if (num==0) {
            System.out.println(num);
        } else {
            while (num>0) {
                arr.add(num%radix);
                num /= radix;
            }
            for (int i=arr.size()-1; i>=0; i--) {
                System.out.print(arr.get(i));
            }
        }

    }

}
