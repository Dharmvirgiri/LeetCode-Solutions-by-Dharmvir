class Solution {
    public int missingMultiple(int[] nums, int k) {
            TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]%k==0){
                set.add(nums[i]);
            }
        }
        int temp = k ;
        for(int n : set){
            if(n!=k){
                return k;
            }else{
                k = k + temp ;
            }
        }
        return k;
    }
}