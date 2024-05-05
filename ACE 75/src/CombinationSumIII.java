import java.util.LinkedList;
import java.util.List;

public class CombinationSumIII {
    List<List<Integer>> res = new LinkedList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        combinationSum3(k, n, new LinkedList<>(), 1);
        return res;
    }

    public void combinationSum3(int k, int n, List<Integer> list, int start) {
        if (k == 0 && n == 0) {
            res.add(new LinkedList<>(list));
            return;
        }
        if (k == 0 || n < 0) {
            return;
        }
        for (int i = start; i <= 9 && i <= n; i++) {
            list.add(i);
            combinationSum3(k - 1, n - i, list, i + 1);
            list.removeLast();
        }
    }
}
