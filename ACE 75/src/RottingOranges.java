import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
    public int orangesRotting(int[][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length == 0)
            return -1;

        var m = grid.length;
        var n = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        var freshOranges = 0;

        for(var i = 0; i < m; i++)
            for(var j = 0; j < n; j++){
                if(grid[i][j] == 1)
                    freshOranges++;
                else if(grid[i][j] == 2)
                    queue.offer(new int[]{i, j});
            }

        if(freshOranges == 0)
            return 0;

        int[][] directions = {{1,0}, {-1, 0}, {0, 1}, {0, -1}};
        var minutes = 0;

        while (!queue.isEmpty()) {
            var size = queue.size();
            var hasRotten = false;

            while(size-- > 0) {
                int[] current = queue.poll();
                assert current != null;
                var x = current[0];
                var y = current[1];

                for(var direction : directions) {
                    var newX = x + direction[0];
                    var newY = y + direction[1];

                    if(newX >= 0 && newX < m && newY >= 0 && newY < n && grid[newX][newY] == 1) {
                        grid[newX][newY] = 2;
                        queue.offer(new int[]{newX, newY});
                        freshOranges--;
                        hasRotten = true;
                    }
                }
            }

            if(hasRotten)
                minutes++;
        }

        return freshOranges == 0 ? minutes : -1;
    }
}