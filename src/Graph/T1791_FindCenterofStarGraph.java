package Graph;

public class T1791_FindCenterofStarGraph {
    public int findCenter(int[][] edges) {
        int num;
        if(edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1])
            num = edges[0][0];
        else
            num = edges[0][1];
        return num;
    }
}
