package com.array;

public class SearchElementSortedArray {

  private static int binarysearch(int[] arr, int low, int high, int key) {
    if (high < low)
      return -1;
    int mid = (low+high)/2;
    if (key== arr[mid])
      return mid;
    if (key< arr[mid])
      return binarysearch(arr,low,mid-1,key);
    return binarysearch(arr,mid+1,high,key);
  }

  public static void main(String args[])
  {
    // Let us search 3 in below array
    int arr1[] = {1,2,3,5,  7, 8, 9, 10};
    int n = arr1.length;
    int key = 7;
    System.out.println("Index of the element is : "
        + binarysearch(arr1, 0,n, key));
  }
}
