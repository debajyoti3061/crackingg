package com.sorting;

import static java.lang.System.exit;

public class KthLargestElementQuickSelect {
  int partition(int arr[], int low, int high)
  {
    int last = arr[high];
    int i = low-1;
    for (int j=low; j<high; j++)
    {
      if (arr[j] <= last)
      {
        i++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    int temp = arr[i+1];
    arr[i+1] = arr[high];
    arr[high] = temp;
    return i+1;
  }


  /* The main function that implements QuickSort()
    arr[] --> Array to be sorted,
    low  --> Starting index,
    high  --> Ending index */
  int sort(int arr[], int low, int high , int index){
    if (index > 0 && index <= high - low + 1)
    {
      // Partition the array around last
      // element and get position of pivot
      // element in sorted array
      int pi = partition(arr, low, high);

      // If position is same as index
      if (pi-low == index-1)
        return arr[pi];

      // If position is more, recur for
      // left subarray
      if (pi-low > index-1)
        return sort(arr, low, pi-1, index);

      // Else recur for right subarray
      return sort(arr, pi+1, high, index-1-pi+low);
    }

    // If k is more than number of elements
    // in array
    return Integer.MAX_VALUE;
  }




  public static void main(String args[])
  {
    int arr[] = {10, 7, 8, 9, 1, 5, 12, 3, 2};
    int n = arr.length;

    KthLargestElementQuickSelect ob = new KthLargestElementQuickSelect();
    System.out.print(ob.sort(arr, 0, n-1 , 8));

  }
}
