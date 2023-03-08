package Recursion.Strings;

public class ReverseString {

    public static String reverseString(String s,int idx)
    {
        if(idx <0)
        {
            return "";
        }
        String str = "";

        String sml =  reverseString(s, idx-1);
        str +=s.charAt(idx);


        return str +sml;
    }
    
    public static boolean isPalindrome(String s,int si,int ei)
    {
        if(si>=ei)
        {
            return true;
        }
        return (s.charAt(si) == s.charAt(ei) && isPalindrome(s, si+1, ei-1));
    }
    public static void main(String[] args) {
        String s = "sahil";
        System.out.println(reverseString(s, s.length()-1));

        System.out.println(isPalindrome(s, 0, s.length()-1));
    }
    
}
