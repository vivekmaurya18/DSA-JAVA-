public class CheckArraySorted {
    public static boolean  isSorted(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            if(arr[i]>=arr[i-1]){
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        boolean result=isSorted(arr,arr.length);
        System.err.println("Sorted Arrays = " +result);
    }
    
}
