package com.array;


/**
 * 1) Find out pivot point and divide the array in two
 * sub-arrays. (pivot = 2)
 * 2)Now call binary search for one of the two sub-arrays.
 * (a)If element is greater than 0th element then
 * search in left array
 * (b)Else Search in right array
 * (1will go in else as 1< 0th element(3))
 * 3)If element is found in selected sub-array then return index
 * Else return-1.
 * log n
 */
public class SearchElementinSortedPivotedArray {
  //https://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-pivoted-array/
  static int pivotedBinarySearch(int arr[], int n, int key) {
    int pivot = findPivot(arr, 0, n - 1);
    System.out.println(pivot);
    if (pivot == -1)
      return binarysearch(arr, 0, n - 1, key);
    if (arr[pivot] == key)
      return pivot;
    if (arr[0] <= key)
      return binarysearch(arr, 0, pivot - 1, key);
    return binarysearch(arr, pivot + 1, n - 1, key);
  }

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

  private static int findPivot(int[] arr, int low, int high) {
    if (high < low)
      return -1;
    if (high == low)
      return low;
    int mid = (low + high)/2;
    if (mid < high && arr[mid] > arr[mid + 1])
      return mid;
    if (mid > low && arr[mid] < arr[mid - 1])
      return (mid-1);
    if (arr[low] >= arr[mid])
      return findPivot(arr, low, mid-1);
    return findPivot(arr, mid + 1, high);
  }

  public static void main(String args[])
  {
    // Let us search 3 in below array
    int arr1[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
    int n = arr1.length;
    int key = 3;
    System.out.println("Index of the "+key+ " sis : "
        + pivotedBinarySearch(arr1, n, key));
  }
}
