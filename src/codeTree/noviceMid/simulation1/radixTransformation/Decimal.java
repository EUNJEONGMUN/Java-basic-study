package codeTree.noviceMid.simulation1.radixTransformation;

import java.util.Scanner;

public class Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bin = sc.next();
        int res = 0;

        for (int i=0; i<bin.length(); i++) {
            res = res*2+(bin.charAt(i)-'0');
        }
        System.out.println(res);

    }
}
