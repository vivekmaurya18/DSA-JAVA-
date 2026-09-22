/* 
======================================>BRUTE APPROACH<==============================================

public class MajorityElement {
    public static int majorityElement(int[] arr,int n){
        for (int i = 0; i < n; i++) {
            int count=0;
            for (int j = 0; j < n; j++) {
                if(arr[j]==arr[i]){
                    count++;

                }
                if(count>n/2){
                    return arr[i];
                }
                
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={2,2,3,3,1,3,3,3,2,2,3};
        int n=arr.length;
        int result=majorityElement(arr, n);
        System.out.println(result);

    }
}


===========================================> BETTER APPROACH <=========================================

import java.util.HashMap;

public class MajorityElement {

    public static int majorityElement(int[] arr) {

        int n = arr.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            if (map.get(arr[i]) > n / 2) {
                return arr[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {2, 2, 3, 3, 1, 3, 3, 3, 2, 2};

        int result = majorityElement(arr);

        System.out.println(result);
    }
}

    */

// =====================================>OPTIMAL APPROACH<============================
//================================>MOORE'S VOTING ALGORITHM<===================================
public class MajorityElement {

    public static int majorityElement(int[] arr) {

        int candidate = 0;
        int count = 0;

        // Step 1: Find candidate
        for (int i = 0; i < arr.length; i++) {

            if (count == 0) {
                candidate = arr[i];
            }

            if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Step 2: Verify candidate
        count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == candidate) {
                count++;
            }
        }

        if (count > arr.length / 2) {
            return candidate;
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {2, 2, 3, 3, 1, 2, 2};

        System.out.println(majorityElement(arr));
    }
}