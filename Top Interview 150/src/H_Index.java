public class H_Index {
    private void quickSort(int[] citations, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(citations, left, right);
            quickSort(citations, left, pivotIndex - 1);
            quickSort(citations, pivotIndex + 1, right);
        }
    }

    // Partition method for quick sort
    private int partition(int[] citations, int left, int right) {
        int pivot = citations[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (citations[j] >= pivot) {
                i++;
                swap(citations, i, j);
            }
        }
        swap(citations, i + 1, right);
        return i + 1;
    }

    // Swap elements in the array
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int hIndex(int[] citations) {
        int n = citations.length;

        quickSort(citations, 0, n - 1);

        int hIndex = 0;
        for (int i = 0; i < n; i++) {
            if (citations[i] >= i + 1)
                hIndex = i + 1;
            else
                break;
        }

        return hIndex;
    }
}
