package com.array;

public class NumberofIsland {

  public static void main(String args[]){
    int[][] input =
        {{0,0,1,0,0,0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,1,0,0,0,0,0},
         {0,0,1,0,0,1,0,1,0,0,0,0,0}
    };
    System.out.println( numIslands(input));
  }

  public static int numIslands(int[][] grid) {
    int result =0;

    if(grid.length == 0 || grid ==null) return 0;

    for(int i=0;i <grid.length;i++)
      for(int j =0 ;j< grid[i].length;j++){
        if(grid[i][j] ==1)
          result+= dfs(i,j,grid);
      }
    return result;
  }

  public static int dfs( int i, int j,int[][] grid){
    if(i<0 || i >=grid.length || j<0 || j>=grid[i].length || grid[i][j]==0) return 0;


    grid[i][j]=0;
    dfs(i-1,j,grid);
    dfs(i+1,j,grid);
    dfs(i,j-1,grid);
    dfs(i,j+1,grid);

    return 1;

  }

}
