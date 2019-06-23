
package com.array;

public class WallsAndGates {
  public static void main(String args[]){
    int grid[][]={{Integer.MAX_VALUE-1,-1,0,Integer.MAX_VALUE-1},
                  {Integer.MAX_VALUE-1,Integer.MAX_VALUE-1,Integer.MAX_VALUE-1},
                  {Integer.MAX_VALUE-1,-1,Integer.MAX_VALUE-1,-1},
                  {0,-1,Integer.MAX_VALUE-1,Integer.MAX_VALUE-1}};
    wallsandgates(grid);
  }

  private static void wallsandgates(int[][] room) {
    for(int i=0;i<room.length;i++)
      for(int j = 0;j<room[i].length;j++){
      if(room[i][j]==0)
        dfs(i,j,0,room);
      }
  }

  public static void dfs(int i,int j,int count,int room[][]){
    if(i<0 ||i>=room.length || j<0 ||j>= room[i].length||room[i][j]<count){
      return;
    }
    room[i][j]=count;
    dfs(i-1,j,count+1,room);
    dfs(i,j-1,count+1,room);
    dfs(i+1,j,count+1,room);
    dfs(i,j+1,count+1,room);
  }
}
