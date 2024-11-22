import java.util.*;

public class Main {
    public static int inv = 0;

    public static void main(String[] args) {

        int[] nums = {3,2,3};

        System.out.println(majorityElement(nums));
    }

    public static void setZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        boolean firstRowHasZero = false;
        boolean firstColHasZero = false;

        for (int i = 0; i < r; i++) {
            if (matrix[i][0] == 0) {
                firstRowHasZero = true;
                break;
            }
        }
        for (int i = 0; i < c; i++) {
            if (matrix[0][i] == 0) {
                firstColHasZero = true;
                break;
            }
        }

        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < r; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 1; j < c; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int j = 1; j < c; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 1; i < r; i++) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (firstRowHasZero) {
            for (int j = 0; j < c; j++) {
                matrix[0][j] = 0;
            }
        }
        if (firstColHasZero) {
            for (int i = 0; i < r; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    public static int majorityElement(int[] nums) {
        Hashtable<Integer, Integer> dict= new Hashtable<>();
        int max = 0, result = 0;
        for (int num : nums) {
            if (dict.containsKey(num))
                dict.put(num, dict.get(num) + 1);
            else
                dict.put(num, 1);

            if(dict.get(num) > max) {
                max = dict.get(num);
                result = num;
            }
        }

        return result;
    }
}
