package com.array;

import java.util.*;

public class MergeKsortedLists {
  public static void main(String args[]){
    int n = 3;

    // Here aList is an ArrayList of ArrayLists
    ArrayList<ArrayList<Integer> > aList =
        new ArrayList<ArrayList<Integer>>(n);

    // Create n lists one by one and append to the
    // master list (ArrayList of ArrayList)
    ArrayList<Integer> a1 = new ArrayList<Integer>();
    a1.add(1);
    a1.add(5);
    aList.add(a1);

    ArrayList<Integer> a2 = new ArrayList<Integer>();
    a2.add(3);
    aList.add(a2);

    ArrayList<Integer> a3 = new ArrayList<Integer>();
    a3.add(2);
    a3.add(4);
    a3.add(30);
    aList.add(a3);


    List<Integer> result = mergeLists(aList,n);
    for(Integer a: result){
      System.out.println(a);
    }
  }

  private static List<Integer> mergeLists(ArrayList<ArrayList<Integer>> input,int n) {
    int size = 0;
    List<Integer> result = new ArrayList<>();
    PriorityQueue<ANode> pq = new PriorityQueue<>();
    for(int i=0;i<n;i++){
      size+= input.get(i).size();
      pq.add(new ANode(i,0,input.get(i).get(0)));
    }

    for(int i=0;!pq.isEmpty();i++){
      ANode a = pq.poll();
      result.add(a.value);
      int newIndex = a.index+1;
      int listNumber = a.array;
      if(newIndex < input.get(listNumber).size()){
        pq.add(new ANode(listNumber,newIndex,input.get(listNumber).get(newIndex)));
      }

    }

    return result;
  }
}

class ANode implements Comparable<ANode>{

  int array,index,value;


  public ANode(int array, int index, int value) {
    this.array=array;
    this.index=index;
    this.value=value;
  }


  @Override
  public int compareTo(ANode node) {
    return Integer.compare(value,node.value);
  }
}
