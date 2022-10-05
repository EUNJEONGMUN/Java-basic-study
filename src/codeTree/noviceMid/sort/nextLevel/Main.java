package codeTree.noviceMid.sort.nextLevel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("codetree", 10);
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int n = sc.nextInt();
        User user2 = new User(id, n);

        System.out.println("user "+user1.id+" lv "+user1.level);
        System.out.println("user "+user2.id+" lv "+user2.level);

    }
}
class User {
    String id;
    int level;

    public User(String id, int level) {
        this.id = id;
        this.level = level;
    }
}