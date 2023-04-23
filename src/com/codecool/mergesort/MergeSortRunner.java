package com.codecool.mergesort;

import java.util.Arrays;

public class MergeSortRunner {
    public static void run(){
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        System.out.println("Original Array: " + Arrays.toString(arr));

        MergeSort.mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
