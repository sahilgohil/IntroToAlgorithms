package ArraysTwoPointer;

public class Palindrome {

    public static void isPalindrome(String s)
    {
        String srt [] = s.split("");
        int si = 0;
        int ei = srt.length-1;
        while(si<=ei)
        {
            if(!srt[si].equalsIgnoreCase(srt[ei]))
            {
                System.out.println("Not Palindrome");
                return;
            }
            si++;
            ei--;
        }
        System.out.println("Palindrome");
    }

    public static void main(String[] args) {
        isPalindrome("college");
    }
    
}
