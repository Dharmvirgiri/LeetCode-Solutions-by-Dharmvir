class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(nums.length <= 1){
            return 0;
        }
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        for(int left = 0 ; left + k - 1 < nums.length ; left++){
            int right = left + k - 1;
            min = Math.min(min,nums[right]-nums[left]);
        }
        return min;
    }
}