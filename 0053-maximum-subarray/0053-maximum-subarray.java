class Solution {
    public int maxSubArray(int[] nums) {
        return helper(nums,0,nums.length-1);}
        public int helper(int[] nums,int start,int end){
            int mid=start+(end-start)/2;
            if(start==end){
                return nums[start];
            }
            int left=helper(nums,start,mid);
            int right=helper(nums,mid+1,end);
                int sum=0;
                int rightmax=Integer.MIN_VALUE;
                for(int i=mid+1;i<=end;i++){
                    sum+=nums[i];
                    rightmax=Math.max(sum,rightmax);
                    }
                int sum2=0;
                int leftmax=Integer.MIN_VALUE;
                for(int i=mid;i>=start;i--){
                    sum2+=nums[i];
                    leftmax=Math.max(sum2,leftmax);}
                int cross=leftmax+rightmax;
                return Math.max(left,Math.max(right,cross));
        }
    }
