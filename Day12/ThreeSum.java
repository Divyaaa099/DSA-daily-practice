import java.util.ArrayList;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list= new ArrayList<>();

      Arrays.sort(nums);

    for(int i=0;i<nums.length-2;i++){
        int left=i+1;
        int right=nums.length-1;
         if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }

        while(left<right){
            int sum=nums[i]+nums[left]+nums[right];
           
            if(sum==0){
                List<Integer> ans=new ArrayList<>();
                ans.add(nums[i]);
                ans.add(nums[left]);
                ans.add(nums[right]);

                left++;
                right--;

                if(!list.contains(ans)){
                    list.add(ans);
                }
            }
            else if(sum<0){
                left++;
            }
            else{
                right--;
            }
            
        }
    }
        return list;
    }
}