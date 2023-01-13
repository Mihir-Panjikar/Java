package com.Problems;

//eg : arr = [1 ,2 ,3 ,5 ,7 ,6 ,3 ,2 ] increasing then decreasing order peak
//Finding an element in the mountain array
public class Find_in_Mountain_array_Leet {
    public static void main(String[] args) {
        int[] arr = {1 ,2 ,3 ,5 ,7 ,6 ,3 ,2 };
        int ans = search(arr,3);
        System.out.println(ans);
    }

    static int search(int[] arr,int target) {
        int peak = SearchInMountain(arr);
        int firstTry = OrderAgnosticBS(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        //try to search in second half
        return OrderAgnosticBS(arr, target, peak+1, arr.length-1);


    }
    static int SearchInMountain(int[] arr) {
        int start =  0;
        int end = arr.length - 1;

        while (start < end) {
//            int mid = (start + end)/2;
            int mid = start + (end - start) / 2; // better method to get mid value

            if (arr[mid] < arr[mid+1]) {
                // Increasing part of array, mid+1 element > mid-element
                start = mid + 1;

            }

            else {
                //Decreasing part of array, potential ans, end = mid and hence end != mid-1
                end = mid;

            }

            //In the end, start == end and pointing to the largest number because of the 2 checks above
            //start and end are always trying to find max element in the above 2 checks
            //hence, when they are pointing to just one element, that is the max one because that is what the checks say
            //more elaboration: at every point of time for start and end, they have the best possible answer till that time
            //and if we are saying that only one item is remaining, hence cause of above line that is the best possible answer
        }
        // We can return start or end as start == end
        return start;
    }

    static int OrderAgnosticBS(int[] arr, int target, int start, int end) {

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (arr[mid] < target) {
                    start = mid + 1;
                }

                else {
                    end = mid - 1;
                }
            }

            else {
                if (arr[mid] > target) {
                    start = mid + 1;
                }

                else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}
