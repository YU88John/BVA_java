public class GradeTest {
    public static void main(String[] args) {
        int mark = 50; // Set the mark value you want to test

        // Create an instance of the grade class
        grade gradeInstance = new grade();

        // Call the calcGrade method on the instance and capture the result
        String grade = gradeInstance.calcGrade(mark);

        if (!grade.isEmpty()) {
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Invalid mark.");
        }
    }
}

