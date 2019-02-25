package com.company;

public class Main {

//    Given a sorted array arr[] of n elements, write a function to search a given element x in arr[].

//    Binary Search: Search a sorted array by repeatedly dividing the search interval in half.
//    Begin with an interval covering the whole array. If the value of the search key is less
//    than the item in the middle of the interval, narrow the interval to the lower half. Otherwise
//    narrow it to the upper half. Repeatedly check until the value is found or the interval is empty.

//    The idea of binary search is to use the information that the array is sorted and reduce the time
//    complexity to O(Log n).

    public static void main(String[] args) {
        // write your code here

        int[] a = {2, 3, 4, 10, 40};
        int x = 5;

        int index = binarySearch(a, x);

        if (index == -1) {
            System.out.println("Element not found");
        } else if(a[index] == x){
            System.out.println("Element found at " + index);
        }

    }

    public static int binarySearch(int[] A, int x) {
        int lo = 0;
        int high = A.length - 1;

        while (high >= lo) {
            int mid = (lo + high) / 2;
            if (x == A[mid]) { // If key is at the mid point, return the mid index.
                return mid;
            }else if (x > A[mid]) { // If key is located in the sub array greater than mid, set lo pointer to mid + 1 to search only the second sub array.
                lo = mid + 1;
            }else if (x < A[mid]){ // If key is located in the sub array less than mid, set the high pointer to mid - 1 to search only the first sub array.
                high = mid - 1;
            }
        }
        return -1;
    }

    // Array must be sorted in order for binary search to efficiently execute.
}
