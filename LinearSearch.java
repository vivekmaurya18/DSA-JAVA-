import java.util.Scanner;

public class LinearSearch {
    public static int Search(int[] arr, int k){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==k){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        // Create array
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Element to search
        System.out.print("Enter element to search: ");
        int k = sc.nextInt();

        // Linear search
        int result = Search(arr, k);

        System.out.println("Index: " + result);
    }
}
