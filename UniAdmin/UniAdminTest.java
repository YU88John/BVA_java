// please compile both UniAdmin and UniAdminTest first. Then, enable assertions on UniAdminTest with `java -ea UniAdminTest.java`

import static org.junit.Assert.*;
import org.junit.Test;

public class UniAdminTest {

    @Test
    public void testCalcGradeEqa() {
        int mark1 = 45;
        assertEquals("F", UniAdmin.calcGrade(mark1));

        int mark2 = 100;
        assertEquals("10", UniAdmin.calcGrade(mark2));

        int mark3 = 55;
        assertEquals("6", UniAdmin.calcGrade(mark3));

        int mark4 = 75;
        assertEquals("8", UniAdmin.calcGrade(mark4));
    }

    @Test
    public void testCalcGradeBva() {
        int mark1 = 0;
        assertEquals("F", UniAdmin.calcGrade(mark1));

        int mark2 = 49;
        assertEquals("F", UniAdmin.calcGrade(mark2));

        int mark3 = 50;
        assertEquals("5", UniAdmin.calcGrade(mark3));

        int mark4 = 99;
        assertEquals("9", UniAdmin.calcGrade(mark4));

        int mark5 = 100;
        assertEquals("10", UniAdmin.calcGrade(mark5));
    }
}

