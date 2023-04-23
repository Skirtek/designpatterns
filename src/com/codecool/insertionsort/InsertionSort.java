package com.codecool.insertionsort;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            // We check elements in sorted
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            // Element is bigger than all sorted elements, it will be last sorted
            arr[j + 1] = key;
        }
    }
}
