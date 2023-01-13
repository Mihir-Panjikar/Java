package com.Problems;

//finding the count of rotations in a rotation array
public class Rotation_Count_Rotated_array {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int[] arr2 = {3, 4, 5, 6, 7, 1, 2};
        int ans = search(arr);
        System.out.println(ans);
    }

    static int search(int[] arr) {
        int pivot = FindPivot_Duplicate_values(arr);
        return pivot + 1;
    }

    // this will not work in duplicate values
    static int FindPivot(int[] arr) {
        int start =  0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            //4 cases
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if (arr[start] <= arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }

    // this will work in duplicate values

    static int FindPivot_Duplicate_values(int[] arr) {
        int start =  0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            //4 cases
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            //if element at middle, start, end are equal then skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                //skip the duplicates

                //NOTE: what if these elements at start and end were the pivot?
                //check if start is pivot
                if (arr[start] > arr[start+1]) {
                    return start;
                }
                start ++;

                //check if end is pivot
                if (arr[end] < arr[end-1]){
                    return end - 1;
                }
                end --;
            }
            // left side is sorted, so pivot should be in right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }

        }
        return -1;
    }


}
