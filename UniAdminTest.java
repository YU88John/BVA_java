// please compile both UniAdmin and UniAdminTest first. Then, enable assertions on UniAdminTest with `java -ea UniAdminTest.java`

public class UniAdminTest {
    public static void main(String[] args) {
        testCalcGradeEqa();
    }

    public static void testCalcGradeEqa() {
        // Test for mark < 50
        int mark1 = 45;
        assert "F".equals(UniAdmin.calcGrade(mark1)) : "Test 1 failed";

        // Test for mark == 100
        int mark2 = 100;
        assert "10".equals(UniAdmin.calcGrade(mark2)) : "Test 2 failed";

        // Test for other valid marks
        int mark3 = 55;
        assert "6".equals(UniAdmin.calcGrade(mark3)) : "Test 3 failed";

        int mark4 = 75;
        assert "8".equals(UniAdmin.calcGrade(mark4)) : "Test 4 failed";

        // Add more test cases as needed

        // If no assertion errors occur, all tests pass
        System.out.println("All tests passed.");
    }

     public static void testCalcGradeBva() {
        // Boundary for less than 50
	
        int mark1 = 0;
        assert "F".equals(UniAdmin.calcGrade(mark1)) : "BVA Test 1 failed";

        // Second boundary for less than 50
	
        int mark2 = 49;
        assert "F".equals(UniAdmin.calcGrade(mark2)) : "BVA Test 2 failed";

        // Boundary for 50

        int mark3 = 50;
        assert "5".equals(UniAdmin.calcGrade(mark3)) : "BVA Test 3 failed";

        // Boundary for 99
	
        int mark4 = 99;
        assert "9".equals(UniAdmin.calcGrade(mark4)) : "BVA Test 4 failed";

        // Boundary for 100

        int mark5 = 100;
        assert "10".equals(UniAdmin.calcGrade(mark5)) : "BVA Test 5 failed";

        // No assertion 
        System.out.println("All BVA tests passed.");
     }

}

