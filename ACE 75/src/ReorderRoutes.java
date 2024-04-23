import java.util.*;

public class ReorderRoutes {
    public int minReorder(int n, int[][] connections) {
        List<List<Integer>> graph = new ArrayList<>();

        for(var i = 0; i < n; i++)
            graph.add(new ArrayList<>());

        for(var connection: connections) {
            var from = connection[0];
            var to = connection[1];

            graph.get(from).add(to);
            graph.get(to).add(-from);
        }

        Set<Integer> visited = new HashSet<>();
        return dfs(0, graph, visited);
    }

    private int dfs(int node, List<List<Integer>> graph, Set<Integer> visited) {
        visited.add(node);
        int count = 0;
        for(var neighbour : graph.get(node)) {
            if(!visited.contains(Math.abs(neighbour))) {
                count += dfs(Math.abs(neighbour), graph, visited);
                if (neighbour > 0)
                    count++;
            }
        }

        return count;
    }
}
