import java.util.Hashtable;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Hashtable<Integer, Integer> dict= new Hashtable<>();
        for (int num : nums) {
            if (dict.containsKey(num))
                dict.put(num, dict.get(num) + 1);
            else
                dict.put(num, 1);
        }

        int arrSize = nums.length;
        for (var key : dict.keySet()) {
            if(key > arrSize/2) {
                return key;
            }
        }

        return -1;
    }
}
