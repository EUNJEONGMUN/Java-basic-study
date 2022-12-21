package java의정석.ch9;

public class StringEx1 {
    public static void main(String[] args) {

        String s1 = "가나다";
        String s2 = "가나다";
        String s3 = new String("가나다");
        String s4 = new String("가나다");

        System.out.println("==hashCode==");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        System.out.println("\n==identityHashCode==");
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));
        System.out.println(System.identityHashCode(s4));
        System.out.println("\n====");
        System.out.println(s1==s2);
        System.out.println(s3==s4);
        System.out.println(s2==s3);
        System.out.println("\n==equals==");
        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s4));
        System.out.println(s1.equals(s3));

//


//        String a = "a";
//        System.out.println(System.identityHashCode(a));
//        String b = "b";
//        System.out.println(System.identityHashCode(b));
//        a+=b;
//        System.out.println(a);
//        System.out.println(System.identityHashCode(a));
    }
}
