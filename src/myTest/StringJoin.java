package myTest;

public class StringJoin {
    public static void main(String[] args) {
        System.out.print("zz");
        System.out.println("ppp");
        System.out.println("dfd");
    }

    private static byte[] command(final String... args) {
        return String.join("\n", args).getBytes();

    }
}
