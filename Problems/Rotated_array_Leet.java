package com.Problems;


//finding an element in a rotated array
public class Rotated_array_Leet {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int ans = search(arr,10);
        System.out.println(ans);
    }

    static int search(int[] arr,int target) {
        int pivot = FindPivot(arr);
        // if you didn't find a pivot, it means the array is not rotated
        if (pivot == -1) {
            //just do normal binary search
            return Binary(arr,target,0, arr.length-1);
        }

        //if pivot is found, we have 2 ascending sorted arrays
        else {
            if (target > arr[0]) {
                return Binary(arr, target, 0, pivot);
            }
            //try to search in second ascending sorted half
            return Binary(arr, target, pivot + 1, arr.length - 1);
        }


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

    static int Binary(int[] arr, int target, int start, int end) {
        while (start <= end) {
//            int mid = (start + end)/2;
            int mid = start + (end - start) / 2; // better method to get mid value

            if (arr[mid] == target) {
                return mid;
            }

            else if (arr[mid] < target) {
                start = mid + 1;
            }

            else if (arr[mid] > target) {
                end = mid - 1;
            }
        }

        return -1;
    }

}
