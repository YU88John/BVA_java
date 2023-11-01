import java.util.Scanner;

public class occur {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scan.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scan.nextLine();

        String result = findOverlap(str1, str2);

        if (!result.isEmpty()) {
            System.out.println("The overlap occurence between the strings is: " + result);
        } else {
            System.out.println("No overlap found.");
        }

        scan.close();
    }

    public static String findOverlap(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        String shorter = "";

        // Check if one string occurs inside the other
        if (len1 <= len2 && str2.contains(str1)) {
            shorter = str1;
        } else if (len2 <= len1 && str1.contains(str2)) {
            shorter = str2;
        }

        return shorter;
    }
}

