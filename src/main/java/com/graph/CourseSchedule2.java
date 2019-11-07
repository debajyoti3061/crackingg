package com.graph;

import java.util.*;

public class CourseSchedule2 {
    public static void main(String[] args){
        int[][] prerequisites={{1,0},{2,0},{3,1},{3,2}};
        int num =4;
        int[] ans = findOrder(num,prerequisites);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] findOrder(int numCourses, int[][] prerequisites) {
    ArrayList[] graph = new ArrayList[numCourses];
    int[] res = new int[numCourses];
    Set hs = new HashSet();
    int index = 0;

    for(int i=0;i<numCourses;i++)
        graph[i] = new ArrayList();

    boolean[] visited = new boolean[numCourses];
    for(int i=0; i<prerequisites.length;i++){
        graph[prerequisites[i][0]].add(prerequisites[i][1]);
    }

    for(int i=0; i<numCourses; i++){
        if(hs.contains(i))
            continue;
        Stack stack = new Stack();
        if(!dfs(graph,visited,i,stack,hs))
            return (new int[0]);
        while(stack.size()!=0){
            int temp = (int)stack.pop();
            if(!hs.contains(temp)){
                res[index++] = temp;
                hs.add(temp);
            }
        }
    }
    return res;
}

    private static boolean dfs(ArrayList[] graph, boolean[] visited, int course, Stack stack, Set hs){
        if(visited[course])
            return false;
        else{
            if(hs.contains(course))
                return true;
            else{
                stack.add(course);
                visited[course] = true;
            }
        }

        for(int i=0; i<graph[course].size();i++){
            if(!dfs(graph,visited,(int)graph[course].get(i),stack,hs))
                return false;
        }
        visited[course] = false;
        return true;
    }
}
