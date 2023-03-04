package Recursion.Strings;


// this class has a string function that removes a char from a string
// using recursion
// base case = if idx > ending index return ""
// self work = make a string and assign the first char condition if the 
// first char satisfies the condition then add to the string
// then make a new string that takes all the recursive data
// finally add both the strings to get the final result and 
// return the final result

public class RemoveChar {

    // time complexity = O(n)
    // space complexity = O(n) iff output string is counted in
    public static String removeCharOcc(String s,int idx, char c)
    {
        if(idx > s.length()-1)
        {
            return "";
        }
        String newStr = "";
        if(!String.valueOf(s.charAt(idx)).equals(String.valueOf(c)))
        {
            newStr += String.valueOf(s.charAt(idx));
        }

         

        return  newStr+removeCharOcc(s, idx+1,c);
    }

    // this below method does the same function but without passing the index

    public static String removeCharFromStr(String s)
    {
        if(s.length() <1)
        {
            return "";
        }
        String newStr = "";
        if(!String.valueOf(s.charAt(0)).equals("a"))
        {
            newStr += String.valueOf(s.charAt(0));
        }
        
        return newStr+removeCharFromStr(s.substring(1));
    }

    public static void main(String[] args) {
        String s = "aabcdefa";

        System.out.println(removeCharOcc(s, 0, 'a'));

        System.out.println(removeCharFromStr(s));
    }
    
}
