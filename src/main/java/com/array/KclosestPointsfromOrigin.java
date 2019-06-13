package com.array;

import java.util.PriorityQueue;

public class KclosestPointsfromOrigin {
    public static void main(String args[]){
        int[][] points = {{2,10},{-9,-9},{0,8},{-2,-2},{8,9},{-10,-7},{-5,2},{-4,-9}};
        //int [][] points={{1,1},{-9,-9},{-10,-7},{8,9}};
        int K = 7;
        int results[][]= kClosest(points,K);
        for(int i=0;i<results.length;i++) {
            for (int j = 0; j < results[i].length; j++) {
                System.out.print(results[i][j] + ",");
            }
            System.out.println();
        }
    }

        private static int[][] kClosest(int[][] points, int K) {
        PriorityQueue<QNode> pq= new PriorityQueue<>();
        int n=points.length;

        double distance[] = new double[n];
        int[][] result = new int[K][2];
        for(int i=0;i<n;i++){
           distance[i] =  Math.sqrt(points[i][0]*points[i][0]+points[i][1]*points[i][1]);
           pq.add(new QNode(points[i][0],points[i][1],distance[i]));
       }
       int j=0;
       while(K>0){
            QNode q= pq.poll();
            result[j][0]=q.xpoint;
            result[j][1]=q.ypoint;
            j++;
            K--;
       }

        return result;
    }
}

 class QNode implements Comparable<QNode>{

     public QNode(int xpoint, int ypoint, double distance) {
         this.xpoint = xpoint;
         this.ypoint = ypoint;
         this.distance = distance;
     }

     int xpoint,ypoint;
     double distance;

    @Override
    public int compareTo(QNode n) {
        if (distance>n.distance) return 1;
        else if (distance<n.distance) return -1;
        else return 0;
    }
}
