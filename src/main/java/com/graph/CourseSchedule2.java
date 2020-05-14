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
        ArrayList[] adj = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++)
            adj[i] = new ArrayList();
        boolean[] visited = new boolean[numCourses];
        for (int i = 0; i < prerequisites.length; i++) {
            adj[prerequisites[i][1]].add(prerequisites[i][0]);
        }
        Stack stack = new Stack();
        for (int i = 0; i < numCourses; i++)
            if (visited[i] == false)
                if (!topologicalSortUtil(i, visited, stack, adj, new boolean[numCourses]))
                    return new int[0];
        int[] res = new int[numCourses];
        for (int i = 0; i < numCourses; i++)
            res[i] = (int) stack.pop();

        return res;
    }

    private static boolean topologicalSortUtil(int s, boolean[] visited, Stack stack, ArrayList[] adj, boolean[] seen) {
        if (seen[s]) return false;
        seen[s] = true;
        Integer n;
        Iterator<Integer> i = adj[s].iterator();
        while (i.hasNext()) {
            n = i.next();
            if (!visited[n])
                if (!topologicalSortUtil(n, visited, stack, adj, seen)) {
                    return false;
                }
        }
        visited[s] = true;
        stack.push(new Integer(s));
        return true;
    }
}
