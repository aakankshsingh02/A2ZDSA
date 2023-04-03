class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map= new HashMap();
        
        
        for(int i=0;i<nums.length;i++)
        { 
            map.putIfAbsent(nums[i],i);
        }
            for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int s= target-num;
            if (map.containsKey(s)){
            int index= map.get(s);
               if(index==i)continue;
               return new int[]{i,index};
            }
               
        }
        return new int[]{};
    }
}