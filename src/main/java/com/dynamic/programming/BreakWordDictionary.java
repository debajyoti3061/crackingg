package com.dynamic.programming;

import java.util.*;

public class BreakWordDictionary {


    /**
     * Dynamic programming version for breaking word problem.
     * It returns null string if string cannot be broken into multipe words
     * such that each word is in dictionary.
     * Gives preference to longer words over splits
     * e.g peanutbutter with dict{pea nut butter peanut} it would result in
     * peanut butter instead of pea nut butter.
     */
    public String breakWordDP(String word, Set<String> dict){
        int n= word.length();
        int T[][] = new int[n][n];

        for(int i=0; i < n; i++){
            for(int j=0; j < n ; j++){
                T[i][j] = -1; //-1 indicates string between i to j cannot be split
            }
        }

        //fill up the matrix in bottom up manner
        for(int k = 1; k <= n; k++){
            for(int i=0; i <= n -k  ; i++){
                int j = i + k -1;
                String str = word.substring(i,j+1);
                //if string between i to j is in dictionary T[i][j] is true
                if(dict.contains(str)){
                    T[i][j] = i;
                    continue;
                }
                //find a m between i+1 to j such that T[i][m-1] && T[m][j] are both true
                for(int m=i+1; m <= j; m++){
                    if(T[i][m-1] != -1 && T[m][j] != -1){
                        T[i][j] = m;
                        break;
                    }
                }
            }
        }
        if(T[0][n-1] == -1){
            return null;
        }

        //create space separate word from string is possible
        StringBuffer buffer = new StringBuffer();
        int i = 0; int j = word.length() -1;
        while(i < j){
            int k = T[i][j];
            if(i == k){
                buffer.append(word.substring(i, j+1));
                break;
            }
            buffer.append(word.substring(i,k) + " ");
            i = k;
        }

        return buffer.toString();
    }


    public static void main(String args[]){
        Set<String> dictionary = new HashSet<String>();
        dictionary.add("I");
        dictionary.add("like");
        dictionary.add("had");
        dictionary.add("play");
        dictionary.add("to");
        String str = "Ihadliketoplay";
        BreakWordDictionary bmw = new BreakWordDictionary();
        String result1 = bmw.breakWordDP(str, dictionary);

        System.out.print(result1);
    }
}
