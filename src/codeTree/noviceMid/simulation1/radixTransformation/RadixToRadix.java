package codeTree.noviceMid.simulation1.radixTransformation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RadixToRadix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radix1 = sc.nextInt();
        int radix2 = sc.nextInt();
        String num = sc.next();
        int decimal = 0;
        for (int i=0; i<num.length(); i++) {
            decimal = decimal*radix1+(num.charAt(i)-'0');
        }

        List arr = new ArrayList();
        if (decimal==0) {
            System.out.println(decimal);
        } else {
            while (decimal>0) {
                arr.add(decimal%radix2);
                decimal /= radix2;
            }
            for (int i=arr.size()-1; i>=0; i--) {
                System.out.print(arr.get(i));
            }
        }

    }
}
