package com.codecool.quicksort;

public class QuickSortRunner {
    public static void run(){
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        System.out.println("Array before sorting: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        int n = arr.length;
        QuickSort.quickSort(arr, 0, n - 1);
        System.out.println("Array after sorting: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
