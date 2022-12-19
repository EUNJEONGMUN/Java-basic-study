package codeTree.noviceHigh.dynamicArray;

import java.util.ArrayList;
import java.util.Scanner;

public class 정수명령어처리 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> array = new ArrayList<>();

        for (int i=0; i<n; i++) {
            String command = sc.next();

            if (command.equals("push_back")) {
                int num = sc.nextInt();
                array.add(num);
            } else if (command.equals("get")) {
                int num = sc.nextInt();
                System.out.println(array.get(num-1));
            } else if (command.equals("size")) {
                System.out.println(array.size());
            } else if (command.equals("pop_back")) {
                array.remove(array.size()-1);
            }

        }
    }
}
