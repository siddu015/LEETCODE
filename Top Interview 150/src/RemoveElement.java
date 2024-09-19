//27

import java.util.ArrayDeque;
import java.util.Queue;

public class RemoveElement {
    int removeElement(int[] nums, int val) {
        Queue<Integer> queue = new ArrayDeque<>();

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                queue.add(nums[i]);
            }
        }

        int k = queue.size();
        for(int i = 0; !queue.isEmpty(); i++) {
            nums[i] = queue.remove();
        }

        return k;
    }
}
