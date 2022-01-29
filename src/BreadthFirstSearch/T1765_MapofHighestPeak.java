package BreadthFirstSearch;

import java.util.LinkedList;
import java.util.Queue;

public class T1765_MapofHighestPeak {
    public int[][] highestPeak(int[][] isWater) {
        int m = isWater.length;
        int n = isWater[0].length;
        Queue<int[]> q = new LinkedList<>();
        int[][] height = new int[m][n];
        for (int i = 0 ; i < m ;i++){
            for(int j = 0; j < n; j++){
                if(isWater[i][j] == 1)
                    q.add(new int[]{i,j});
                height[i][j] = isWater[i][j] == 1 ? 0 : -1;
            }
        }
        int[][] dirs = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int[] info = q.poll();
            int x = info[0], y = info[1];
            for(int[] di : dirs){
                int nx = x + di[0], ny = y + di[1];
                if (nx < 0 || nx >= m || ny < 0 || ny >= n) continue;
                if (height[nx][ny] != -1) continue;
                height[nx][ny] = height[x][y] + 1;
                q.add(new int[]{nx,ny});
            }
        }
        return height;
    }
}
