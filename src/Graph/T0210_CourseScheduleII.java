package Graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class T0210_CourseScheduleII {
    List<Integer> postorder = new ArrayList<>();
    boolean[] visited;
    boolean[] onPath;
    boolean hasCycle = false;

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<Integer>[] graph = buildGraph(numCourses, prerequisites);

        visited = new boolean[numCourses];
        onPath = new boolean[numCourses];

        for (int i = 0; i < numCourses; i++) {
            traverse(i,graph);
        }

        if (hasCycle) {
            return new int[]{};
        }
        // 逆后序遍历结果即为拓扑排序结果
        Collections.reverse(postorder);
        int[] res = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            res[i] = postorder.get(i);
        }
        return res;
    }

    public void traverse(int s,List<Integer>[] graph){
        if(onPath[s] == true){
            hasCycle = true;
        }

        if(visited[s] || hasCycle){
            return;
        }

        visited[s] = true;
        onPath[s] = true;

        for(int t : graph[s]){
            traverse(t,graph);
        }
        postorder.add(s);
        onPath[s] = false;
    }

    public List<Integer>[] buildGraph(int s, int[][] prerequisites){
        List<Integer>[] graph = new LinkedList[s];

        for (int i = 0; i < s; i++) {
            graph[i] = new LinkedList<>();
        }

        for(int[] edge : prerequisites ){
            int from = edge[1];
            int to = edge[0];
            graph[from].add(to);
        }

        return graph;
    }
}
