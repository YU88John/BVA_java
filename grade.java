import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the mark: ");
        int mark = scan.nextInt();
        scan.close();

        String grade = calcGrade(mark);
        if (!grade.isEmpty()) {
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Invalid mark.");
        }
    }

    public static String calcGrade(int mark) {
        if (mark < 0 || mark > 100) {
            return ""; // Invalid mark
        } else if (mark < 50) {
            return "F";
        } else if (mark >= 50 && mark <= 59) {
            return "5";
        } else if (mark >= 60 && mark <= 69) {
            return "6";
        } else if (mark >= 70 && mark <= 79) {
            return "7";
        } else if (mark >= 80 && mark <= 89) {
            return "8";
        } else if (mark >= 90 && mark <= 99) {
            return "9";
        } else {
            return "10";
        }
    }
}

