package Recursion.Strings;

public class ReverseString {

    public static void reverseString(String s,int idx)
    {
        if(idx > s.length()-1)
        {
            return;
        }
        reverseString(s, idx+1);
        System.out.println(s.charAt(idx));

    }
    public static void main(String[] args) {
        String s = "sahil";
        reverseString(s, 0);
    }
    
}
