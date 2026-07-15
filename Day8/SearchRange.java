class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            if(nums[left]!=target){
                left++;
            }
            else if(nums[right]!=target){
                right--;
            }
            else if(nums[left]==nums[right]){
                return new int[]{left,right};
            }
        }
        return new int[]{-1,-1};
    }
}