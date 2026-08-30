class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        int min=nums[0];
        int max=nums[0];
        for(int j=0;j<nums.length;j++){
            if(max<nums[j]){
                max=nums[j];
            }
        }
        for(int j=0;j<nums.length;j++){
            if(min>nums[j]){
                min=nums[j];
            }
        }
         for (int num : nums) {
           mp.put(num, 1);
         }
        for(int i=min;i<=max;i++){
            if(!mp.containsKey(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}