//88

import java.util.PriorityQueue;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        PriorityQueue<Integer> finalArray = new PriorityQueue<Integer>();

        for(int i = 0; i < m; i++)
            finalArray.add(nums1[i]);

        for(int i = 0; i < n; i++)
            finalArray.add(nums2[i]);

        for(int i = 0; i < m + n; i++)
            nums1[i] = finalArray.poll();
    }
}
