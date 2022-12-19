package myTest;

import java.io.ByteArrayOutputStream;

public class Stream {
    public static void main(String[] args) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write('1');
        out.write('1');
        out.write('1');
        System.out.println(out.toString().trim());
    }
}
