package com.Strings;

import java.util.*;

public class UniqueEmail {
  public static  void main(String args[]){
    String[] emails={"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
    System.out.println(numUniqueEmails(emails));
  }

  public static int numUniqueEmails(String[] emails) {

    Set<String> emailset = new HashSet<>();
    int count=0;
    for(String email:emails){
      char[] charsInemail = email.toCharArray();
      String actualemail="";
      for(char singlechar:charsInemail){
        if(singlechar == '.') continue;
        else if (singlechar =='+'){
          while(singlechar != '@') continue;
        }
        else actualemail+= singlechar;
      }
      System.out.println(actualemail);
      if (emailset.add(actualemail) == true) count++;
    }
    return count;
  }
}
