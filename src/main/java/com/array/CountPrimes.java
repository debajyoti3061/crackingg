package com.array;

public class CountPrimes {
  public static void main(String[] arg){
    System.out.println(countPrimes(20));
  }

  public static int countPrimes(int n){
    boolean count[] = new boolean[n];
    for(int i=0;i<n;i++){
      count[i]=true;
    }

    for(int i=2; i*i<n;i++){
      if(count[i]==true){
        for(int j=i;i*j<n;j++){
          count[i*j]=false;
        }
      }
    }
    int primeCount=0;
    for(int i=2;i<n;i++){
      if(count[i]) primeCount++;
    }
    return primeCount;
  }
}
