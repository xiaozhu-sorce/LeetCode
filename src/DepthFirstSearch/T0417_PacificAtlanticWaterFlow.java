package DepthFirstSearch;

import java.util.ArrayList;
import java.util.List;

public class T0417_PacificAtlanticWaterFlow {
    int[][] h;
    int n, m;

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        h = heights;
        m = heights.length;
        n = heights[0].length;
        boolean[][] res1 = new boolean[m][n], res2 = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0)
                    if (!res1[i][j]) dfs(i, j, res1);
                if (i == m - 1 || j == n - 1)
                    if (!res2[i][j]) dfs(i, j, res2);
            }
        }

        List<List<Integer>> lists = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (res1[i][j] && res2[i][j]){
                    List<Integer> l = new ArrayList<>();
                    l.add(i);
                    l.add(j);
                    lists.add(l);
                }
            }
        }
        return lists;
    }

    int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public void dfs(int i, int j, boolean[][] res) {
        res[i][j] = true;

        for (int[] dis : dirs) {
            int nx = i + dis[0], ny = j + dis[1];
            if (nx < 0 || nx >= m || ny < 0 || ny >= n) continue;
            if (res[nx][ny] || h[nx][ny] < h[i][j]) continue;
            dfs(nx, ny, res);
        }

    }
}
