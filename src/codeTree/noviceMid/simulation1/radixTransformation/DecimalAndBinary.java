package codeTree.noviceMid.simulation1.radixTransformation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DecimalAndBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bin = sc.next();
        int res = 0;

        for (int i=0; i<bin.length(); i++) {
            res = res*2+(bin.charAt(i)-'0');
        }
        res *= 17;

        List arr = new ArrayList();
        if (res==0) {
            System.out.println(res);
        } else {
            while (res>0) {
                arr.add(res%2);
                res /= 2;
            }
            for (int i=arr.size()-1; i>=0; i--) {
                System.out.print(arr.get(i));
            }
        }
    }
}
