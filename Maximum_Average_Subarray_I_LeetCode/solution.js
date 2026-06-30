class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = 0;
        double currentSum = 0;
        for(int i = 0; i < k ; i++){
            currentSum += nums[i];
        }
        max = currentSum;

        for(int i = k; i < nums.length; i++){
            currentSum = currentSum-nums[i-k]+nums[i];
            if (currentSum > max){
                max = currentSum;
            }
        }
        return max/k;
    }
