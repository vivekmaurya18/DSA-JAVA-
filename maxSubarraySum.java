class maxSubarraySum{
    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int maxi = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>maxi){
                maxi=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int[] nums={-2,-3,4,-1,-2,1,5,-3};

        int result=maxSubArray(nums);

        System.out.println(result);
    }
}