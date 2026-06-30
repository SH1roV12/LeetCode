class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if ( k == 0){
        for (int i = 0; i < nums.length; i++){
            if(uniq.contains(nums[i])){
                return true;
            }
            if (i >= k){
                uniq.remove(nums[i-k]);
            }

            uniq.add(nums[i]);
           

        HashSet<Integer> uniq = new HashSet<>();
            return false;
        }
