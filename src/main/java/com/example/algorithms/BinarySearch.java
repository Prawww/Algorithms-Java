package com.example.algorithms;

import java.util.List;
import java.util.ArrayList;

class BinarySearch {
    private int list[];
    private int target;

    public BinarySearch(int list[], int target) {
        this.list = list;
        this.target = target;
    }

    public static int search(int[] list, int target) {
        int first = 0;
        int last = list.length - 1;

        while (first <= last) {
            int midpoint = first + (last - first) / 2; // Prevent overflow

            if (list[midpoint] == target) {
                return midpoint; // Target found, return index
            } else if (list[midpoint] < target) {
                first = midpoint + 1; // Search right half
            } else {
                last = midpoint - 1; // Search left half
            }
        }
        return -1; // Target not found
    }

    // Public method to start the search
    public static int binarySearch(int[] arr, int target) {
        return binarySearchHelper(arr, target, 0, arr.length - 1);
    }

    // Private recursive helper function
    private static int binarySearchHelper(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1; // Base case: target not found
        }

        int mid = left + (right - left) / 2; // Prevents overflow

        if (arr[mid] == target) {
            return mid; // Element found
        } else if (arr[mid] > target) {
            return binarySearchHelper(arr, target, left, mid - 1); // Search left
        } else {
            return binarySearchHelper(arr, target, mid + 1, right); // Search right
        }
    }
}