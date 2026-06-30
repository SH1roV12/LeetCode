class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if ( k == 0){
            return false;
        }
        HashSet<Integer> uniq = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            if(uniq.contains(nums[i])){
                return true;
            }
            if (i >= k){
                uniq.remove(nums[i-k]);
            }

            uniq.add(nums[i]);
           

        }
 
        return false;
    }
}