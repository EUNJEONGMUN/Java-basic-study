package codeTree.noviceMid.bruthForce1.자리수단위로완전탐색;

import java.util.Scanner;

public class 이상한진수2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String number = sc.nextLine();
        int max_value = 0;

        String[] split = number.split("");
        for (int i = 0; i < split.length; i++) {
            max_value = Math.max(max_value, Integer.parseInt(makeOriginNumber(i, split), 2));
        }
        System.out.println(max_value);
    }

    public static String makeOriginNumber(int idx, String[] split) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            if (i==idx) {
                sb.append(convert(split[idx]));
                continue;
            }
            sb.append(split[i]);
        }
        return sb.toString();
    }

    public static String convert(String s) {
        if (s.equals("0")) {
            return "1";
        }
        return "0";
    }
}