package com.Strings;

public class StringCompare {
    public static void main(String args[]){
        StringBuffer sb1 = new StringBuffer("Amit");
        StringBuffer sb2 = new StringBuffer("Amit");
        String ss1 = "Amit";
        String ss2="Amit";
        System.out.println(sb1==sb2);
        System.out.println(sb1.equals(sb2));
        System.out.println(sb1.equals(ss1));
        System.out.println(ss1==ss2);
        System.out.println("Poddar".substring(3));

        String s = " Hello  ";
        s+= "Adobe  ";
        s.trim();
        System.out.print(s);
    }
}
