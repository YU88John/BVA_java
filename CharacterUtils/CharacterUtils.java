public class CharacterUtils
{
 
    public static boolean charCase(boolean checkUpper, char ch)
    {
        boolean upperCase = 'A' <= ch && ch <= 'z';
        boolean lowerCase = 'a' <= ch && ch <= 'z';
        return (checkUpper && upperCase) || (!checkUpper && lowerCase);
    }
   

    public static String substr(String str1, String str2)
    {
        String result = str1;
        if(str1.contains(str2))
        {
            result = str2;
        }
        else if(str2.contains(str1))
        {
            result = str1;
        }
        return result;
    }
}
