
// ===============================>Optimal Solution<===============================================

import java.util.Arrays;

public class rearrangementArrayElementBySign {
    public static int[] rearrangementArray(int[] nums){
        int n=nums.length;
        int[] ans=new int[n];

        int posIndex=0;
        int negIndex=1;

        for (int i = 0; i < n; i++) {
            if(nums[i]<0){
                ans[negIndex]=nums[i];
                negIndex+=2;
            }
            else{
                ans[posIndex]=nums[i];
                posIndex+=2;
            }
            
        }
        return ans;

    }
    public static void main(String[] args) {
        
        int[] nums={3,1,-2,-5,2,-4};

        int[] result=rearrangementArray(nums);

        System.out.println(Arrays.toString(result));
    }
    
}

/*

============================================>Brute Approach<===========================================

class Solution {
    public int[] rearrangeArray(int[] nums) {

        int n = nums.length;

        int[] positive = new int[n / 2];
        int[] negative = new int[n / 2];

        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {

            nums[2*i]=positive[i];
            nums[2*i+1]=negative[i];

        }

        return ans;
    }
}

*/