public class NumberOfProvinces {
    public int findCircleNum(int[][] mat) {
        int answer = 0, matrixSize = mat.length;
        boolean[] visit = new boolean[matrixSize];
        for(int i = 0; i < matrixSize; i++){
            if(!visit[i]) {
                answer++;
                dfs(i, visit, mat);
            }
        }
        return answer;
    }

    private void dfs(int node, boolean[] visit, int[][] mat) {
        visit[node] = true;
        for(int i = 0; i < mat.length; i++)
            if(!visit[i] && mat[node][i] == 1)
                dfs(i, visit, mat);
    }
}
