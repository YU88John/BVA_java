public class HouseCalcTest {
    public static void main(String[] args) {
        testRoomVolumeValidInputs();
        testRoomVolumeInvalidInputs();
    }

    public static void testRoomVolumeValidInputs() {
        // Valid inputs

        double width1 = 2.5;
        double length1 = 3.0;
        double height1 = 3.5;
        assert HouseCalc.roomVolume(width1, length1, height1) == width1 * length1 * height1 : "Valid input test 1 failed";

        double width2 = 2.0;
        double length2 = 2.5;
        double height2 = 3.0;
        assert HouseCalc.roomVolume(width2, length2, height2) == width2 * length2 * height2 : "Valid input test 2 failed";

        System.out.println("All valid input tests passed.");
    }

    public static void testRoomVolumeInvalidInputs() {
       
        double width1 = 1.5; 
        double length1 = 3.0;
        double height1 = 3.5;
        assert HouseCalc.roomVolume(width1, length1, height1) == 0.0 : "Invalid input test 1 failed";

        double width2 = 2.5;
        double length2 = 1.0;
        double height2 = 3.0;
        assert HouseCalc.roomVolume(width2, length2, height2) == 0.0 : "Invalid input test 2 failed";

        double width3 = 2.5;
        double length3 = 2.5;
        double height3 = 2.0; 
        assert HouseCalc.roomVolume(width3, length3, height3) == 0.0 : "Invalid input test 3 failed";


        System.out.println("All invalid input tests passed.");
    }
}

