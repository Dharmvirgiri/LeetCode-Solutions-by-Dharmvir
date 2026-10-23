class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1 , i = 0 , n = nums.length;
        while(j < n){
            if(nums[i]==nums[j]){
                j++;
            }else{
                nums[++i] = nums[j++];
            }
        }
        return i+1;
    }
}