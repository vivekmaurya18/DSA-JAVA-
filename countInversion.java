/* 

====================>Brute Force<==========================

class countInversion{
    public static int Inversion(int[] arr){

        int n=arr.length;

        int count=0;

        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i] > arr[j]){
                    count+=1;
                }
                
            }
            
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={5,3,2,4,1};

        int result=Inversion(arr);

        System.out.println(result);
    }
}

*/

// ======================>Optimal Solution<=======================


class countInversion {

    public static int countInversion(int[] arr) {
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

        // Merge and count inversions
        count += merge(arr, low, mid, high);

        return count;
    }

    public static int merge(int[] arr, int low, int mid, int high) {

        int[] temp = new int[high - low + 1];

        int i = low;
        int j = mid + 1;
        int k = 0;

        int count = 0;

        while (i <= mid && j <= high) {

            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                k++;
                i++;
            } 
            else {
                temp[k] = arr[j];
                k++;
                j++;

                // All remaining elements in left half
                // will be greater than arr[j-1]
                count += mid - i + 1;
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= high) {
            temp[k++] = arr[j++];
        }

        // Copy temp back into original array
        for (int x = 0; x < temp.length; x++) {
            arr[low + x] = temp[x];
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {5, 3, 2, 4, 1};

        int result = countInversion(arr);

        System.out.println("Number of inversions: " + result);
    }
}