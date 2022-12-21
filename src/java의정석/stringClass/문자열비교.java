package java의정석.stringClass;

public class 문자열비교 {
    public static void main(String[] args) {
        String str = "0123456789";
        System.out.println(str.substring(1, 4));
        String str1 = "가나다";
        String str2 = "가나다";
        String str3 = new String("가나다");
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str2==str3);
        /**
         *
         */
    }
}
