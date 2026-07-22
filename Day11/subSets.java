class Solution {
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
          
        backtrack(nums,new ArrayList<>(),0);

        return list;
    }

    public void backtrack(int[] nums,List<Integer> current,int index){

        list.add(new ArrayList<>(current));
        for(int i=index;i<nums.length;i++){
            current.add(nums[i]);

            backtrack(nums,current,i+1);

            current.remove(current.size() - 1);
        }
    }
}