public class UniAdmin {
    public static String calcGrade(int mark) {
        String grade = "";
        if (mark < 50) {
            grade = "F";
        } else if (mark == 100) {
            grade = "10";
        } else {
            grade = "" + ((mark + 1) / 10);
        }
        return grade;
    }
}

