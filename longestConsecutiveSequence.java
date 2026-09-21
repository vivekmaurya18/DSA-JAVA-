/*
//=====================================>BRUTE APPROACH<======================================
public class longestConsecutiveSequence {
    public static boolean LinearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static int longestConsecutive(int[] arr){
        int longest=1;

        for (int i = 0; i < arr.length; i++) {
            int current=arr[i];
            int count=1;
            while(LinearSearch(arr,current+1)==true){
                current++;
                count++;
            }
            longest=Math.max(longest,count);
        }
        return longest;
    }
    public static void main(String[] args) {
        int[] arr={102,4,100,1,101,3,2,1,1};
        int result=longestConsecutive(arr);
        System.out.println(result);
    }
    
}


import java.util.Arrays;

class Solution {

    public int longestConsecutive(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int longest = 1;
        int lastSmallest=Integer.MIN_VALUE;
        int countCurrent = 0;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i]-1 ==lastSmallest) {
                countCurrent++;
                lastSmallest=nums[i];
            }
            else if (nums[i] != lastSmallest) {
                countCurrent=1;
                lastSmallest=nums[i];
            } 
            else {
                countCurrent = 1;
            }
            longest = Math.max(longest, countCurrent);
        }

        return longest;
    }
    public static void main(String[] args) {
        int[] arr={102,4,100,1,101,3,2,1,1};
        int result=new Solution().longestConsecutive(arr);
        System.out.println(result);
    }
    
}

*/

import java.util.HashSet;

class Solution {

    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {

            // num is the starting point
            if (!set.contains(num - 1)) {

                int current = num;
                int count = 1;

                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}