package codingTest;

import java.util.Scanner;

public class BOJ_4659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String s = sc.next();
            if (s.equals("end")){
                break;
            }
            if (solution(s)) {
                System.out.println("<"+s+"> is acceptable.");
            } else {
                System.out.println("<"+s+"> is not acceptable.");
            }

        }
    }

    public static boolean solution(String s) {
        boolean isVowels = false;
        int cnt = 0; // 연속된 자음 모음 확인

        if (check(s.charAt(0))) {
            isVowels = true;
            cnt++;
        } else {
            cnt++;
        }
        for (int i=1; i<s.length(); i++) {
            if (check(s.charAt(i))) { // 모음일 때
                if (!isVowels) {
                    isVowels = true;
                }

                if (check(s.charAt(i-1))) { // 앞이 모음이었다면
                    cnt++; // cnt증가
                    if (s.charAt(i)==s.charAt(i-1)) {
                        if (!(s.charAt(i)=='o' || s.charAt(i)=='e')) {
                            return false;
                        }
                    }
                } else {
                    cnt = 1;
                }
            } else {
                if (!check(s.charAt(i-1))) {
                    cnt++;
                    if (s.charAt(i)==s.charAt(i-1)) {
                        return false;
                    }
                } else {
                    cnt = 1;
                }
            }

            if (cnt==3) {
                return false;
            }

        }

        if (isVowels) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean check(char c) {
        if (c=='a'|| c=='i'|| c=='o'|| c=='u'||c=='e'){
            return true;
        }
        return false;
    }
}
