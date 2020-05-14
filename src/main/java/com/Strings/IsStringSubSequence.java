package com.Strings;

public class IsStringSubSequence {
    static boolean isSubSequence(String s, String t)
    {
        if (s.length() == 0) return true;
        int indexS = 0, indexT = 0;
        while (indexT < t.length()) {
            if (t.charAt(indexT) == s.charAt(indexS)) {
                indexS++;
                if (indexS == s.length()) return true;
            }
            indexT++;
        }
        return false;
    }

    // Driver program
    public static void main (String[] args)
    {
        String str1 = "gksrek";
        String str2 = "geeksforgeeks";

        boolean res = isSubSequence(str1, str2);
        if(res)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
