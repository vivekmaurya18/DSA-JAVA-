/* 
public class MissingArrayNumber {
    public static int missingNumber(int[] arr) {
        int n = arr.length;

        for (int i = 1; i <= n; i++) {

            int flag = 0;

            for (int j = 0; j < n; j++) {

                if (arr[j] == i) {
                    flag = 1;
                    break;
                }
            }

            if (flag==0) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {

        // MissingArrayNumber obj = new MissingArrayNumber();

        int[] arr = {1, 2, 4, 5};

        int result = missingNumber(arr);

        System.out.println("Missing number: " + result);
    }
}
 
// ------------------------------------->Better Approach<------------------------------------

public class MissingArrayNumber {
    public static int missingNumber(int[] arr) {
        int n = arr.length+1;

        int[] hash=new int[n+1];

       for (int i = 0; i < arr.length; i++) {
            hash[arr[i]] = 1;
        }

        // Find the number that does not exist
        for (int i = 1; i <= n; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5};

        System.out.println(missingNumber(arr));
    }
}
*/

// ------------------------------------->Optimal Approach<--------------------------------------

public class MissingNumber { 
 
    public static int missingNumber(int[] arr) { 
        int xor = 0; 
        int n = arr.length; 
 
        for (int i = 0; i < n; i++) { 
            xor = xor ^ i; 
            xor = xor ^ arr[i]; 
        } 
 
        xor = xor ^ n; 
 
        return xor; 
    } 
 
    public static void main(String[] args) { 
        int[] arr = {3, 0, 1}; 
 
        System.out.println("Missing number = " + missingNumber(arr)); 
    } 
}