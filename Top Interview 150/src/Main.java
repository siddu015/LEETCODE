import java.util.*;

public class Main {
    public static int inv = 0;
    public static void main(String[] args) {

        var text = new TextJustification();
        String[] words =  {"Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"};
        int maxWidth = 20;


        long[] nums = {2, 5, 1, 3, 4};
        long res = getInversions(nums, 5);
        System.out.println(res);
    }


    public static void setZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        boolean firstRowHasZero = false;
        boolean firstColHasZero = false;

        for (int i = 0; i < r; i++) {
            if(matrix[i][0] == 0) {
                firstRowHasZero = true;
                break;
            }
        }
        for (int i = 0; i < c; i++) {
            if(matrix[0][i] == 0) {
                firstColHasZero = true;
                break;
            }
        }

        for(int i = 1; i < r; i++) {
            for(int j = 1; j < c; j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i = 1; i < r; i++) {
            if(matrix[i][0] == 0) {
                for(int j = 1; j < c; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for(int j = 1; j < c; j++) {
            if(matrix[0][j] == 0) {
                for(int i = 1; i < r; i++) {
                    matrix[i][j] = 0;
                }
            }
        }

        if(firstRowHasZero) {
            for(int j = 0; j < c; j++) {
                matrix[0][j] = 0;
            }
        }
        if(firstColHasZero) {
            for(int i = 0; i < r; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    public static long inversions = 0;
    public static long getInversions(long[] arr, int n) {

        sort(arr, 0, n - 1);

        return inversions;
    }

    static void sort(long[] arr, int l, int r)
    {
        if (l < r) {

            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    static void merge(long[] arr, int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temp arrays
        long L[] = new long[n1];
        long R[] = new long[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        // Merge the temp arrays

        // Initial indices of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                inversions += (n1 - i);
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }}
