import java.util.Scanner;

public class roomVolume {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input width, length, and height
        System.out.print("Enter the width (in meters): ");
        double width = scan.nextDouble();
        System.out.print("Enter the length (in meters): ");
        double length = scan.nextDouble();
        System.out.print("Enter the height (in meters): ");
        double height = scan.nextDouble();

        // Calculate the room volume if the inputs are valid
        double volume = calculateRoomVolume(width, length, height);

        if (volume > 0) {
            System.out.println("The volume of the room is: " + volume + " cubic meters");
        } else {
            System.out.println("Invalid inputs. The volume cannot be calculated.");
        }

        scan.close();
    }

    public static double calculateRoomVolume(double width, double length, double height) {
        // Check if the inputs are valid
        if (width >= 2.0 && length >= 2.5 && height >= 3.0) {
            // Calculate and return the volume
            return width * length * height;
        } else {
            // Invalid inputs, return 0
            return 0.0;
        }
    }
}

