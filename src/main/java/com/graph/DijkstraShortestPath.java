package com.graph;

public class DijkstraShortestPath {
  private static final int NO_PARENT = -1;

  // Function that implements Dijkstra's
  // single source shortest path
  // algorithm for a graph represented
  // using adjacency matrix
  // representation
  private static void dijkstra(int[][] adjacencyMatrix,
                               int startVertex) {
    int n = adjacencyMatrix[0].length;

    // shortestDistances[i] will hold the
    // shortest distance from src to i
    int[] shortestDistances = new int[n];

    // added[i] will true if vertex i is
    // included / in shortest path tree
    // or shortest distance from src to
    // i is finalized
    boolean[] added = new boolean[n];

    // Initialize all distances as
    // INFINITE and added[] as false
    for (int i = 0; i < n;i++) {
      shortestDistances[i] = Integer.MAX_VALUE;
      added[i] = false;
    }

    // Distance of source vertex from
    // itself is always 0
    shortestDistances[startVertex] = 0;

    // Parent array to store shortest
    // path tree
    int[] parents = new int[n];

    // The starting vertex does not
    // have a parent
    parents[startVertex] = NO_PARENT;

    // Find shortest path for all
    // vertices
    for (int i = 1; i < n; i++) {

      // Pick the minimum distance vertex
      // from the set of vertices not yet
      // processed. nearestVertex is
      // always equal to startNode in
      // first iteration.
      int nearestVertex = -1;
      int shortestDistance = Integer.MAX_VALUE;
      for (int j = 0; j < n; j++) {
        if (!added[j] && shortestDistances[j]<shortestDistance) {
          nearestVertex = j;
          shortestDistance = shortestDistances[j];
        }
      }

      // Mark the picked vertex as
      // processed
      added[nearestVertex] = true;

      // Update dist value of the
      // adjacent vertices of the
      // picked vertex.
      for (int j = 0;j < n;j++) {
        int edgeDistance = adjacencyMatrix[nearestVertex][j];

        if (edgeDistance > 0
            && ((shortestDistance + edgeDistance) <
            shortestDistances[j])) {
          parents[j] = nearestVertex;
          shortestDistances[j] = shortestDistance +
              edgeDistance;
        }
      }
    }

    printSolution(startVertex, shortestDistances, parents);
  }

  // A utility function to print
  // the constructed distances
  // array and shortest paths
  private static void printSolution(int startVertex,
                                    int[] distances,
                                    int[] parents) {
    int nVertices = distances.length;
    System.out.print("Vertex\t Distance\tPath");

    for (int vertexIndex = 0;
         vertexIndex < nVertices;
         vertexIndex++) {
      if (vertexIndex != startVertex) {
        System.out.print("\n" + startVertex + " -> ");
        System.out.print(vertexIndex + " \t\t ");
        System.out.print(distances[vertexIndex] + "\t\t");
        printPath(vertexIndex, parents);
      }
    }
  }

  // Function to print shortest path
  // from source to currentVertex
  // using parents array
  private static void printPath(int currentVertex,
                                int[] parents) {

    // Base case : Source node has
    // been processed
    if (currentVertex == NO_PARENT) {
      return;
    }
    printPath(parents[currentVertex], parents);
    System.out.print(currentVertex + " ");
  }

  // Driver Code
  public static void main(String[] args) {
    int[][] adjacencyMatrix = {{0, 4, 0, 0, 0, 0, 0, 8, 0},
        {4, 0, 8, 0, 0, 0, 0, 11, 0},
        {0, 8, 0, 7, 0, 4, 0, 0, 2},
        {0, 0, 7, 0, 9, 14, 0, 0, 0},
        {0, 0, 0, 9, 0, 10, 0, 0, 0},
        {0, 0, 4, 0, 10, 0, 2, 0, 0},
        {0, 0, 0, 14, 0, 2, 0, 1, 6},
        {8, 11, 0, 0, 0, 0, 1, 0, 7},
        {0, 0, 2, 0, 0, 0, 6, 7, 0}};
    dijkstra(adjacencyMatrix, 0);
  }
}