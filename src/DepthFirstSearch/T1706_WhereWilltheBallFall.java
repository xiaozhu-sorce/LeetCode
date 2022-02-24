package DepthFirstSearch;

public class T1706_WhereWilltheBallFall {
    public int[] findBall(int[][] grid) {
        int[] res = new int[grid[0].length];

        for (int i = 0; i < grid[0].length;i++){
            res[i] = dfs(grid,0,i);
        }
        return res;
    }

    int dfs(int[][] grid, int i,int j){
        if(i == grid.length) return j;

        if(j == 0 && grid[i][j] == -1 || j == grid[0].length - 1 && grid[i][j] == 1) return -1;

        if(grid[i][j] == 1 && grid[i][j+1] == -1)   return -1;
        if(grid[i][j] == -1 && grid[i][j-1] == 1)   return -1;


        return dfs(grid,i+1,j+grid[i][j]);
    }
}
