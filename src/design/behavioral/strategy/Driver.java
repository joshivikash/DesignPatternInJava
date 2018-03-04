package design.behavioral.strategy;

import design.behavioral.strategy.Sorting.SORTING_ALGO;

public class Driver {
    public static void main(String[] args) {
        int[] arr = {3, 2, 6, 8, 1, 21, 4, 0, 345, 10, 35};
        Sorting.sort(arr, SORTING_ALGO.MERGE_SORT);
        Sorting.sort(arr, SORTING_ALGO.INSERTION_SORT);
        Sorting.sort(arr, SORTING_ALGO.QUICK_SORT);
    }
}
