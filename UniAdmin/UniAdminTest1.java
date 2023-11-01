// please compile both UniAdmin and UniAdminTest first. Then, enable assertions on UniAdminTest with `java -ea UniAdminTest.java`

public class UniAdminTest {
    public static void main(String[] args) {
        testCalcGradeEqa();
	testCalcGradeBva();
    }

    public static void testCalcGradeEqa() {
	
        int mark1 = 45;
        assert "F".equals(UniAdmin.calcGrade(mark1)) : "Test 1 failed";

        int mark2 = 100;
        assert "10".equals(UniAdmin.calcGrade(mark2)) : "Test 2 failed";

        
        int mark3 = 55;
        assert "6".equals(UniAdmin.calcGrade(mark3)) : "Test 3 failed";

        int mark4 = 75;
        assert "8".equals(UniAdmin.calcGrade(mark4)) : "Test 4 failed";

        
        System.out.println("All tests passed.");
    }

     public static void testCalcGradeBva() {
        	
        int mark1 = 0;
        assert "F".equals(UniAdmin.calcGrade(mark1)) : "BVA Test 1 failed";

        	
        int mark2 = 49;
        assert "F".equals(UniAdmin.calcGrade(mark2)) : "BVA Test 2 failed";

        int mark3 = 50;
        assert "5".equals(UniAdmin.calcGrade(mark3)) : "BVA Test 3 failed";

        int mark4 = 99;
        assert "9".equals(UniAdmin.calcGrade(mark4)) : "BVA Test 4 failed";

        int mark5 = 100;
        assert "10".equals(UniAdmin.calcGrade(mark5)) : "BVA Test 5 failed";
 
        System.out.println("All BVA tests passed.");
     }

}

