package com.array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Suppose you have a random list of people standing in a queue. Each person is described by a pair of integers (h, k), where h is the height of the person and k is the number of people in front of this person who have a height greater than or equal to h. Write an algorithm to reconstruct the queue.

 Note:
 The number of people is less than 1,100.


 Example

 Input:
 [[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]

 Output:
 [[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
 */
public class ReconstructionbyHeight {
    public static void main(String[] args){
        int people[][]={{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        int answer[][]= reconstructQueue(people);
        System.out.println(Arrays.deepToString(answer));
    }
    public static int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,(a, b)-> (a[0]==b[0])?a[1]-b[1]:b[0]-a[0]);
        System.out.println(Arrays.deepToString(people));
        List<int[]> res = new LinkedList<>();
        for(int[] cur : people){
            res.add(cur[1],cur);// index, value
        }
        return res.toArray(new int[people.length][]);
    }
}
