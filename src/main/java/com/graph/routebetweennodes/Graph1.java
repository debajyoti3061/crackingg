package com.graph.routebetweennodes;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph1 {
	private int V1;
	private LinkedList<Integer> ad[];

	public Graph1(int v) {

		V1 = v;
		ad = new LinkedList[v];

		for (int i = 0; i < v; i++) {
			ad[i] = new LinkedList();
		}
	}

	void addEdge(int v, int w) {
		ad[v].add(w);
	}

	Boolean isReachable(int s, int d) {
		LinkedList<Integer> queue = new LinkedList<> ();
		boolean visited[] = new boolean [V1];
		Iterator<Integer> i;
		queue.add(s);
		while (queue.size() != 0){
			s = queue.poll();
			int n;
			i = ad[s].listIterator();
			while (i.hasNext()){
				n = i.next();  
				if (d == n){
					return true;
				}
				if (!visited[n]){
					visited[n] = true;
					queue.add(n);
				}
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		Graph1 g = new Graph1(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);

		int u = 1;
		int v = 3;
		if (g.isReachable(u, v))
			System.out.println("There is a path from " + u + " to " + v);
		else
			System.out.println("There is no path from " + u + " to " + v);
		;
	}

}
