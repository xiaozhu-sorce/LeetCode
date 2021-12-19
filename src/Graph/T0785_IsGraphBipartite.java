package Graph;

public class T0785_IsGraphBipartite {
    private boolean ok = true;

    private boolean[] color;

    private boolean[] visited;

    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        color = new boolean[n];
        visited = new boolean[n];

        for(int v = 0; v < n; v++){
            if(!visited[v]){
                traverse(graph,v);
            }
        }
        return ok;
    }

    public void traverse(int[][] graph,int v){
        if(!ok) return;

        visited[v] = true;
        for(int w:graph[v]){
            if(!visited[w]){
                color[w] = !color[v];
                traverse(graph,w);
            }else{
                if(color[w] == color[v]){
                    ok = false;
                    return;
                }
            }

        }
    }
}
