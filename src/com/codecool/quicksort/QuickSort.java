package com.codecool.quicksort;

public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        // If collection has only one element, stop partitioning and sorting
        if (low < high) {
            int pivotIdx = partition(arr, low, high);
            // Sort recursive first part
            quickSort(arr, low, pivotIdx - 1);
            // Sort recursive second part
            quickSort(arr, pivotIdx + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        // Get last element as pivot
        int pivot = arr[high];
        int i = low - 1;
        // We divide our collection in two collections
        // First = all elements lower or equal pivot
        // Second - all elements greater than pivot
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}
