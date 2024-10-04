import java.util.*;

class Dijkstras_Algo {
    public static void main(String[] args) {
        int[][] graph = { { 0, 1, 0, 2, 0, 0 },
                { 1, 0, 3, 1, 0, 0 },
                { 0, 3, 0, 0, 2, 4 },
                { 2, 1, 0, 0, 1, 0 },
                { 0, 0, 2, 1, 0, 1 },
                { 0, 0, 4, 0, 1, 0 },
        };
        dij(graph, 0);
    }

    public static void dij(int[][] graph, int src) {
        int v = graph.length;
        int[] ans = new int[v];
        boolean[] sptSet = new boolean[v];
        Arrays.fill(ans, Integer.MAX_VALUE);
        ans[src] = 0;
        for (int i = 0; i < v - 1; i++) {
            int u = minDistance(ans, sptSet);
            sptSet[u] = true;
            for (int x = 0; x < v; x++) {
                if (!sptSet[x] && graph[u][x] != 0 && ans[u] + graph[u][x] < ans[x]) {
                    ans[x] = ans[u] + graph[u][x];
                }
            }
        }
        for (int i : ans) {
            System.out.println(i);
        }
    }

    public static int minDistance(int[] ans, boolean[] sptSet) {
        int min = Integer.MAX_VALUE;
        int idx = -1;
        for (int i = 0; i < ans.length; i++) {
            if (!sptSet[i] && ans[i] < min) {
                min = ans[i];
                idx = i;
            }
        }
        return idx;

    }
}