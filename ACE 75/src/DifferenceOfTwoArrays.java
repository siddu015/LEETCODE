import java.util.*;

public class DifferenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(var num: nums1) {
            if(!elementCheck(nums2, num)) {
                set1.add(num);
            }
        }
        result.add(set1.stream().toList());

        for(var num: nums2) {
            if(!elementCheck(nums1, num)) {
                set2.add(num);
            }
        }
        result.add(set2.stream().toList());

        return result;
    }

    private boolean elementCheck(int[] arr, int key) {
        for (int element : arr) {
            if (element == key) {
                return true; // Key found, return true
            }
        }
        return false; // Key not found in the array
    }
}
