import java.util.HashSet;
import java.util.Set;

public class RandomizedSet {
    Set<Integer> set;

    public RandomizedSet() {
        set = new HashSet<>();
    }

    public boolean insert(int val) {
        return set.add(val);
    }

    public boolean remove(int val) {
        return set.remove(val);
    }

    public int getRandom() {
        int length = set.size();
        int[] arr = new int[length];
        int i = 0;
        for(var value : set) {
            arr[i++] = value;
        }

        int random = (int)(Math.random() * length);
        return arr[random];
    }
}
