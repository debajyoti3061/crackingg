package com.array;

import java.util.*;

public class TaskScheduler {
    public static int leastInterval(char[] tasks, int n) {

        int[] map = new int[26];
        for(char task : tasks){
            map[task-'A']++;
        }

        Arrays.sort(map);
        int time = 0;
        while(map[25]>0){

            int i=0;
            int j=25;
            while(i<=n && map[j]>0){
                map[j]--;
                time++;
                i++;
                j= j==0?25:j-1;
            }

            Arrays.sort(map);
            if(map[25] == 0) break;
            time = time +n-i+1;
        }
        return time;
    }

    public static void main(String args[]){
        char[] arr={'A','A','B','C','B','D','C','C','A','B','A','A'};
        int time=2;
        System.out.println(leastInterval(arr,time));
    }
}
