package com.Problems;

//eg : arr = [1 ,2 ,3 ,5 ,7 ,6 ,3 ,2 ] increasing then decreasing order peak
public class Bitonic_array_or_Mountain_array_Leet {
    public static void main(String[] args) {
        int[] arr = {1 ,2 ,3 ,5 ,7 ,6 ,3 ,2 };
        int ans = Binary(arr);
        System.out.println(ans);
    }

    static int Binary(int[] arr) {
        int start =  0;
        int end = arr.length - 1;

        while (start < end) {
//            int mid = (start + end)/2;
            int mid = start + (end - start) / 2; // better method to get mid value

            if (arr[mid] > arr[mid+1]) {
                //Decreasing part of array, potential ans, end = mid and hence end != mid-1
                end = mid;
            }
            else {
                // Increasing part of array, mid+1 element > mid element
                start = mid + 1;
            }

            //In the end, start == end and pointing to the largest number because of the 2 checks above
            //start and end are always trying to find max element in the above 2 checks
            //hence, when they are pointing to just one element, that is the max one because that is what the checks say
            //more elaboration: at every point of time for start and end, they have the best possible answer till that time
            //and if we are saying that only one item is remaining, hence cause of above line that is the best possible answer
        }

        return start; // We can return start or end as start == end
    }
}
