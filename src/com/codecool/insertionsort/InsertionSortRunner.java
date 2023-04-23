package com.codecool.insertionsort;

public class InsertionSortRunner {
    public static void run() {
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        System.out.println("Array before sorting: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        InsertionSort.insertionSort(arr);
        System.out.println("Array after sorting: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
