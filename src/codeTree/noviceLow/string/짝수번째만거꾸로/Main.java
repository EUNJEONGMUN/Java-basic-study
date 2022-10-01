package codeTree.noviceLow.string.짝수번째만거꾸로;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str = "";
        for (int i=1; i<s.length(); i+=2) {
            str+=String.valueOf(s.charAt(i));
        }

        for (int j=str.length()-1; j>=0; j--) {
            System.out.print(str.charAt(j));
        }
    }
}
