package com.Strings;

public class LicenseFormatter {

  public static void main(String args[]){
    System.out.println(licenseKeyFormatting("--a-a-a-a--",2));
  }
  public static String licenseKeyFormatting(String S, int K) {
    StringBuffer output = new StringBuffer();
    for(int i= S.length()-1;i>=0;i--){
      if(S.charAt(i) == '-') continue;
      else {
        if(output.length() % (K+1) == K && i>=0) output.append('-');
        output.append(Character.toUpperCase(S.charAt(i)));

      }
    }

    return output.reverse().toString();


  }
}
