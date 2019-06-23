package com.array;
//https://www.youtube.com/watch?v=vYYNp0Jrdv0&list=PLi9RQVmJD2fZgRyOunLyt94uVbJL43pZ_&index=33
public class WordSearch {
public static void main(String args[]){
    char[][] board={
            {'a','b','c'},
            {'d','e','f'},
            {'g','h','i'}
    };
    String input="befi";
    System.out.println(wordsearch(board,input));
}

    private static boolean wordsearch(char[][] board,String input) {

    for(int i= 0;i<board.length;i++)
        for(int j=0;j<board[i].length;j++){
            if(board[i][j]==input.charAt(0) && dfs(board,input,i,j,0))
                return true;
        }

        return false;
    }

    private static boolean dfs(char[][] board, String input, int i, int j,int index) {
       if(index==input.length()) return true;
        if(i<0 || i>=board.length ||j<0||j>=board[i].length || input.charAt(index)!=board[i][j])
            return false;
        char temp=board[i][j];
        board[i][j]=' ';
        boolean found=
                dfs(board,input,i-1,j,index+1)||
                dfs(board,input,i,j-1,index+1)||
                dfs(board,input,i+1,j,index+1)||
                dfs(board,input,i,j+1,index+1);
        board[i][j]=temp;

        return found;
    }

}


