/*
======================>Brute Approach<===================

import java.util.Arrays;
class reversePairs{
    public static int Pairs(int[] arr){
        int n=arr.length;
        int count=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>2*arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr={1,3,2,3,1};

        int ans=Pairs(arr);

        System.out.println(ans);
    }
}

*/

// ===========================>Optimal Solution<=========================

class reversePairs {

    public static int Pairs(int[] arr) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    public static int mergeSort(int[] arr, int low, int high) {

        int count = 0;

        if (low >= high) {
            return count;
        }

        int mid = low + (high - low) / 2;

        // Left half
        count += mergeSort(arr, low, mid);

        // Right half
        count += mergeSort(arr, mid + 1, high);

        // Count reverse pairs
        count += countPairs(arr, low, mid, high);

        // Merge both sorted halves
        merge(arr, low, mid, high);

        return count;
    }

    public static int countPairs(int[] arr, int low, int mid, int high) {

        int j = mid + 1;
        int count = 0;

        for (int i = low; i <= mid; i++) {

            while (j <= high && (long) arr[i] > 2L * arr[j]) {
                j++;
            }

            count += j - (mid + 1);
        }

        return count;
    }

    public static void merge(int[] arr, int low, int mid, int high) {

        int[] temp = new int[high - low + 1];

        int i = low;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= high) {

            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= high) {
            temp[k++] = arr[j++];
        }

        for (int x = 0; x < temp.length; x++) {
            arr[low + x] = temp[x];
        }
    }

    public static void main(String[] args) {

        int[] arr = {1,3,2,3,1};

        int result = Pairs(arr);

        System.out.println("Number of reverse pairs: " + result);
    }
}