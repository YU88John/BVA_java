import java.util.*;

public class LetterCaseChecker {
    public static void main(String[] args) {

	Scanner scan = Scanner(System.in);
	System.out.print("Enter a character");
        char ch = scan.next().charAt(0);
        boolean checkUpper;

        boolean isUppercase = isUppercaseLetter(ch, checkUpper);
        boolean isLowercase = !checkUpper && isLowercaseLetter(ch);

        if (checkUpper) {
            System.out.println(ch + " is an uppercase letter: " + isUppercase);
        } else {
            System.out.println(ch + " is a lowercase letter: " + isLowercase);
        }
    }


    public static boolean isUppercaseLetter(char ch, boolean checkUpper) {
        if (checkUpper) {
            return Character.isUpperCase(ch);
        } else {
            return false;
        }
    }

    public static boolean isLowercaseLetter(char ch) {
        return Character.isLowerCase(ch);
    }
}

