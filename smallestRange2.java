import java.util.*;
class smallestRange2 {
    public static int smallestRange(int[] nums, int k) {
        int n=nums.length;
        
        Arrays.sort(nums);
        int ans=nums[n-1]-nums[0];
        
        for(int i=1;i<n;i++){
            int minHeight = Math.min(nums[0] + k, nums[i] - k);

            int maxHeight = Math.max(nums[n - 1] - k,nums[i - 1] + k);

            ans = Math.min(ans, maxHeight - minHeight);
        }
        return ans;
        
    }
    public static void main(String[] args) {
        int[] nums={1,3,6};
        int k=3;
        int result=smallestRange(nums,k);
        System.out.println(result);
    }
}