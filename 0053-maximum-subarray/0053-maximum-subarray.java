class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=nums[0];
        int curSum=Math.max(0,maxSum);
        for(int i=1;i<nums.length;i++)
        {
            
         curSum+=nums[i];
         maxSum=Math.max(maxSum,curSum);
              if(curSum<0)
                curSum=0;
        }
        return maxSum;
            
        
    }
}