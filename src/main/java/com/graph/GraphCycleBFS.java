package com.graph;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class GraphCycleBFS {
    int V;
    private LinkedList<Integer> adj[];

    GraphCycleBFS(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList();
        }
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    boolean BFS(int s) {
        int parent[] = new int[V];
        Arrays.fill(parent, -1);
        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[s] = true;
        queue.add(s);
        while (queue.size() != 0) {
            s = queue.poll();
            //System.out.println(s);
            Iterator<Integer> i = adj[s].iterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                    parent[n]=s;
                }else if(parent[s] !=n)
                    return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        GraphCycleBFS g = new GraphCycleBFS(4);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3,2);

        System.out.println(g.BFS(0));
    }
}
