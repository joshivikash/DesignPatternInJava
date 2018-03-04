package design.behavioral.strategy;

import java.util.Arrays;

public class Sorting {
    enum SORTING_ALGO {
        INSERTION_SORT, MERGE_SORT, QUICK_SORT
    }

    static void sort(int[] arr, SORTING_ALGO algo) {
        System.out.println(algo);
        long startTime = System.nanoTime();
        switch (algo) {
        case INSERTION_SORT:
            insertionSort(arr);
            break;
        case MERGE_SORT:
            arr = mergeSort(arr);
            break;
        case QUICK_SORT:
            quickSort(arr, arr.length - 1, 0);
        default:
            break;
        }
        long endTime = System.nanoTime();
        System.out.println(Arrays.toString(arr));;
        System.out.println("Total time taken in nano secs " + (endTime - startTime));
    }

    private static void quickSort(int[] arr, int endIndex, int startIndex) {
        if (startIndex > endIndex) {
            return;
        }
        int pivotIndex = partition(arr, endIndex, startIndex);
        quickSort(arr, pivotIndex - 1, 0);
        quickSort(arr, endIndex, pivotIndex + 1);
    }

    private static int partition(int[] arr, int pivotIndex, int startIndex) {
        int pivotElement = arr[pivotIndex];
        int i = pivotIndex;
        for (int j = i - 1; j >= startIndex; j--) {
            if (arr[j] > pivotElement) {
                i--;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int t = arr[i];
        arr[i] = pivotElement;
        arr[pivotIndex] = t;
        return i;
    }

    private static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int count = (arr.length % 2 == 0) ? 0 : 1;
        int[] arr1 = new int[arr.length / 2 + count];
        int[] arr2 = new int[arr.length / 2];
        for (int i = 0, j = arr.length / 2; i < arr.length / 2; i++, j++) {
            arr1[i] = arr[i];
            arr2[i] = arr[j];
        }
        if (count == 1) {
            arr1[arr.length / 2] = arr[arr.length / 2 + 1];
        }
        arr1 = mergeSort(arr1);
        arr2 = mergeSort(arr2);
        return merge(arr1, arr2);
    }

    private static int[] merge(int[] arr1, int[] arr2) {
        int[] mergedArr = new int[arr1.length + arr2.length];
        int arr1Length = arr1.length;
        int arr2Length = arr2.length;
        int count1 = 0, count2 = 0, count = 0;
        while (arr1Length > count1 || arr2Length > count2) {
            boolean isElementFromFirstArray = false;
            boolean isAnyOneArrayHasCompleted = (arr1Length > count1 && arr2Length > count2) ? false : true;
            if (isAnyOneArrayHasCompleted) {
                isElementFromFirstArray = arr1Length > count1;
            } else {
                isElementFromFirstArray = arr1[count1] < arr2[count2];
            }
            mergedArr[count++] = isElementFromFirstArray ? arr1[count1++] : arr2[count2++];
        }
        return mergedArr;
    }

    /**
     * Here the loop invariant is that the array before the key should always be
     * sorted
     * 
     * @param int
     *            []
     */
    private static void insertionSort(int[] array) {
        for (int j = 1; j < array.length; j++) {
            int i = j - 1;
            int key = array[j];
            while (i >= 0 && key < array[i]) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }
}
