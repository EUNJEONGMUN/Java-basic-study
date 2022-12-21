package java의정석.character;

public class IsAlphabetic {
    public static void main(String[] args) {
        System.out.println("==========isAlphabetic==========");
        System.out.println(Character.isAlphabetic('a'));
        System.out.println(Character.isAlphabetic('1'));
        System.out.println(Character.isAlphabetic('A'));
        System.out.println(Character.isAlphabetic('@'));
        System.out.println(Character.isAlphabetic('\u2164'));
        System.out.println("==========isDigit==========");
        System.out.println(Character.isDigit('a'));
        System.out.println(Character.isDigit('1'));
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('@'));
        System.out.println(Character.isDigit('가'));
        System.out.println("==========isLetterOrDigit==========");
        System.out.println(Character.isLetterOrDigit('a'));
        System.out.println(Character.isLetterOrDigit('1'));
        System.out.println(Character.isLetterOrDigit('A'));
        System.out.println(Character.isLetterOrDigit('@'));
        System.out.println(Character.isLetterOrDigit('가'));
        System.out.println(Character.isLetterOrDigit('\n'));
        System.out.println("==========isLetter==========");
        System.out.println(Character.isLetter('a'));
        System.out.println(Character.isLetter('1'));
        System.out.println(Character.isLetter('A'));
        System.out.println(Character.isLetter('@'));
        System.out.println(Character.isLetter('가'));
        System.out.println(Character.isLetter('\u2164'));
        System.out.println("==========isLowerCase==========");
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.isLowerCase('1'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.isLowerCase('@'));
        System.out.println(Character.isLowerCase(' '));
        System.out.println("==========isUpperCase==========");
        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isUpperCase('1'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isUpperCase('@'));
        System.out.println(Character.isUpperCase(' '));
        System.out.println("==========toLowerCase==========");
        System.out.println(Character.toLowerCase('a'));
        System.out.println(Character.toLowerCase('1'));
        System.out.println(Character.toLowerCase('A'));
        System.out.println(Character.toLowerCase('@'));
        System.out.println(Character.toLowerCase(' '));
        System.out.println(Character.toLowerCase('가'));
        System.out.println(Character.toLowerCase('\n'));
        System.out.println("==========toUpperCase==========");
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toUpperCase('1'));
        System.out.println(Character.toUpperCase('A'));
        System.out.println(Character.toUpperCase('@'));
        System.out.println(Character.toUpperCase(' '));
        System.out.println(Character.toUpperCase('가'));
        System.out.println(Character.toUpperCase('\n'));


    }
}
