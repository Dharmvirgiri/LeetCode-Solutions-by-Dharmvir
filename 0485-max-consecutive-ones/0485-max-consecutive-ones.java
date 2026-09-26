class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int yes = 0;
        int max = 0;
        for(int i = 0 ; i < nums.length ; i ++)
        {
            if(nums[i]==1)
            {
                yes++;
                if(yes>max){
                    max = yes;
                } 
            }
            else{
                yes = 0;
            }
        }
        return max;
    }
}
