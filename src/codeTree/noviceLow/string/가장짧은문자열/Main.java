package codeTree.noviceLow.string.가장짧은문자열;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strArr = new String[3];
        for (int i=0; i<3; i++) {
            strArr[i] = sc.next();
        }
        int[] lenArr = new int[3];
        for (int i=0; i<3; i++) {
            lenArr[i] = strArr[i].length();
        }
        Arrays.sort(lenArr);


        System.out.println(lenArr[2]-lenArr[0]);
    }
}
