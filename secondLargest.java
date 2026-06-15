/*

<---------------------------------------------------BRUTE Solution-------------------------------------------------------->

import java.util.Arrays;

public class secondLargest {

    public static int seclargest(int arr[], int n) {
        Arrays.sort(arr);

        int largest = arr[n - 1];
        int secondlargest = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                secondlargest = arr[i];
                break;
            }
        }

        return secondlargest;
    }

    public static void main(String[] args) {
        int[] arr = {18, 2, 8, 1, 9};

        int result = seclargest(arr, arr.length);

        System.out.println("Second Largest = " + result);
    }
}



//<---------------------------------------Better Approach---------------------------------------->


public class secondLargest {

    public static int seclargest(int arr[], int n) {
        int largest = arr[0];
        for (int i = 1;i<n;i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        int secondlargest = -1;
        for (int i = 0; i < n; i++) {
            if(arr[i]!=largest && (secondlargest==-1 || arr[i]>secondlargest)){
                secondlargest=arr[i];
            }
        }
        return secondlargest;
    }
    public static void main(String[] args) {
        int[] arr = {18, 2, 8, 1, 9};
        int result = seclargest(arr, arr.length);
        System.out.println("Second Largest = " + result);
    }
}

<-----------------------------------------Efficient Approach ----------------------------------------------->


*/
import java.util.Scanner;

public class secondLargest {

    public static int seclargest(int arr[], int n) {
        int largest = arr[0];
        int secondlargest = -1;

        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            }
            else if (arr[i] != largest &&
                    (secondlargest == -1 || arr[i] > secondlargest)) {
                secondlargest = arr[i];
            }
        }
        return secondlargest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = seclargest(arr, arr.length);
        System.out.println("Second Largest = " + result);

        sc.close();
    }
}