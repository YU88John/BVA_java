import java.util.*;

public class UVRatingCalculator {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter the uv rating: ");
        double uvIndex = scan.nextDouble(); 

        String rating = calculateUVRating(uvIndex);
        System.out.println("UV Index: " + uvIndex);
        System.out.println("Rating: " + rating);
    }

    public static String calculateUVRating(double uvIndex) {
        if (uvIndex < 0) {
            return "Invalid Rating";
        } else if (uvIndex < 3) {
            return "low";
        } else if (uvIndex <= 6) {
            return "moderate";
        } else if (uvIndex <= 8) {
            return "high";
        } else if (uvIndex <= 11) {
            return "very high";
        } else {
            return "extreme";
        }
    }
}

