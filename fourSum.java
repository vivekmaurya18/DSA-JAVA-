/*
// Brute force

import java.util.*;

class fourSum{
    public static List<List<Integer>> fourSum(int[] nums, int target){

        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j< n; j++) {
                for (int k = j+1; k < n; k++) {
                    for (int l = k+1; l < n; l++) {
                        long sum=(long)nums[i]+nums[j];

                        sum+=nums[k];
                        sum+=nums[l];

                        if(sum==target){
                            List<Integer> temp=Arrays.asList(
                                nums[i],
                                nums[j],
                                nums[k],
                                nums[l]
                            );
                            Collections.sort(temp);

                            ans.add(temp);

                        }
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums={1,0,-1,0,-2,2};
        int target=0;

        List<List<Integer>> result=fourSum(nums, target);
        System.out.println(result);
    }
}

// Better Approach

import java.util.*;

class fourSum {

    public static List<List<Integer>> fourSum(int[] nums, int target) {

        Set<List<Integer>> st = new HashSet<>();

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                Set<Long> hashset = new HashSet<>();

                for (int k = j + 1; k < n; k++) {

                    long sum = (long) nums[i] + nums[j] + nums[k];

                    long fourth = (long) target - sum;

                    if (hashset.contains(fourth)) {

                        List<Integer> temp = Arrays.asList(
                            nums[i],
                            nums[j],
                            nums[k],
                            (int) fourth
                        );

                        Collections.sort(temp);

                        st.add(temp);
                    }

                    hashset.add((long) nums[k]);
                }
            }
        }

        return new ArrayList<>(st);
    }

    public static void main(String[] args) {

        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;

        List<List<Integer>> result = fourSum(nums, target);

        System.out.println(result);
    }
}

*/

// Optimal Approach

import java.util.*;

class fourSum {

    public static List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> ans = new ArrayList<>();

        int n = nums.length;

        Arrays.sort(nums);

        for (int i = 0; i < n - 3; i++) {

            // Skip duplicate first number
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < n - 2; j++) {

                // Skip duplicate second number
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int left = j + 1;
                int right = n - 1;

                while (left < right) {

                    long sum = (long) nums[i]
                             + nums[j]
                             + nums[left]
                             + nums[right];

                    if (sum == target) {

                        ans.add(Arrays.asList(
                            nums[i],
                            nums[j],
                            nums[left],
                            nums[right]
                        ));

                        left++;
                        right--;

                        // Skip duplicate left values
                        while (left < right &&
                               nums[left] == nums[left - 1]) {
                            left++;
                        }

                        // Skip duplicate right values
                        while (left < right &&
                               nums[right] == nums[right + 1]) {
                            right--;
                        }

                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;

        List<List<Integer>> result = fourSum(nums, target);

        System.out.println(result);
    }
}