public class CharacterUtilsTest {
    public static void main(String[] args) {
        testCharCase();
        testSubstr();
    }

    public static void testCharCase() {
        
        char upperChar = 'A';
        assert CharacterUtils.charCase(true, upperChar) : "Test 1 failed";

        
        char lowerChar = 'a';
        assert CharacterUtils.charCase(false, lowerChar) : "Test 2 failed";

        
        char nonAlphabetChar = '5';
        assert !CharacterUtils.charCase(true, nonAlphabetChar) : "Test 3 failed";

        System.out.println("All charCase tests passed.");
    }

    public static void testSubstr() {
        
        String str1 = "Hello, World";
        String str2 = "World";
        assert CharacterUtils.substr(str1, str2).equals(str2) : "Test 1 failed";

        
        String str3 = "Apple";
        String str4 = "Apples";
        assert CharacterUtils.substr(str3, str4).equals(str3) : "Test 2 failed";


	String str5 = "Equal";
        assert CharacterUtils.substr(str5, str5).equals(str5) : "Test 3 failed";

        String str6 = "ABC";
        String str7 = "XYZ";
        assert CharacterUtils.substr(str6, str7).equals(str6) : "Test 4 failed";


        System.out.println("All substr tests passed.");
    }
}

