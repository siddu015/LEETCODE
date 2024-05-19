import java.util.*;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        System.out.println(map.containsValue(1));

        for (var entry : map.entrySet())
            if (entry.getValue().equals(1))
                return entry.getKey();

        return -1;
    }
}
