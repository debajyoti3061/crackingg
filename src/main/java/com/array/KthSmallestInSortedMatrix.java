package com.array;

import java.util.PriorityQueue;
//https://leetcode.com/problems/find-k-pairs-with-smallest-sums/discuss/84566/share-my-solution-which-beat-9642
public class KthSmallestInSortedMatrix {
    public static void main(String[] args){
        int matrix[][] = {
                { 1,  5,  9},
                {10, 11, 13},
                {12, 13, 15}
        };
        int k = 8;
        System.out.println(kthSmallest(matrix,k));
    }
    public static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        PriorityQueue<Tuple> pq = new PriorityQueue<Tuple>();
        for(int j = 0; j <= n-1; j++) pq.add(new Tuple(j, 0, matrix[j][0]));
        for(int i = 0; i < k-1; i++) {
            Tuple t = pq.poll();
            if(t.y == n-1) continue;
            pq.add(new Tuple(t.x, t.y+1, matrix[t.x][t.y+1]));
        }
        return pq.poll().val;
    }
}

class Tuple implements Comparable<Tuple> {
    int x, y, val;
    public Tuple (int x, int y, int val) {
        this.x = x;
        this.y = y;
        this.val = val;
    }

    @Override
    public int compareTo (Tuple that) {
        return this.val - that.val;
    }
}
