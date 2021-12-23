package Graph;

import java.util.LinkedList;
import java.util.List;

public class T0886_PossibleBipartition {
    public boolean ok = true;
    public boolean[] color;
    public boolean[] visited;
    public boolean possibleBipartition(int n, int[][] dislikes) {
        color = new boolean[n+1];
        visited = new boolean[n+1];

        List<Integer>[] graph = buildGraph(n,dislikes);

        for(int v = 1; v <= n; v++){
            if(!visited[v])
                traverse(v,graph);
        }
        return ok;
    }

    public List<Integer>[] buildGraph(int n, int[][] dislikes){
        List<Integer>[] graph = new LinkedList[n+1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new LinkedList<>();
        }
        for (int[] edge : dislikes) {
            int v = edge[1];
            int w = edge[0];
            graph[v].add(w);
            graph[w].add(v);
        }
        return graph;
    }

    public void traverse(int v, List<Integer>[] graph){
        if(!ok) return;

        visited[v] = true;

        for(int w : graph[v]){
            if(!visited[w]){
                color[w] = !color[v];
                traverse(w,graph);
            }else{
                if (color[w] == color[v]) {
                    ok = false;
                }
            }
        }

    }
}
