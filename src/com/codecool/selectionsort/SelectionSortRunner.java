package com.codecool.selectionsort;

public class SelectionSortRunner {
    public static void run(){
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        System.out.println("Array before sorting: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        SelectionSort.selectionSort(arr);
        System.out.println("Array after sorting: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
