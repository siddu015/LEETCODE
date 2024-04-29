import java.util.*;

public class NearestExitInMaze {

    public int nearestExit(char[][] maze, int[] entrance) {
        var m = maze.length;
        var n = maze[0].length;
        var startRow = entrance[0];
        var startCol = entrance[1];

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{entrance[0], entrance[1]});
        maze[startRow][startCol] = '+';

        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        var steps = 0;

        while (!queue.isEmpty()) {
            var size = queue.size();

            while (size-- > 0) {
                int[] current = queue.poll();
                assert current != null;
                var row = current[0];
                var col = current[1];

                for (var direction : directions) {
                    var r = row + direction[0];
                    var c = col + direction[1];
                    if (r < 0 || r >= m || c < 0 || c >= n) {
                        if (!(row == startRow && col == startCol))
                            return steps;
                        else continue;
                    }

                    if (maze[r][c] == '+') continue;
                    maze[r][c] = '+';
                    queue.offer(new int[]{r, c});
                }
            }
            steps++;
        }
        return -1;
    }
}
