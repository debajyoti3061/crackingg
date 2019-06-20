package com.array;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        int[] map = new int[26];
        for(char task : tasks){
            map[task-'A']++;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)->b-a);
        /*PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>(){
            @Override
            public int compare(Integer a, Integer b){
                return b-a;
            }
        });*/

        for(int count: map){
            if(count > 0)
                pq.add(count);
        }
        int time = 0;
        while(!pq.isEmpty()){
            int i = 0;
            List<Integer> temp = new LinkedList<>();
            while(i <= n){
                if(!pq.isEmpty()){
                    int count = pq.poll()-1;
                    if(count > 0)
                        temp.add(count);
                }
                i++;
                time++;
                if(temp.size() == 0) break;
            }
            for(int count : temp){
                pq.add(count);
            }
        }
        return time;
    }
}
