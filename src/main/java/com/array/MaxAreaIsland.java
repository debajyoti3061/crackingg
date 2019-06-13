package com.array;

public class MaxAreaIsland {
  public static void main(String args[]){
    int[][] input ={{0,0,1,0,0,0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,1,0,0,0,0,0},
                    {0,0,1,0,0,1,0,1,0,0,0,0,0},
                    {1,0,1,0,0,1,1,1,0,0,0,0,1},
                    {0,0,0,0,0,0,0,1,0,0,0,0,0},
                    {0,0,1,0,0,0,0,0,0,1,0,0,1}
    };
    System.out.println( islandArea(input));
  }

  private static int islandArea(int[][] input) {
    int max=0;
    for(int i=0;i<input.length;i++)
      for(int j=0;j<input[i].length;j++){
      if(input[i][j]==1) max= Math.max(max,dfs(input,i,j));
      }
    return max;
  }

  private static int dfs(int[][] input, int i, int j) {
    if(i<0 || i>=input.length || j<0|| j>=input[i].length || input[i][j]==0) return 0;
    input[i][j]=0;
    int count =1;
    count+=dfs(input,i-1,j);
    count+=dfs(input,i+1,j);
    count+=dfs(input,i,j-1);
    count+=dfs(input,i,j+1);
    return count;
  }
}
