package com.codecool.binarysearch;

public class BinarySearchRunner {
    public static void run() {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int target = 12;
        int index = BinarySearch.binarySearch(arr, target);
        if (index != -1) {
            System.out.println("Element " + target + " is found at index " + index);
        } else {
            System.out.println("Element " + target + " is not found in the array");
        }
    }
}
