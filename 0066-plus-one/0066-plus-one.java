class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        int j=n-1;
        int[] ans = new int[n + 1];
        ans[0]=1;
        while(j>=0){
        if(digits[j]<9){
            digits[j]=digits[j]+1;
            return digits;
        }                                                                                                            
        else if(digits[j]==9){
                digits[j]=(digits[j]+1)%10;//0
                ans[j+1]=digits[j];
                j--;
        }
        }
        return ans;
    }
}