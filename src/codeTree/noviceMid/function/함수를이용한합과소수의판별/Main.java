package codeTree.noviceMid.function.함수를이용한합과소수의판별;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        for (int i=a; i<b+1; i++){
            if (isPrime(i) && isEven(i)) {
                cnt++;
            }
        }
        System.out.println(cnt);

    }

    private static boolean isPrime(int num) {
        if (num<2) {
            return false;
        }
        for (int i=2; i<num; i++){
            if (num%i==0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isEven(int num) {
        String num_str = String.valueOf(num);

        int temp = 0;

        for (int i=0; i<num_str.length(); i++) {
            temp+=num_str.charAt(i)-'0';
        }

        if (temp%2 == 0){
            return true;
        } else{
            return false;
        }

    }
}
